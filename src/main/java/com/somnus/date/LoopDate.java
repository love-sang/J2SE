package com.somnus.date;

import java.util.Calendar;

import org.apache.commons.lang.time.DateFormatUtils;
/**
 * 
 *@Project:J2SE
 *@class:LoopDate
 *@descript:
 *@date:2016年6月8日 下午2:11:58
 *@author San
 *@version:V1.0
 */
public class LoopDate {

	public static void main(String[] args) {
		Calendar reportCalendar = Calendar.getInstance();  
        reportCalendar.set(2015, 2, 1);  
        Calendar endCalendar = Calendar.getInstance();  
        endCalendar.set(2015, 3, 10); 
        while(reportCalendar.compareTo(endCalendar)<=0){
            String reportDate = DateFormatUtils.format(reportCalendar.getTime(), "yyyyMMdd");
            System.out.println(reportDate);
            reportCalendar.add(Calendar.DATE, 1);
        }
	}
}

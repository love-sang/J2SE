package com.somnus.apache;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 *@Project:J2SE
 *@class:CommonsLogging
 *@descript:logger日志
 *@date:2016年6月8日 下午1:51:13
 *@author San
 *@version:V1.0
 */
public class CommonsLogging {

	private static Log log = LogFactory.getLog(CommonsLogging.class);

	public static void main(String[] args) {
		log.error("ERROR");
		log.debug("DEBUG");
		log.warn("WARN");
		log.info("INFO");
		log.trace("TRACE");
		System.out.println(log.getClass());
	}
}

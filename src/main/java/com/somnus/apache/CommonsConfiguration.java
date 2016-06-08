package com.somnus.apache;

import java.util.Iterator;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
/**
 * 
 *@Project:J2SE
 *@class:CommonsConfiguration
 *@descript:
 *@date:2016年6月8日 上午11:47:32
 *@author San
 *@version:V1.0
 */
public class CommonsConfiguration {

	public void configuration(){
		try {
			String url=getClass().getClassLoader().getResource("info.properties").getPath();
			System.out.println("url:"+url);
			PropertiesConfiguration configuration=new PropertiesConfiguration(url);
			configuration.setProperty("age",22);
			configuration.save();
			
			Integer age=configuration.getInt("age");
			String username=configuration.getString("username");
			System.out.println(age);
			System.out.println(username);
			
			for(Iterator<String> it=configuration.getKeys();it.hasNext();){
				String key=it.next();
				String value=configuration.getString(key);
				 System.out.println(key +"="+value);
			}
		} catch (ConfigurationException e) {
			 e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		 CommonsConfiguration config = new CommonsConfiguration();
	     config.configuration();
	}
	
	
	
}

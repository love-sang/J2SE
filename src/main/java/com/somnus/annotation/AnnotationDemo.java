package com.somnus.annotation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 *@Project:J2SE
 *@class:AnnotationDemo
 *@descript:
 *@date:2016年6月8日 上午11:31:39
 *@author San
 *@version:V1.0
 */
public class AnnotationDemo {

	@MethodInfo(author="Somnus",comments="Main method", date="June 23 2016",revision=1)
	public String toString(){
		 return "Overriden toString method";
	}
	
	 @Deprecated
	 @MethodInfo(comments = "deprecated method", date = "June 23 2016")
	 public static void outdatedMethod() {
	        System.out.println("outdated method, don't use it.");
	   }
	
	    @SuppressWarnings("unchecked")
		@MethodInfo(author = "Somnus", comments = "Main method", date = "June 12 2015", revision = 10)
	    public static void genericsTest() throws FileNotFoundException {
			@SuppressWarnings("rawtypes")
			List l = new ArrayList();
	        l.add("abc");
	        outdatedMethod();
	    }
}

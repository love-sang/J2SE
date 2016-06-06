package com.somnus.hashcode;
/**
 * 
 *@Project:J2SE 
 *@class:StringHashCodeDemo 
 *@descript:2个对象相同则用eauals比较，hashcode相同
 *@date:2016年6月6日 下午9:48:14
 *@author San
 *@version:V1.0
 */
public class StringHashCodeDemo {

	public static void main(String[] args) {
		String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
	}
}

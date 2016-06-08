package com.somnus.accessModifier;
/**
 * 
 *@Project:J2SE
 *@class:PassByValueDemo
 *@descript:java只有按值传递，没有按引用传递
 *@date:2016年6月8日 上午11:24:44
 *@author San
 *@version:V1.0
 */
public class PassByValueDemo {

	 int in = 5;
	String str = new String("good");   
	char[] ch = { 'a', 'b', 'c',97 };   
	public void change(int in, String str, char[] ch) {   
		in = 10;
        str = "test ok";   
        ch[0] = 'g';   
    }
	
	public static void main(String args[]){   
		PassByValueDemo ex = new PassByValueDemo();   
        ex.change(ex.in,ex.str, ex.ch);   
        System.out.print(ex.in+" and "+ex.str + " and ");   
        System.out.println(ex.ch);   
        
        //输出结果：5 and good and gbca
    }   
	
	
}

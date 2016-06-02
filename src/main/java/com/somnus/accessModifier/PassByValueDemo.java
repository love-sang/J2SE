package com.somnus.accessModifier;

public class PassByValueDemo {

	/**
	 * java按值传递，
	 */
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
        
        //5 and good and gbca
    }   
	
	
}

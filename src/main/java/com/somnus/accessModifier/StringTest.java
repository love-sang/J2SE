package com.somnus.accessModifier;

import org.junit.Test;

public class StringTest {

	@Test
	public void strTest() {
		String str = "abcd";
		String str2 = "cd";
		System.out.println(str == "ab" + "cd");//true
		System.out.println(str == "ab" + str2);//false  值相等地址不相等
		System.out.println("ab+str2="+"ab"+str2);//abcd
	}
	
    @Test
    public void strTest2() {
        String str = "abcd"; 
        //表示常量，不可变的值
        final String a = "ab";
        String b = "ab";
        System.out.println(str == a + "cd");//true
        System.out.println(str == b + "cd");//false
    }
    
    @Test
    public void strTest3() {
        String str = "abcd"; 
        final String a = "cd";
        String b = "cd";
        System.out.println(str == "ab" + a);//true
        System.out.println(str == "ab" + b);//false
    }
}

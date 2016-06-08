package com.somnus.array;

import java.util.Arrays;

public class ArrayDefined {

	/**
	 * 定义数组的三种方式
	 * 数组的长度一旦确定就无法更改 public final int
	 */
	public static void main(String[] args) {
		//带指定长度的数组
		@SuppressWarnings("unused")
		byte [] array1=new byte[10];
		@SuppressWarnings("unused")
		byte array2 [] =new byte[10];
		
		//初始化数据
		byte [] array3={1,2,3};
		System.out.println("array3:"+array3.toString());
		byte [] array4=new byte[]{1,2,3};
		System.out.println("array4:"+Arrays.toString(array4));
	}
}

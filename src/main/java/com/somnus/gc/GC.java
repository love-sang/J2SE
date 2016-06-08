package com.somnus.gc;

import java.util.Vector;

/**
 * 
 *@Project:J2SE
 *@class:GC
 *@descript:gc垃圾回收机制
 *@date:2016年6月7日 下午3:37:42
 *@author San
 *@version:V1.0
 */
public class GC {

	public static Object get(int index){
		Vector<Object> vector=new Vector<Object>(10);
		for(int i=1;i<100;i++){
			Object obj=new Object();
			vector.add(obj);
			obj=null;
		}
		return vector.get(index);
	}
	public static void main(String[] args) {
		System.out.println(get(10));
	}
}

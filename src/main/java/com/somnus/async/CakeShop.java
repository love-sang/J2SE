package com.somnus.async;
/**
 * 
 *@Project:J2SE
 *@class:CakeShop
 *@descript:
 *@date:2016年6月8日 下午2:06:27
 *@author San
 *@version:V1.0
 */
public class CakeShop {

	public Cake request(final int count, final char c) {
		System.out.println("request(" + count + ", " + c + ") BEGIN");
		// (1) 建立DeliveryOrder的实体
		final DeliveryOrder order = new DeliveryOrder();
		
		// (2) 为了建立CakeBaker的实体，启动新的线程
		new Thread() {
			public void run() {
				//在匿名内部类中使用count、order、c。
				CakeBaker cakeBaker = new CakeBaker(count, c);
				order.setCakeBaker(cakeBaker);
			}
		}.start();
		System.out.println("request(" + count + ", " + c + ") END");
		
		// (3) 取回DeliveryOrder实体，作为传回值
		return order;

	}
}

package com.somnus.async;

/**
 * 
 *@Project:J2SE
 *@class:CakeBaker
 *@descript:蛋糕师傅
 *@date:2016年6月8日 下午2:06:00
 *@author San
 *@version:V1.0
 */
public class CakeBaker implements Cake {
	private final String cake;

	public CakeBaker(int count, char c) {
		System.out.println("making cake(" + count + ", " + c + ") BEGIN");
		char[] buffer = new char[count];
		for (int i = 0; i < count; i++) {
			buffer[i] = c;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("making cake(" + count + ", " + c + ") END");
		this.cake = new String(buffer);
	}

	public String getCake() {
		return cake;
	}

}

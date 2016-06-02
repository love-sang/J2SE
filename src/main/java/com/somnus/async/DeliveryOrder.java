package com.somnus.async;

/**
 * 创建提货单，蛋糕店订货
 * @author Administrator
 *
 */
public class DeliveryOrder implements Cake{

	private CakeBaker cakeBaker = null;
	private boolean ready = false;
	
	//在方法上加synchronized防止多个人访问同一个资源，线程同步
	public synchronized void  setCakeBaker(CakeBaker cakeBaker) {
		if(ready){
			return;// 防止setCakeBaker被调用两次以上。
		}
		this.cakeBaker = cakeBaker;
		this.ready = true;
		notifyAll();
	}
	
	@Override
	public String getCake() {
		while(!ready){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return cakeBaker.getCake();
	}

}

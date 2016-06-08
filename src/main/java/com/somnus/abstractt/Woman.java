package com.somnus.abstractt;

public  class Woman extends AbstractHuman{

	public Woman(String type) {
		super(type);
	}
	
	public String toString() {
		return super.toString()+"女人";
	}
	
	public void 具体业务() {
		System.out.println("我是来取钱的");
	}

}

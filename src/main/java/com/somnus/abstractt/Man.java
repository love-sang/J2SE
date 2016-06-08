package com.somnus.abstractt;

public class Man extends AbstractHuman{

	public Man(String type){
		super(type);
	}
	//一个类继承抽象类，实现抽象类的具体方法
	public void 具体业务() {
		System.out.println("我是来存钱的");
	}
	public String toString(){
		return super.toString()+"男人";
	}

}

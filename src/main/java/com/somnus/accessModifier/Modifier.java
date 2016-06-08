package com.somnus.accessModifier;
/**
 * 
 *@Project:J2SE
 *@class:Modifier
 *@descript:java 类作用域范围
 *@date:2016年6月8日 上午11:22:58
 *@author San
 *@version:V1.0
 */
public class Modifier {

	/**
	 * private(私有的)
	 * 被private所修饰的属性和方法
	 * A只能在该类内部被使用
	 */
	@SuppressWarnings("unused")
	private void c()
	{
		
	}
	
	/**
	 * 默认的(不加任何访问修饰符)
	 * A在类内部
	 * B相同包下面的类
	 */
	 void d()
	{
		
	}
	
 /**
	 * protected(受保护的)
	 * A在类内部
	 * B相同包下面的类
	 * C子类(可以是不同的包)
	 */
	protected void b()
	{
			
	}
	
	/**
	 * public(公共的)
	 * 被public所修饰的属性和方法
	 * 可以被所有类访问
	 */
	public void a()
	{
			
	}
	
	
}

package com.somnus.abstractt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 *@Project:J2SE
 *@class:AbstractHuman
 *@descript:
 *@date:2016年6月8日 上午10:14:27
 *@author San
 *@version:V1.0
 */
public abstract class AbstractHuman {

	private final Set<String> types;
	
	public AbstractHuman(String type){
		System.out.println("AbstractHuman is invoked");
		this.types=new HashSet<String>(Arrays.asList(type));
	}
	
	protected boolean isSupport(String type){
		return types.contains(type);
	}
	
	protected void 办理银行业务(){
		取号();
		具体业务();
		评价();
	}
	
	public void 取号() {
		System.out.println("取号");
	}
	
	public abstract void 具体业务();
		
	public void 评价() {
		System.out.println("评价");
	}

	
}

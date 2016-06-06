package com.somnus.hashcode;

import java.util.Collection;
import java.util.HashSet;

/**
 * 
 *@Project:J2SE 
 *@class:HashCodeDemo 
 *@descript:equals重写了hashcode方法。2个对象相同，则hashcode相同
 *@date:2016年6月6日 下午9:23:49
 *@author San
 *@version:V1.0
 */
public class HashCodeDemo {

	public static void main(String[] args) {
		    Name n1 = new Name("01");  
	        Name n2 = new Name("01");  
	          
	        Collection c = new HashSet();  
	        c.add(n1);  
	        System.out.println("------------");  
	        c.add(n2);  
	        System.out.println("------------");  
	        System.out.println(n1.equals(n2));  
	        System.out.println("------------");  
	        System.out.println(n1.hashCode());  
	        System.out.println(n2.hashCode());  
	        System.out.println(c);
	}
	
}

class Name{
	private String id;
	public Name(String id){
		this.id=id;
	}
	
	public String toString(){
		return this.id;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Name){
			Name name=(Name)obj;
			System.out.println("equals"+name.id);
			return (id.equals(name.id));
		}
		return super.equals(obj);
	}
	
	public int hashCode(){
		Name name=(Name)this;
		System.out.println("Hash"+name.id);
		return id.hashCode();
	}
	
}
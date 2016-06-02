package com.somnus.apache;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.reflect.MethodUtils;
import org.junit.Test;

public class CommonsBeanUtils {

	@Test
    public void cloneBean() throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException{
        Person person = new Person();
        person.setName("tom");
        person.setAge(21);
        /*克隆对象*/
        Person person2 = (Person) BeanUtils.cloneBean(person);
        System.out.println("克隆对象>>" + person2);
    }
	
	@Test
	@SuppressWarnings("unchecked")
	public void populate() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		Map<String, String> map=new HashMap<String, String>();
		map.put("name", "tom");
		map.put("email", "tom@qq.com");
		map.put("age","23");
		
		 /*将map转化为一个Person对象*/
		Person person=new Person();
		BeanUtils.populate(person, map);
		System.out.println("将map转化为一个Person对象>>" + person);
		 
		 /*通过上面的一行代码，此时person的属性就已经具有了上面所赋的值了。*/
	     /*将一个Bean转化为一个Map对象了，如下：*/
		Map<String, String> map2=BeanUtils.describe(person);
		System.out.println(map2.get("name")+">>"+map2.get("age"));
		
	}
	
	@Test
	public void copyProperties() throws IllegalAccessException, InvocationTargetException{
		Person person=new Person();
		person.setName("tom");
		person.setAge(23);
	    /*拥有相同属性的对象转换*/
		People people=new People();
		BeanUtils.copyProperties(people, person);
		System.out.println("拥有相同属性的对象转换>>" + people);
		
	}
	
	 @Test
    public void reflect() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException{
        Person person = new Person();
        person.setName("andy");
        /*反射调用get方法*/
        String name = (String) PropertyUtils.getProperty(person, "name");
        System.out.println(name);
        /*反射调用set方法*/
        PropertyUtils.setProperty(person, "age", 25);
        System.out.println(person.getAge());
    }
	
	 @Test
	    public void reflect2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
	        Person person = new Person();
	        MethodUtils.invokeMethod(person, "setName", new Object[] { "andy" });
	        String name = (String) MethodUtils.invokeMethod(person, "getName", new Object[] { });
	        System.out.println(name);
	    }
	
	
	
	
	
	
}

package com.somnus.apache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
/**
 * 
 *@Project:J2SE
 *@class:CommonsCollections
 *@descript:集合操作
 *@date:2016年6月8日 上午11:43:26
 *@author San
 *@version:V1.0
 */
public class CommonsCollections {

	public static void main(String[] args) {
      List<String> emptyList = new ArrayList<String>();
		/*集合判断： 
		例1: 判断集合是否为空:*/
		System.out.println(CollectionUtils.isEmpty(emptyList));//true
		System.out.println(CollectionUtils.isEmpty(Arrays.asList("1", "2", "3")));//false

		/*例2: 判断集合是否不为空:*/
		System.out.println(CollectionUtils.isNotEmpty(emptyList));//false
		System.out.println(CollectionUtils.isNotEmpty(Arrays.asList("1", "2", "3")));//true
        
		//集合并集，去掉重复
		System.out.println(CollectionUtils.union(
				Arrays.asList("1", "2", "3"), 
				Arrays.asList("2", "3", "5")));//并集{3, 2, 1, 5}
		
		//集合交集 ，取公共部分
		System.out.println(CollectionUtils.intersection(
				Arrays.asList("1", "2", "3"), 
				Arrays.asList("2", "3", "5")));//交集{3, 2}
		
		//集合交集的补集
		System.out.println(CollectionUtils.disjunction(
				Arrays.asList("1", "2", "3"), 
				Arrays.asList("2", "3", "5")));//交集的补集{1, 5}
		
		//集合的差
		System.out.println(CollectionUtils.subtract(
				Arrays.asList("2", "3", "5"), 
				Arrays.asList("1", "2", "3")));//list1与list2的差{1}
	}
}

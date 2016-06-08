package com.somnus.designPatterns.builder;
/**
 * 
 *@Project:J2SE
 *@class:Client
 *@descript:
 *@date:2016年6月8日 下午4:27:26
 *@author San
 *@version:V1.0
 */
public class Client {
	public static void main(String[] args) throws Exception {
	    ActorBuilder ab = (ActorBuilder)XMLUtil.getBean();
        ActorController ac = new ActorController();
        Actor actor = ac.construct(ab); //通过指挥者创建完整的建造者对象

        System.out.println(actor.getType()  + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
	}
}
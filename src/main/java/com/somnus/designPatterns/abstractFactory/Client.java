package com.somnus.designPatterns.abstractFactory;
/**
 *@Project:J2SE
 *@class:Client
 *@descript:
 *@date:2016年6月8日 下午2:13:48
 *@author San
 *@version:V1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //使用抽象层定义  
        SkinFactory factory = (SkinFactory)XMLUtil.getBean();  
        Button bt = factory.createButton();  
        TextField tf = factory.createTextField();  
        ComboBox cb = factory.createComboBox();  
        bt.display();  
        tf.display();  
        cb.display(); 
    }

}

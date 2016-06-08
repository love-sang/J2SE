package com.somnus.designPatterns.bridge;
/**
 * 
 *@Project:J2SE
 *@class:Client
 *@descript:
 *@date:2016年6月8日 下午4:14:38
 *@author San
 *@version:V1.0
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Image image = (Image)XMLUtil.getBean("image");    
        ImageImp imp = (ImageImp)XMLUtil.getBean("os");
        image.setImageImp(imp);  
        image.parseFile("小龙女");
    }

}

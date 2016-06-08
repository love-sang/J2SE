package com.somnus.designPatterns.abstractFactory;

/**
 * 
 *@Project:J2SE
 *@class:TextField
 *@descript:
 *@date:2016年6月8日 下午2:14:24
 *@author San
 *@version:V1.0
 */
// 文本框接口：抽象产品
public interface TextField {
    public void display();
}

// Spring文本框类：具体产品
class SpringTextField implements TextField {
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}

// Summer文本框类：具体产品
class SummerTextField implements TextField {
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}

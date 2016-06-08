package com.somnus.designPatterns.abstractFactory;

/**
 * 
 *@Project:J2SE
 *@class:SkinFactory
 *@descript:
 *@date:2016年6月8日 下午2:14:15
 *@author San
 *@version:V1.0
 */
// 界面皮肤工厂接口：抽象工厂
public interface SkinFactory {
    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();
}

// Spring皮肤工厂：具体工厂
class SpringSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }

    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}

// Summer皮肤工厂：具体工厂
class SummerSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}

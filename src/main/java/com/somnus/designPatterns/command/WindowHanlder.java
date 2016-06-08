package com.somnus.designPatterns.command;

/**
 * 
 *@Project:J2SE
 *@class:WindowHanlder
 *@descript:
 *@date:2016年6月8日 下午5:09:41
 *@author San
 *@version:V1.0
 */
// 窗口处理类：请求接收者
public class WindowHanlder {
    public void minimize() {
        System.out.println("将窗口最小化至托盘！");
    }
}

// 帮助文档处理类：请求接收者
class HelpHandler {
    public void display() {
        System.out.println("显示帮助文档！");
    }
}

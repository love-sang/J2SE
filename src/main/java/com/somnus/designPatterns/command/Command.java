package com.somnus.designPatterns.command;

/**
 * 
 *@Project:J2SE
 *@class:Command
 *@descript:
 *@date:2016年6月8日 下午4:56:49
 *@author San
 *@version:V1.0
 */
//抽象命令类  
public abstract class Command {  
  public abstract void execute();  
}  

//帮助命令类：具体命令类  
class HelpCommand extends Command {  
  private HelpHandler hhObj; //维持对请求接收者的引用  
    
  public HelpCommand() {  
      hhObj = new HelpHandler();  
  }  
    
  //命令执行方法，将调用请求接收者的业务方法  
  public void execute() {  
      hhObj.display();  
  }  
}  

//最小化命令类：具体命令类  
class MinimizeCommand extends Command {  
  private WindowHanlder whObj; //维持对请求接收者的引用  
    
  public MinimizeCommand() {  
      whObj = new WindowHanlder();  
  }  
    
//命令执行方法，将调用请求接收者的业务方法  
  public void execute() {  
      whObj.minimize();  
  }  
}  
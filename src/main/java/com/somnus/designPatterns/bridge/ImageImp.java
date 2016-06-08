package com.somnus.designPatterns.bridge;

/**
 * 
 *@Project:J2SE
 *@class:ImageImp
 *@descript:
 *@date:2016年6月8日 下午4:19:52
 *@author San
 *@version:V1.0
 */
//抽象操作系统实现类：实现类接口  
public interface ImageImp {  
  public void doPaint(Matrix m);  //显示像素矩阵m  
}   

//Windows操作系统实现类：具体实现类  
class WindowsImp implements ImageImp {  
  public void doPaint(Matrix m) {  
      //调用Windows系统的绘制函数绘制像素矩阵  
      System.out.print("在Windows操作系统中显示图像：");  
  }  
}  

//Linux操作系统实现类：具体实现类  
class LinuxImp implements ImageImp {  
  public void doPaint(Matrix m) {  
      //调用Linux系统的绘制函数绘制像素矩阵  
      System.out.print("在Linux操作系统中显示图像：");  
  }  
}  

//Unix操作系统实现类：具体实现类  
class UnixImp implements ImageImp {  
  public void doPaint(Matrix m) {  
      //调用Unix系统的绘制函数绘制像素矩阵  
      System.out.print("在Unix操作系统中显示图像：");  
  }  
}  

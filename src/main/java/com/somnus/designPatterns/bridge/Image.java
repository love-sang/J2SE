package com.somnus.designPatterns.bridge;
/**
 * 
 *@Project:J2SE
 *@class:Image
 *@descript:
 *@date:2016年6月8日 下午4:14:51
 *@author San
 *@version:V1.0
 */
//抽象图像类：抽象类  
public abstract class Image {  
  protected ImageImp imp;  

  public void setImageImp(ImageImp imp) {  
      this.imp = imp;  
  }   

  public abstract void parseFile(String fileName);  
}  
//JPG格式图像：扩充抽象类  
class JPGImage extends Image {  
  public void parseFile(String fileName) {  
      //模拟解析JPG文件并获得一个像素矩阵对象m;  
      Matrix m = new Matrix();   
      imp.doPaint(m);  
      System.out.println(fileName + "，格式为JPG。");  
  }  
}  

//PNG格式图像：扩充抽象类  
class PNGImage extends Image {  
  public void parseFile(String fileName) {  
      //模拟解析PNG文件并获得一个像素矩阵对象m;  
      Matrix m = new Matrix();   
      imp.doPaint(m);  
      System.out.println(fileName + "，格式为PNG。");  
  }  
}  

//BMP格式图像：扩充抽象类  
class BMPImage extends Image {  
  public void parseFile(String fileName) {  
      //模拟解析BMP文件并获得一个像素矩阵对象m;  
      Matrix m = new Matrix();   
      imp.doPaint(m);  
      System.out.println(fileName + "，格式为BMP。");  
  }  
}  

//GIF格式图像：扩充抽象类  
class GIFImage extends Image {  
  public void parseFile(String fileName) {  
      //模拟解析GIF文件并获得一个像素矩阵对象m;  
      Matrix m = new Matrix();   
      imp.doPaint(m);  
      System.out.println(fileName + "，格式为GIF。");  
  }  
}  
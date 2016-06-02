package com.somnus;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.junit.Test;

/**
 * 演示获取文件在服务器中的路径
 * 使用junit进行单元测试：
 * 选择某个方法如“print”--右击“Run as”--选择”JUnit Test“
 * 注意单元测试方法无返回值，必须为void型
 * 参考博客：
 * 1：http://blog.csdn.net/lovesomnus/article/details/24353427
 * 2：http://blog.csdn.net/lovesomnus/article/details/46413223
 * @author Administrator
 *
 */
public class FilePath {

	@Test
	public void print(){
		String path=System.getProperty("user.dir");
		System.out.println(path);
		//path:E:\workspace4.5\J2SE
	}
	
	@Test
	public void print1(){
		//注意获得文件所在的目录位置
				//getClass().getResource("")从根目录开始bin下查找文件,包含类所在包下
		String path=getClass().getResource("").getPath();
		System.out.println(path);
		//path:/E:/workspace4.5/J2SE/target/test-classes/com/somnus/
		
	}
	
	@Test
	public void print2(){
		//getClass().getResource("/")从根目录开始查找classpath下（即bin目录下）不包含类所在包
		String path=getClass().getResource("/").getPath();
		System.out.println(path);
		//path:/E:/workspace4.5/J2SE/target/test-classes/
	}
	
	@Test
	public void print3(){
		String path=getClass().getResource("/logback.xml").getPath();
		System.out.println(path);
		//path:/E:/workspace4.5/J2SE/target/classes/logback.xml
	}
	
	@Test
	public void print4(){
		 //getClass().getClassLoader().getResource("")从当前类所在包下
		String path=getClass().getClassLoader().getResource("").getPath();
		System.out.println(path);
		//path:/E:/workspace4.5/J2SE/target/test-classes/
	}
	
	@Test
	public void print5(){
		//error 
		String path=getClass().getClassLoader().getResource("/").getPath();
		System.err.println(path);
	}
	
	@Test
	public void print6(){
		 //不以"/"开始查找classpath下资源
		String path=getClass().getClassLoader().getResource("logback.xml").getPath();
		System.out.println(path);
		//path:/E:/workspace4.5/J2SE/target/classes/logback.xml
	}
	
   @Test
    public void print7(){
        String path = getClass().getClassLoader().getResource("META-INF").getPath();
        System.out.println(path);
        //path:/E:/workspace4.5/J2SE/target/classes/META-INF
    }
	
	@Test
   public void readFile() throws IOException{
		InputStream is=getClass().getClassLoader().getResourceAsStream("user.xml");
		try {
			byte[] buf=new byte[128];
			int len=0;
			while((len=is.read(buf))!=-1){
				System.out.println(Arrays.toString(buf));
				System.out.print(new String(buf,0,len));
				System.out.print("[读取到的长度："+len+"]");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			is.close();
		}
	}
	
}

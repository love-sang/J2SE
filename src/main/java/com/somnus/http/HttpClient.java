package com.somnus.http;

import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *@Project:J2SE 
 *@class:HttpClient 
 *@descript:http连接
 *@date:2016年6月6日 下午9:51:00
 *@author San
 *@version:V1.0
 */
public class HttpClient {

	private transient Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void doGet() throws IOException{
		 String uriAPI = "http://localhost:8080/SpringMVC/account/json";
	     String result = "";
	     HttpGet httRequest=new HttpGet(uriAPI);
	     CloseableHttpResponse httpResponse = null;
	     try {
	    	 CloseableHttpClient httpClient=HttpClients.createDefault();
			 httpResponse=httpClient.execute(httRequest);
			 if(httpResponse.getStatusLine().getStatusCode()==200){
				 HttpEntity httpEntity=httpResponse.getEntity();
				 result=EntityUtils.toString(httpEntity);// 取出应答字符串
				 //一般来说都要删除多余的字符
				 // 去掉返回结果中的"\r"字符，否则会在结果字符串后面显示一个小方格
				 result.replaceAll("\r", "");
			 }else{
				 httRequest.abort();
			 }
		} catch (ClientProtocolException e) {
			logger.error(e.getMessage(),e);
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
		}finally{
			httpResponse.close();
		}
	     System.out.println(result);
	}
	
	
	@Test
	public void doPost() throws IOException{
		 String uriAPI = "http://localhost:8080/SpringMVC/databind/json";// Post方式没有参数在这里
		 String result="";
		 // 创建HttpPost对象
	     HttpPost httpRequst = new HttpPost(uriAPI);
	     List<NameValuePair> params=new ArrayList<NameValuePair>();
	     params.add(new BasicNameValuePair("username", "admin"));
	     params.add(new BasicNameValuePair("password", "123456"));
	     CloseableHttpResponse httpResponse = null;
	     try {
			httpRequst.setEntity(new UrlEncodedFormEntity(params,HTTP.UTF_8));
			CloseableHttpClient httpClient=HttpClients.createDefault();
			httpResponse=httpClient.execute(httpRequst);
			if(httpResponse.getStatusLine().getStatusCode()==200){
				HttpEntity httpEntity=httpResponse.getEntity();
				result=EntityUtils.toString(httpEntity);// 取出应答字符串
			}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage(), e);
		} catch (ClientProtocolException e) {
			logger.error(e.getMessage(), e);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}finally{
			httpResponse.close();
		}
	    System.out.println(result); 
	     
	}
	
	
	
}

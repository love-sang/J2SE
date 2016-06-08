package com.somnus.apache;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
/**
 * 
 *@Project:J2SE
 *@class:CommonsDbutils
 *@descript:
 *@date:2016年6月8日 上午11:48:24
 *@author San
 *@version:V1.0
 */
public class CommonsDbutils {

	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/test";
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String user = "root";
		String password = "somnus";
        //加载mysql驱动
		DbUtils.loadDriver(jdbcDriver);
		
		//****************************转换成list  ************************************
		try {
			conn = DriverManager.getConnection(url, user, password);
			QueryRunner qr = new QueryRunner();
			@SuppressWarnings({ "unchecked", "rawtypes" })
			List results = (List) qr.query(conn, "select id,name,age from person",new BeanListHandler(Person.class));
			for (int i = 0; i < results.size(); i++) {
				Person p = (Person) results.get(i);
				System.out.println("age:" + p.getAge() + ",name:" + p.getName());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(conn);
		}
		
		//****************************转换成map  ************************************
		try {
			conn = DriverManager.getConnection(url, user, password);
			QueryRunner qr = new QueryRunner();
			@SuppressWarnings("rawtypes")
			List results = (List) qr.query(conn, "select age,name from person",new MapListHandler());
			for (int i = 0; i < results.size(); i++) {
				@SuppressWarnings("rawtypes")
				Map map = (Map) results.get(i);
				System.out.println("age:" + map.get("age") + ",name:"+ map.get("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(conn);
		}
	}
}

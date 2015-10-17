package com.pro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt;//这个对象，是要先有连接对象，再创建执行语句对象
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//指定数据库使用的驱动类。
			//使用用户名root密码root对指定地址的数据库进行连接，得到连接对象conn
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/t85db", "root", "root");
			
			String sql="insert into person(person_name,age) values(?,?)";		
			pstmt=conn.prepareStatement(sql);
			//从左到右指定依次指定问号对应的值，从1开始
			pstmt.setString(1, "ls");
			pstmt.setInt(2, 23);
			//执行sql语句
			pstmt.executeUpdate();
			
			System.out.println("添加成功。。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

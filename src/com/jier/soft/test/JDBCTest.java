package com.jier.soft.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jier.soft.Util.DBUtil;

public class JDBCTest {

	public void testConnect(){
		try {
			Connection conn=DBUtil.getConnection();
			Statement stat =conn.createStatement();
			String sql = "select * from bookinfo";
			ResultSet rs = stat.executeQuery(sql);
			while(rs.next()){
				System.out.println("True");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JDBCTest test = new JDBCTest();
		test.testConnect();
	}
}

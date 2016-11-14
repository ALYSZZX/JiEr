package com.jier.soft.Util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {

	private static String url=null;
	private static String user=null;
	private static String password=null;
	private static String driverClass=null;

	static{
		try {
			//��ȡ�����ļ�
			Properties props = new Properties();
			InputStream in = DBUtil.class.getResourceAsStream("/db.properties");

			//�����ļ�
			props.load(in);

			//��ȡ�ļ�
			url=props.getProperty("url");
			user=props.getProperty("user");
			password=props.getProperty("password");
			driverClass=props.getProperty("driverClass");
			//������������
			Class.forName(driverClass);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/***
	 *��ȡ���� 
	 */
	public static Connection getConnection(){
		Connection conn= null;
		try {
			conn=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	/***
	 *�ر����� 
	 */

	public static void close(Connection conn,Statement stat,ResultSet rs){
		try {
			if(rs!=null)
				rs.close();
		} catch (SQLException e) {
			//e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			try {
				if(stat!=null)
					stat.close();
			} catch (SQLException e) {
				//e.printStackTrace();
				throw new RuntimeException(e);
			}finally{
				try {
					if(conn!=null)
						conn.close();
				} catch (SQLException e) {
					//e.printStackTrace();
					throw new RuntimeException(e);
				}

			}

		}

	}
}

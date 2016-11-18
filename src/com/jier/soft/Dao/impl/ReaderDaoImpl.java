package com.jier.soft.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jier.soft.Dao.ReaderDao;
import com.jier.soft.Util.DBUtil;
import com.jier.soft.entity.Reader;

public class ReaderDaoImpl implements ReaderDao{

	@Override
	public boolean addReader(Reader[] readers) {
		Connection conn = null;
		PreparedStatement stat = null;
		boolean flagg = true;
		try{
			conn= DBUtil.getConnection();
			String sql = "insert into reader"+
			"(reader_number, reader_name, reader_money,reader_type,reader_book_count,reader_count ,reader_phone,reader_email ,reader_status) values"+
			"(?,?,?,?,?,?,?,?,?)";
			stat=conn.prepareStatement(sql);
			for(Reader reader : readers){
				stat.setInt(1,reader.getReader_number());
				stat.setString(2,reader.getReader_name());
				stat.setDouble(3,reader.getReader_money());
				stat.setString(4,reader.getReader_type());
				stat.setInt(5,reader.getReader_book_conut());
				stat.setInt(6,reader.getReader_count());
				stat.setString(7,reader.getReader_phone());
				stat.setString(8,reader.getReader_email());
				stat.setInt(9,reader.getReader_status());
				
				int flag = stat.executeUpdate();
				if(flag<=0)
					flagg = false;
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, stat, null);
		}
		return flagg;
	}

	@Override
	public List<Reader> getAllReader() {
		ArrayList<Reader> list = new ArrayList<Reader>();
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try{
			conn= DBUtil.getConnection();
			String sql = "select * from reader where dr='1'";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()){
				Reader reader = new Reader();
				reader.setReader_id(rs.getInt("reader_id"));
				reader.setReader_number(rs.getInt("reader_number"));
				reader.setReader_name(rs.getString("reader_name"));
				reader.setReader_money(rs.getDouble("reader_money"));
				reader.setReader_type(rs.getString("reader_type"));
				reader.setReader_book_conut(rs.getInt("reader_book_count"));
				reader.setReader_count(rs.getInt("reader_count"));
				reader.setReader_phone(rs.getString("reader_phone"));
				reader.setReader_email(rs.getString("reader_email"));
				reader.setReader_status(rs.getInt("reader_status"));
				list.add(reader);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, stat, rs);	
		}
		return list;
	}

	@Override
	public boolean updateReader(Reader[] readers) {
		Connection conn = null;
		Statement stat = null;
		boolean flagg = true;
		try{
			conn= DBUtil.getConnection();
			stat=conn.createStatement();
			for(Reader reader :readers){
				String sql = "update reader set  reader_type ='"+reader.getReader_type()+"' ,reader_phone = '"+reader.getReader_phone()+"' ,reader_email='"+reader.getReader_email()+"' ,reader_money='"+
						reader.getReader_money()+"' , reader_status='"+reader.getReader_status()+"' where reader_id='"+reader.getReader_id()+"'";
				System.out.println(sql);
				int flag = stat.executeUpdate(sql);
				if(flag<=0)
					flagg = false;
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, stat, null);
		}
		return flagg;
	}

	@Override
	public boolean deleteReader(int[] ids) {
		Connection conn = null;
		Statement stat = null;
		boolean flagg = true;
		try{
			conn= DBUtil.getConnection();
			stat=conn.createStatement();
			for(int id :ids){
				String sql = "update reader set dr=0 where reader_id='"+id+"'";
				int flag = stat.executeUpdate(sql);
				if(flag<=0)
					flagg = false;
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, stat, null);
		}
		return flagg;
	}

}

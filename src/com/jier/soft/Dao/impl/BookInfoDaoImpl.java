package com.jier.soft.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jier.soft.Dao.BookInfoDao;
import com.jier.soft.Util.DBUtil;
import com.jier.soft.entity.BookInfo;

public class BookInfoDaoImpl implements BookInfoDao{

	@Override
	public List<BookInfo> getAllBooks() {
		ArrayList<BookInfo> list = new ArrayList<BookInfo>();
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try{
			conn= DBUtil.getConnection();
			String sql = "select * from bookinfo where dr ='1'";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()){
				BookInfo book = new BookInfo();
				book.setBook_id(rs.getInt("book_id"));
				book.setBook_name(rs.getString("book_name"));
				book.setBook_author(rs.getString("book_author"));
				book.setBook_publish(rs.getString("book_publish"));
				book.setBook_type(rs.getString("book_type"));
				book.setBook_count(rs.getInt("book_count"));
				book.setBook_remain(rs.getInt("book_remain"));
				book.setBook_lend(rs.getInt("book_lend"));
				book.setBook_lend_time(rs.getInt("book_lend_time"));
				book.setBook_lend_count(rs.getInt("book_lend_count"));
				book.setISBN(rs.getString("ISBN"));
				book.setBook_pubtimes(rs.getInt("book_pubtimes"));
				book.setBook_price(rs.getDouble("book_price"));
				book.setBook_status(rs.getInt("book_status"));
				list.add(book);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, stat, rs);	
		}
		return list;
	}
	
	
	@SuppressWarnings("null")
	public List<BookInfo> getSelectedBooks(String limiter,String value) {
		ArrayList<BookInfo> list = new ArrayList<BookInfo>();
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		
		try{
			conn= DBUtil.getConnection();
			String sql = "SELECT * FROM bookinfo WHERE ? LIKE '%?%' and dr ='1'";

			stat=conn.prepareStatement(sql);
			stat.setString(1,limiter);
			stat.setString(2, value);
			rs=stat.executeQuery();
			while(rs.next()){
				BookInfo book = new BookInfo();
				book.setBook_id(rs.getInt("book_id"));
				book.setBook_name(rs.getString("book_name"));
				book.setBook_author(rs.getString("book_author"));
				book.setBook_publish(rs.getString("book_publish"));
				book.setBook_type(rs.getString("book_type"));
				book.setBook_count(rs.getInt("book_count"));
				book.setBook_remain(rs.getInt("book_remain"));
				book.setBook_lend(rs.getInt("book_lend"));
				book.setBook_lend_time(rs.getInt("book_lend_time"));
				book.setBook_lend_count(rs.getInt("book_lend_count"));
				book.setISBN(rs.getString("ISBN"));
				book.setBook_pubtimes(rs.getInt("book_pubtimes"));
				book.setBook_price(rs.getDouble("book_price"));
				book.setBook_status(rs.getInt("book_status"));
				list.add(book);
			}		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, stat, rs);	
		}
		return list;
	}
	
	
	

	@Override
	public boolean deleteBook(BookInfo[] books) {
		Connection conn = null;
		Statement stat = null;
		boolean flagg = true;
		try{
			conn= DBUtil.getConnection();
			stat=conn.createStatement();
			for(BookInfo book : books){
				String sql = "update bookinfo set dr=0 where book_id='"+book.getBook_id()+"'";
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
	public boolean addBook(BookInfo[] books) {
		Connection conn = null;
		PreparedStatement stat = null;
		boolean flagg = true;
		try{
			conn= DBUtil.getConnection();
			String sql = "insert into bookinfo"+
			"(book_name,book_author,book_publish,book_type,book_count,book_remain,book_lend ,book_lend_time,book_lend_count,ISBN,book_pubtimes,book_price,book_status) values"+
			"(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			stat=conn.prepareStatement(sql);
			for(BookInfo book : books){
				stat.setString(1,book.getBook_name());
				stat.setString(2,book.getBook_author());
				stat.setString(3,book.getBook_publish());
				stat.setString(4,book.getBook_type());
				stat.setInt(5,book.getBook_count());
				stat.setInt(6,book.getBook_remain());
				stat.setInt(7,book.getBook_lend());
				stat.setInt(8,book.getBook_lend_time());
				stat.setInt(9,book.getBook_lend_count());
				stat.setString(10,book.getISBN());
				stat.setInt(11,book.getBook_pubtimes());
				stat.setDouble(12,book.getBook_price());
				stat.setInt(13,book.getBook_status());
				
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
	public boolean updateBook(BookInfo[] books) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stat = null;
		boolean flagg = true;
		try{
			conn= DBUtil.getConnection();
			String sql = "update bookinfo set book_name=?,book_author=?,book_publish=?,book_type=?,"
					+ "book_count=?,book_remain=?,book_lend=? ,book_lend_time=?,"
					+ "book_lend_count=?,ISBN=?,book_pubtimes=?,book_price=?,book_status=? "
					+ "where book_id=?";
			stat=conn.prepareStatement(sql);
			for(BookInfo book : books){
				stat.setString(1,book.getBook_name());
				stat.setString(2,book.getBook_author());
				stat.setString(3,book.getBook_publish());
				stat.setString(4,book.getBook_type());
				stat.setInt(5,book.getBook_count());
				stat.setInt(6,book.getBook_remain());
				stat.setInt(7,book.getBook_lend());
				stat.setInt(8,book.getBook_lend_time());
				stat.setInt(9,book.getBook_lend_count());
				stat.setString(10,book.getISBN());
				stat.setInt(11,book.getBook_pubtimes());
				stat.setDouble(12,book.getBook_price());
				stat.setInt(13,book.getBook_status());
				stat.setInt(14,book.getBook_id());
				int flag = stat.executeUpdate();

				System.out.println("id:"+book.getBook_id());
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

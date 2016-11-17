package com.jier.soft.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.jier.soft.Dao.BookLendDao;
import com.jier.soft.Util.DBUtil;
import com.jier.soft.entity.BookInfo;
import com.jier.soft.entity.BookLend;

public class BookLendDaoImpl implements BookLendDao{

	@Override
	public List<BookLend> getAllBookLend() {
		ArrayList<BookLend> list = new ArrayList<BookLend>();
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try{
			conn= DBUtil.getConnection();
			String sql = "select * from booklend where dr ='1'";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()){
				BookLend lend = new BookLend();
				lend.setLend_id(rs.getInt("lend_id"));
				lend.setBook_id(rs.getInt("book_id"));
				lend.setReader_id(rs.getInt("reader_id"));
				lend.setLend_book_count(rs.getInt("lend_book_count"));
				lend.setLend_time(rs.getDate("lend_time"));
				list.add(lend);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, stat, rs);	
		}
		return list;
}

	@Override
	public boolean deleteBookLend(BookLend[] lends) {
		Connection conn = null;
		Statement stat = null;
		boolean flagg = true;
		try{
			conn= DBUtil.getConnection();
			stat=conn.createStatement();
			for(BookLend lend : lends){
				String sql = "update bookinfo set dr=0 where book_id='"+lend.getBook_id()+"'";
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
	public boolean updateBookLend(BookLend[] lends) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addBookLend(BookLend[] lends) {
		Connection conn = null;
		PreparedStatement stat = null;
		boolean flagg = true;
		try{
			conn= DBUtil.getConnection();
			String sql = "insert into booklend"+
			"(reader_id,book_id,lend_book_counts,lend_time) values"+
			"(?,?,?,?)";
			stat=conn.prepareStatement(sql);
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			for(BookLend lend : lends){
				stat.setInt(1, lend.getReader_id());
				stat.setInt(2, lend.getBook_id());
				stat.setInt(3, lend.getLend_book_count());
				stat.setString(4, sf.format(lend.getLend_time()));
				
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

}

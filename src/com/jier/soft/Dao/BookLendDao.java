package com.jier.soft.Dao;

import java.sql.ResultSet;
import java.util.List;

import com.jier.soft.entity.BookLend;

public interface BookLendDao {

	//获取所有借书信息
	public List<BookLend> getAllBookLend();
	//删除借书信息
	public boolean deleteBookLend(BookLend[] lends);
	//更新借书信息
	public boolean updateBookLend(BookLend[] lends);
	//查询借书信息
	public ResultSet getBookLend(String reader_name, String reader_number);
	
}

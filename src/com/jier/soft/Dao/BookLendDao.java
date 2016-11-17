package com.jier.soft.Dao;

import java.util.List;

import com.jier.soft.entity.BookLend;

public interface BookLendDao {

	//获取所有借书信息
	public List<BookLend> getAllBookLend();
	//删除借书信息
	public boolean deleteBookLend(BookLend[] lends);
	//更新借书信息
	public boolean updateBookLend(BookLend[] lends);
	//添加借书信息
	public boolean addBookLend(BookLend[] lends);
	
}

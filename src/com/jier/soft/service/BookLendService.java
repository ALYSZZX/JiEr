package com.jier.soft.service;

import java.util.List;

import com.jier.soft.entity.BookLend;

public interface BookLendService {

	//添加借书信息
	public boolean addBookLend(BookLend[] lends);
	//删除借书记录
	public boolean deleteBookLend(BookLend[] lends);
	//更新借书记录
	public boolean updateBookLend(BookLend[] lends);
	//获取所有借书记录
	public List<BookLend> getAllBookLend();
}

package com.jier.soft.Dao;

import java.util.List;

import com.jier.soft.entity.BookInfo;

public interface BookInfoDao {

	//查询所有书籍
	public List<BookInfo> getAllBooks();
	//删除书籍
	public boolean deleteBook(BookInfo[] books);
	//添加书籍
	public boolean addBook(BookInfo[] books);
	//更新书籍信息
	public boolean updateBook(BookInfo[] books);
}

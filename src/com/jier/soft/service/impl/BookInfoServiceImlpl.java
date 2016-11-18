package com.jier.soft.service.impl;

import java.util.List;

import com.jier.soft.Dao.BookInfoDao;
import com.jier.soft.Dao.impl.BookInfoDaoImpl;
import com.jier.soft.entity.BookInfo;
import com.jier.soft.service.BookInfoService;

public class BookInfoServiceImlpl implements BookInfoService{

	private BookInfoDao dao = new BookInfoDaoImpl();
	@Override
	public List<BookInfo> getAllBooks() {		
		return dao.getAllBooks();
	}
	public List<BookInfo> getSelectedBooks(String limiter,String value)
	{
		return dao.getSelectedBooks(limiter,value);
	}

	@Override
	public boolean deleteBook(BookInfo[] books) {
		return dao.deleteBook(books);
	}

	@Override
	public boolean addBook(BookInfo[] books) {
		
		return dao.addBook(books);
	}

	@Override
	public boolean updateBook(BookInfo[] books) {
		
		return dao.updateBook(books);
	}

}

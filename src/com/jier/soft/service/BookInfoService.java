package com.jier.soft.service;

import java.util.List;

import com.jier.soft.entity.BookInfo;

public interface BookInfoService {

	//��ѯ�����鼮
		public List<BookInfo> getAllBooks();
		//ɾ���鼮
		public boolean deleteBook(BookInfo[] books);
		//����鼮
		public boolean addBook(BookInfo[] books);
		//�����鼮��Ϣ
		public boolean updateBook(BookInfo[] books);
}

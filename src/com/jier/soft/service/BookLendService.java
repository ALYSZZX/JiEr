package com.jier.soft.service;

import java.util.List;

import com.jier.soft.entity.BookLend;

public interface BookLendService {

	//��ӽ�����Ϣ
	public boolean addBookLend(BookLend[] lends);
	//ɾ�������¼
	public boolean deleteBookLend(BookLend[] lends);
	//���½����¼
	public boolean updateBookLend(BookLend[] lends);
	//��ȡ���н����¼
	public List<BookLend> getAllBookLend();
}

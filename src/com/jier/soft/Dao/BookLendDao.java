package com.jier.soft.Dao;

import java.util.List;

import com.jier.soft.entity.BookLend;

public interface BookLendDao {

	//��ȡ���н�����Ϣ
	public List<BookLend> getAllBookLend();
	//ɾ��������Ϣ
	public boolean deleteBookLend(BookLend[] lends);
	//���½�����Ϣ
	public boolean updateBookLend(BookLend[] lends);
	//��ӽ�����Ϣ
	public boolean addBookLend(BookLend[] lends);
	
}

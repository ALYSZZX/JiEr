package com.jier.soft.entity;

import java.util.Date;

public class BookLend {

	
	//������Ϣ��
	
	private int lend_id;
	//��������
	private int reader_id;
	//�鼮����
	private int book_id;
	//�鼮������Ĭ��һ�ᣨһ����
	private int lend_book_count;
	//����ʱ��
	private Date lend_time;
	public int getLend_id() {
		return lend_id;
	}
	public void setLend_id(int lend_id) {
		this.lend_id = lend_id;
	}
	public int getReader_id() {
		return reader_id;
	}
	public void setReader_id(int reader_id) {
		this.reader_id = reader_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getLend_book_count() {
		return lend_book_count;
	}
	public void setLend_book_count(int lend_book_count) {
		this.lend_book_count = lend_book_count;
	}
	public Date getLend_time() {
		return lend_time;
	}
	public void setLend_time(Date lend_time) {
		this.lend_time = lend_time;
	}
	
}

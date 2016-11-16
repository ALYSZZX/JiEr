package com.jier.soft.entity;

public class BookInfo {

	
	private int book_id;
	//图书名称
	private String book_name;
	//作者
	private String book_author;
	//出版社
	private String book_publish;
	//图书类别
	private String book_type;
	//图书数量
	private int book_count;
	//图书目前库存
	private int book_remain;
	//图书借出数量
	private int book_lend;
	//可以借用的时间
	private int book_lend_time;
	//借用的次数
	private int book_lend_count;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_publish() {
		return book_publish;
	}
	public void setBook_publish(String book_publish) {
		this.book_publish = book_publish;
	}
	public String getBook_type() {
		return book_type;
	}
	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}
	public int getBook_count() {
		return book_count;
	}
	public void setBook_count(int book_count) {
		this.book_count = book_count;
	}
	public int getBook_remain() {
		return book_remain;
	}
	public void setBook_remain(int book_remain) {
		this.book_remain = book_remain;
	}
	public int getBook_lend() {
		return book_lend;
	}
	public void setBook_lend(int book_lend) {
		this.book_lend = book_lend;
	}
	public int getBook_lend_time() {
		return book_lend_time;
	}
	public void setBook_lend_time(int book_lend_time) {
		this.book_lend_time = book_lend_time;
	}
	public int getBook_lend_count() {
		return book_lend_count;
	}
	public void setBook_lend_count(int book_lend_count) {
		this.book_lend_count = book_lend_count;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getBook_pubtimes() {
		return book_pubtimes;
	}
	public void setBook_pubtimes(int book_pubtimes) {
		this.book_pubtimes = book_pubtimes;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public int getBook_status() {
		return book_status;
	}
	public void setBook_status(int book_status) {
		this.book_status = book_status;
	}
	private String ISBN;
	//图书版本  第一版 1 第二版 2
	private int book_pubtimes;
	//图书单价
	private double book_price;
	//图书状态 
	private int book_status;
	
}

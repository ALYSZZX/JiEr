package com.jier.soft.entity;

public class Reader {

	//读者信息
	private int reader_id;
	//读者编号（身份证或者工号）
	private int reader_number;
	//读者姓名
	private String reader_name;
	//读者账户余额
	private double reader_money;
	private String reader_type;
	//已借书籍书
	private int reader_book_conut;
	//总借书次数
	private int reader_coun;
	
	private String reader_phone;
	private String reader_email;
	//读者状态 1 表示正常 ， 0表示挂失
	private int reader_status;
	public int getReader_id() {
		return reader_id;
	}
	public void setReader_id(int reader_id) {
		this.reader_id = reader_id;
	}
	public int getReader_number() {
		return reader_number;
	}
	public void setReader_number(int reader_number) {
		this.reader_number = reader_number;
	}
	public String getReader_name() {
		return reader_name;
	}
	public void setReader_name(String reader_name) {
		this.reader_name = reader_name;
	}
	public double getReader_money() {
		return reader_money;
	}
	public void setReader_money(double reader_money) {
		this.reader_money = reader_money;
	}
	public String getReader_type() {
		return reader_type;
	}
	public void setReader_type(String reader_type) {
		this.reader_type = reader_type;
	}
	public int getReader_book_conut() {
		return reader_book_conut;
	}
	public void setReader_book_conut(int reader_book_conut) {
		this.reader_book_conut = reader_book_conut;
	}
	public int getReader_coun() {
		return reader_coun;
	}
	public void setReader_coun(int reader_coun) {
		this.reader_coun = reader_coun;
	}
	public String getReader_phone() {
		return reader_phone;
	}
	public void setReader_phone(String reader_phone) {
		this.reader_phone = reader_phone;
	}
	public String getReader_email() {
		return reader_email;
	}
	public void setReader_email(String reader_email) {
		this.reader_email = reader_email;
	}
	public int getReader_status() {
		return reader_status;
	}
	public void setReader_status(int reader_status) {
		this.reader_status = reader_status;
	}
	
	
}

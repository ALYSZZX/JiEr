package com.jier.soft.entity;

public class Category {

	/***
	 *商品类型
	 *@author朱政雄 
	 */
	//主键
	private int id;
	//类型编号
	private int category_number;
	//类型名称
	private String category_name;
	
	public Category(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategory_number() {
		return category_number;
	}
	public void setCategory_number(int category_number) {
		this.category_number = category_number;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
}

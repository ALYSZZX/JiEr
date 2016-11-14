package com.jier.soft.entity;

public class Color {

	
	/***
	 *商品颜色
	 *@author朱政雄 
	 */
	
	//主键
	private int id;
	//颜色名称
	private String color_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor_name() {
		return color_name;
	}
	public void setColor_name(String color_name) {
		this.color_name = color_name;
	}
}

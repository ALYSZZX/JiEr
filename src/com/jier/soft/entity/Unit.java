package com.jier.soft.entity;

public class Unit {

	/***
	 *商品单位
	 *@author 朱政雄 
	 */
	//主键
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUnit_name() {
		return unit_name;
	}
	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}
	//单位名称
	private String unit_name;
}

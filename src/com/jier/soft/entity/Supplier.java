package com.jier.soft.entity;

public class Supplier {

	
	/***
	 *供货商实体
	 * @author 朱政雄
	 */
	//主键
	private int id;
	//供货商名称
	private String name;
	//联系人
	private String contacts;
	//联系电话
	private String phone;
	//联系地址
	private String address;
	//备注
	private String remark;
	//我方应付金额
	private double pay;
	//是否为默认供货商，1为是，0为不是
	private int defaults;
	//是否禁用,1禁用，0为不禁用
	private int disable;
	
	public Supplier(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public int getDefaults() {
		return defaults;
	}
	public void setDefaults(int defaults) {
		this.defaults = defaults;
	}
	public int getDisable() {
		return disable;
	}
	public void setDisable(int disable) {
		this.disable = disable;
	}
	
}

package com.jier.soft.entity;

public class Supplier {

	
	/***
	 *������ʵ��
	 * @author ������
	 */
	//����
	private int id;
	//����������
	private String name;
	//��ϵ��
	private String contacts;
	//��ϵ�绰
	private String phone;
	//��ϵ��ַ
	private String address;
	//��ע
	private String remark;
	//�ҷ�Ӧ�����
	private double pay;
	//�Ƿ�ΪĬ�Ϲ����̣�1Ϊ�ǣ�0Ϊ����
	private int defaults;
	//�Ƿ����,1���ã�0Ϊ������
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

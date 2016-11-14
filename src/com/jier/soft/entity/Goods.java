package com.jier.soft.entity;

public class Goods {

	/***
	 *商品
	 *@author 朱政雄
	 */
	
	//主键
	private int goods_id;
	//编码
	private int goods_number; 
	//商品名称
	private String goods_name;
	//商品类型
	private int goods_category ;
	//商品单位
	private int goods_unit;
	//商品规格型号
	private String goods_spec;
	//商品颜色
	private int goods_color;
	//保质期
	private int goods_life;
	//商品状态，是否可用
	private int goods_status;
	//商品折扣
	private double goods_discount;
	//库存
	private int goods_store;
	//商品进货价
	private double goods_purchase;
	//商品售价
	private double goods_sell;
	//商品积分
	private double goods_integral;
	//生厂厂商
	private String goods_production;
	//备注
	private String goods_remark;
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getGoods_number() {
		return goods_number;
	}
	public void setGoods_number(int goods_number) {
		this.goods_number = goods_number;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public int getGoods_category() {
		return goods_category;
	}
	public void setGoods_category(int goods_category) {
		this.goods_category = goods_category;
	}
	public int getGoods_unit() {
		return goods_unit;
	}
	public void setGoods_unit(int goods_unit) {
		this.goods_unit = goods_unit;
	}
	public String getGoods_spec() {
		return goods_spec;
	}
	public void setGoods_spec(String goods_spec) {
		this.goods_spec = goods_spec;
	}
	public int getGoods_color() {
		return goods_color;
	}
	public void setGoods_color(int goods_color) {
		this.goods_color = goods_color;
	}
	public int getGoods_life() {
		return goods_life;
	}
	public void setGoods_life(int goods_life) {
		this.goods_life = goods_life;
	}
	public int getGoods_status() {
		return goods_status;
	}
	public void setGoods_status(int goods_status) {
		this.goods_status = goods_status;
	}
	public double getGoods_discount() {
		return goods_discount;
	}
	public void setGoods_discount(double goods_discount) {
		this.goods_discount = goods_discount;
	}
	public int getGoods_store() {
		return goods_store;
	}
	public void setGoods_store(int goods_store) {
		this.goods_store = goods_store;
	}
	public double getGoods_purchase() {
		return goods_purchase;
	}
	public void setGoods_purchase(double goods_purchase) {
		this.goods_purchase = goods_purchase;
	}
	public double getGoods_sell() {
		return goods_sell;
	}
	public void setGoods_sell(double goods_sell) {
		this.goods_sell = goods_sell;
	}
	public double getGoods_integral() {
		return goods_integral;
	}
	public void setGoods_integral(double goods_integral) {
		this.goods_integral = goods_integral;
	}
	public String getGoods_production() {
		return goods_production;
	}
	public void setGoods_production(String goods_production) {
		this.goods_production = goods_production;
	}
	public String getGoods_remark() {
		return goods_remark;
	}
	public void setGoods_remark(String goods_remark) {
		this.goods_remark = goods_remark;
	}
	
}

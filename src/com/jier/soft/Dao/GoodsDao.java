package com.jier.soft.Dao;

import java.util.List;

import com.jier.soft.entity.Goods;

public interface GoodsDao {

	/***
	 *获取所有商品
	 * @author ZHUZX
	 */
	public List<Goods> getGoodsList();
}

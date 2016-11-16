package com.jier.soft.Dao;

import java.util.List;

import com.jier.soft.entity.Reader;

public interface ReaderDao {

	//添加读者
	public boolean addReader(Reader[] readers);
	//获取读者
	public List<Reader> getAllReader();
	//更新读者
	public boolean updateReader(Reader[] readers);
	//删除读者
	public boolean deleteReader(Reader[] reader);
}

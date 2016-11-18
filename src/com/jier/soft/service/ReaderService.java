package com.jier.soft.service;

import java.util.List;

import com.jier.soft.entity.Reader;

public interface ReaderService {

			//查询所有读者
			public List<Reader> getAllReaders();
			//删除读者
			public boolean deleteReader(int[] ids);
			//添加读者
			public boolean addReader(Reader[] readers);
			//更新读者信息
			public boolean updateReader(Reader[] readers);
			
			//按条件查询读者
			public List<Reader> queryReader(String queryA,String queryF);
}

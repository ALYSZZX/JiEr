package com.jier.soft.Dao;

import java.util.List;

import com.jier.soft.entity.Reader;

public interface ReaderDao {

	//��Ӷ���
	public boolean addReader(Reader[] readers);
	//��ȡ����
	public List<Reader> getAllReader();
	//���¶���
	public boolean updateReader(Reader[] readers);
	//ɾ������
	public boolean deleteReader(Reader[] reader);
}

package com.jier.soft.service;

import java.util.List;

import com.jier.soft.entity.Reader;

public interface ReaderService {

			//��ѯ���ж���
			public List<Reader> getAllReaders();
			//ɾ������
			public boolean deleteReader(Reader[] readers);
			//��Ӷ���
			public boolean addReader(Reader[] readers);
			//���¶�����Ϣ
			public boolean updateReader(Reader[] readers);
}

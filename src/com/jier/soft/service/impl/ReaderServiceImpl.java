package com.jier.soft.service.impl;

import java.util.List;

import com.jier.soft.Dao.ReaderDao;
import com.jier.soft.Dao.impl.ReaderDaoImpl;
import com.jier.soft.entity.Reader;
import com.jier.soft.service.ReaderService;

public class ReaderServiceImpl implements ReaderService{

	private ReaderDao dao = new ReaderDaoImpl();
	@Override
	public List<Reader> getAllReaders() {
		// TODO Auto-generated method stub
		return dao.getAllReader();
	}

	@Override
	public boolean deleteReader(Reader[] readers) {
		// TODO Auto-generated method stub
		return dao.deleteReader(readers);
	}

	@Override
	public boolean addReader(Reader[] readers) {
		// TODO Auto-generated method stub
		return dao.addReader(readers);
	}

	@Override
	public boolean updateReader(Reader[] readers) {
		// TODO Auto-generated method stub
		return dao.updateReader(readers);
	}

}

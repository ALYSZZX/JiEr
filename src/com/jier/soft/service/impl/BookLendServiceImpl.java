package com.jier.soft.service.impl;

import java.util.List;

import com.jier.soft.Dao.BookLendDao;
import com.jier.soft.Dao.impl.BookLendDaoImpl;
import com.jier.soft.entity.BookLend;
import com.jier.soft.service.BookLendService;

public class BookLendServiceImpl implements BookLendService{

		BookLendDao dao = new BookLendDaoImpl();
		
		@Override
		public boolean updateBookLend(BookLend[] lends) {
			// TODO Auto-generated method stub
			return dao.updateBookLend(lends);
		}
		
		@Override
		public List<BookLend> getAllBookLend() {
			// TODO Auto-generated method stub
			return dao.getAllBookLend();
		}
		
		@Override
		public boolean deleteBookLend(BookLend[] lends) {
			// TODO Auto-generated method stub
			return dao.deleteBookLend(lends);
		}
		
		@Override
		public boolean addBookLend(BookLend[] lends) {
			// TODO Auto-generated method stub
			return dao.addBookLend(lends);
		}

}

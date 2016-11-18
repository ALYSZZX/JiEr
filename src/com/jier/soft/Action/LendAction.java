package com.jier.soft.Action;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.jier.soft.entity.BookInfo;
import com.jier.soft.entity.BookLend;
import com.jier.soft.entity.Reader;
import com.jier.soft.service.BookInfoService;
import com.jier.soft.service.BookLendService;
import com.jier.soft.service.ReaderService;
import com.jier.soft.service.impl.BookInfoServiceImlpl;
import com.jier.soft.service.impl.BookLendServiceImpl;
import com.jier.soft.service.impl.ReaderServiceImpl;

public class LendAction {

	/***
	 *����ͼ������ 
	 */
	public void loadBookInfo(DefaultTableModel dt){
		
		//��Service�л�ȡ����
		BookInfoService service = new BookInfoServiceImlpl();
		List<BookInfo> list = service.getAllBooks();
		
		for(int i =0; i < list.size(); i++){
			BookInfo book = list.get(i);
			Object[] obj ={book.getBook_id(),book.getBook_name(), book.getBook_author(),book.getBook_publish(),book.getBook_type(),book.getBook_count(),book.getBook_lend(),book.getBook_lend_count(),book.getBook_price() };//������ص���
			
			dt.addRow(obj);
		}
		
	}
	
	/***
	 *��ӽ����¼ 
	 * @return 
	 */
	public boolean addLend(BookLend[] lends){
		BookLendService service = new BookLendServiceImpl();
		return service.addBookLend(lends);
		
	}
	//��ȡ����
	public Reader getReader(String queryA,String queryF){
		ReaderService service = new ReaderServiceImpl();
		List<Reader> list =service.queryReader(queryA, queryF);
		Reader reader = list.get(0);
		return reader;
	}
}

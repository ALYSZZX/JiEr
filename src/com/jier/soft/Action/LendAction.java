package com.jier.soft.Action;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.jier.soft.entity.BookInfo;
import com.jier.soft.entity.BookLend;
import com.jier.soft.service.BookInfoService;
import com.jier.soft.service.BookLendService;
import com.jier.soft.service.impl.BookInfoServiceImlpl;
import com.jier.soft.service.impl.BookLendServiceImpl;

public class LendAction {

	/***
	 *加载图书数据 
	 */
	public void loadBookInfo(DefaultTableModel dt){
		
		//从Service中获取数据
		BookInfoService service = new BookInfoServiceImlpl();
		List<BookInfo> list = service.getAllBooks();
		
		for(int i =0; i < list.size(); i++){
			BookInfo book = list.get(i);
			Object[] obj ={book.getBook_id(),book.getBook_name(), book.getBook_author(),book.getBook_publish(),book.getBook_type(),book.getBook_count(),book.getBook_lend(),book.getBook_lend_count(),book.getBook_price() };//具体加载的行
			
			dt.addRow(obj);
		}
		
	}
	
	/***
	 *添加借书记录 
	 */
	public void addLend(BookLend[] lends){
		BookLendService service = new BookLendServiceImpl();
		service.addBookLend(lends);
		
	}
}

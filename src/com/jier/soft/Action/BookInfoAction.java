package com.jier.soft.Action;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.jier.soft.entity.BookInfo;
import com.jier.soft.service.BookInfoService;
import com.jier.soft.service.impl.BookInfoServiceImlpl;

public class BookInfoAction {

	/***
	 *加载图书数据 
	 */
	public void loadBookInfo(DefaultTableModel dt){
		
		//从Service中获取数据
		BookInfoService service = new BookInfoServiceImlpl();
		List<BookInfo> list = service.getAllBooks();
		
		for(int i =0; i < list.size(); i++){
			BookInfo book = list.get(i);
			Object[] obj ={book.getBook_id(), book.getBook_name(), book.getBook_author() };//具体加载的行
			dt.addRow(obj);
		}
		
	}
	
	/***
	 *先删除在加载 
	 */
	public void loadBook(DefaultTableModel dt){
		//遍历表格中数据
		for(int i =dt.getRowCount()-1;i>=0; i--){
			dt.removeRow(i);
		}
		loadBookInfo(dt);
	}
	
	/***
	 *删除图书 
	 */
	public void deleteBook(BookInfo[] books){
		BookInfoService service = new BookInfoServiceImlpl();
		service.deleteBook(books);
	}
}

package com.jier.soft.Action;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.jier.soft.entity.BookInfo;
import com.jier.soft.service.BookInfoService;
import com.jier.soft.service.impl.BookInfoServiceImlpl;

public class BookInfoAction {

	/***
	 *����ͼ������ 
	 */
	public void loadBookInfo(DefaultTableModel dt){
		
		//��Service�л�ȡ����
		BookInfoService service = new BookInfoServiceImlpl();
		List<BookInfo> list = service.getAllBooks();
		for(int i =0; i < list.size(); i++){
			BookInfo book = list.get(i);
			Object[] obj ={book.getBook_id(),book.getBook_name(), book.getBook_author(),book.getBook_type(),
					book.getBook_count(),book.getBook_lend(),book.getBook_remain(),
					book.getBook_lend_time(),book.getBook_lend_count(),book.getBook_publish(),
					book.getISBN(),book.getBook_pubtimes(),book.getBook_price(),book.getBook_status()};//������ص���
			dt.addRow(obj);
		}	
}

public void loadSelectedBookInfo(DefaultTableModel dt,String limiter,String value){		
		//��Service�л�ȡ����
	for(int i =dt.getRowCount()-1;i>=0; i--){
		dt.removeRow(i);
	}
		BookInfoService service = new BookInfoServiceImlpl();
		List<BookInfo> list = service.getSelectedBooks(limiter, value);
		for(int i =0; i < list.size(); i++){
			BookInfo book = list.get(i);
			Object[] obj ={book.getBook_id(),book.getBook_name(), book.getBook_author(),book.getBook_type(),
					book.getBook_count(),book.getBook_lend(),book.getBook_remain(),
					book.getBook_lend_time(),book.getBook_lend_count(),book.getBook_publish(),
					book.getISBN(),book.getBook_pubtimes(),book.getBook_price(),book.getBook_status()};//������ص���
			dt.addRow(obj);
		}	
}	
	
	/***
	 *��ɾ���ڼ��� 
	 */
	public void loadBook(DefaultTableModel dt){
		//�������������
		for(int i =dt.getRowCount()-1;i>=0; i--){
			dt.removeRow(i);
		}
		loadBookInfo(dt);
	}
	
	/***
	 *ɾ��ͼ�� 
	 */
	public void deleteBook(BookInfo[] books){
		BookInfoService service = new BookInfoServiceImlpl();
		service.deleteBook(books);
	}
	
	/***
	 *����ͼ�� 
	 */
	public void addBook(BookInfo[] book){
		BookInfoService service = new BookInfoServiceImlpl();
		service.addBook(book);
	}
	
	public void updateBook(BookInfo[] book){
		BookInfoService service = new BookInfoServiceImlpl();
		service.updateBook(book);
	}
	
	
}

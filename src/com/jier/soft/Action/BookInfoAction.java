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
			Object[] obj ={book.getBook_name(), book.getBook_author(),book.getBook_publish(),book.getBook_type(),book.getBook_count(),book.getBook_lend(),book.getBook_lend_count(),book.getBook_price() };//������ص���
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
}

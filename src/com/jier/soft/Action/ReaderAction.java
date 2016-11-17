package com.jier.soft.Action;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.jier.soft.entity.BookInfo;
import com.jier.soft.entity.Reader;
import com.jier.soft.service.BookInfoService;
import com.jier.soft.service.ReaderService;
import com.jier.soft.service.impl.BookInfoServiceImlpl;
import com.jier.soft.service.impl.ReaderServiceImpl;

public class ReaderAction {

	/***
	 *���ض������� 
	 */
	public void loadBookInfo(DefaultTableModel dt){
		
		//��Service�л�ȡ����
		ReaderService service = new ReaderServiceImpl();
		List<Reader> list = service.getAllReaders();
		
		for(int i =0; i < list.size(); i++){
			Reader book = list.get(i);
			Object[] obj ={book.getReader_name() };//������ص���
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
}

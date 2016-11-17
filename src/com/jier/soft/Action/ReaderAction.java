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
	 * ���ض�������
	 */
	public void loadReader(DefaultTableModel dt){
		
		//��Service�л�ȡ����
		ReaderService service = new ReaderServiceImpl();
		List<Reader> list = service.getAllReaders();
		
		for(int i =0; i < list.size(); i++){
			Reader reader = list.get(i);
			Object[] obj ={reader.getReader_id(),reader.getReader_name(),reader.getReader_count(),reader.getReader_type(),reader.getReader_money() };//������ص���
			dt.addRow(obj);
		}
		
	}

	/***
	 * ��ɾ���ڼ���
	 */
	public void loadReaderbeforDel(DefaultTableModel dt) {
		// �������������
		for (int i = dt.getRowCount() - 1; i >= 0; i--) {
			dt.removeRow(i);
		}
		loadReader(dt);
	}

	/***
	 * ɾ��ͼ��
	 */
	public void deleteReader(Reader[] readers) {
		ReaderService service = new ReaderServiceImpl();
		service.deleteReader(readers);
	}

	/***
	 * ��Ӷ���
	 */
	public void addReader(Reader[] readers) {
		ReaderService service = new ReaderServiceImpl();
		service.addReader(readers);
	}
}

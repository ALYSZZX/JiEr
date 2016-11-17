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
	 * 加载读者数据
	 */
	public void loadReader(DefaultTableModel dt){
		
		//从Service中获取数据
		ReaderService service = new ReaderServiceImpl();
		List<Reader> list = service.getAllReaders();
		
		for(int i =0; i < list.size(); i++){
			Reader reader = list.get(i);
			Object[] obj ={reader.getReader_id(),reader.getReader_name(),reader.getReader_count(),reader.getReader_type(),reader.getReader_money() };//具体加载的行
			dt.addRow(obj);
		}
		
	}

	/***
	 * 先删除在加载
	 */
	public void loadReaderbeforDel(DefaultTableModel dt) {
		// 遍历表格中数据
		for (int i = dt.getRowCount() - 1; i >= 0; i--) {
			dt.removeRow(i);
		}
		loadReader(dt);
	}

	/***
	 * 删除图书
	 */
	public void deleteReader(Reader[] readers) {
		ReaderService service = new ReaderServiceImpl();
		service.deleteReader(readers);
	}

	/***
	 * 添加读者
	 */
	public void addReader(Reader[] readers) {
		ReaderService service = new ReaderServiceImpl();
		service.addReader(readers);
	}
}

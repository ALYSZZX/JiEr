package com.jier.soft.Action;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.jier.soft.entity.Reader;
import com.jier.soft.service.ReaderService;
import com.jier.soft.service.impl.ReaderServiceImpl;

public class ReaderAction {

	private ReaderService service = new ReaderServiceImpl();
	/***
	 * 加载读者数据
	 */
	public void loadReader(DefaultTableModel dt){

		//从Service中获取数据
		List<Reader> list = service.getAllReaders();

		for(int i =0; i < list.size(); i++){
			Reader reader = list.get(i);
			String status = "正常(1)";
			if(reader.getReader_status() == 0)
				status = "挂失(0)";
			// "读者学(工)号", "读者姓名","读者类型","读者手机","读者邮箱","已借阅次数","总借阅次数","账户余额","读者状态" 
			Object[] obj ={reader.getReader_id(),reader.getReader_number(),reader.getReader_name(),reader.getReader_type(),reader.getReader_phone(),reader.getReader_email(),reader.getReader_book_conut(),reader.getReader_count(),reader.getReader_money(),status};//具体加载的行
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
	 * 删除读者
	 * @return 
	 */
	public boolean deleteReader(int[] ids) {
		return service.deleteReader(ids);
	}

	/***
	 * 添加读者
	 * @return 
	 */
	public boolean addReader(Reader[] readers) {
		return service.addReader(readers);
	}

	/****
	 *修改读者信息 
	 *
	 */
	public boolean updateReader(Reader[] readers){
		return service.updateReader(readers); 
	}

	/***
	 *按条件查询读者 
	 */
	public void queryReader(String queryA,String queryF,DefaultTableModel dt){

		// 遍历表格中数据
		for (int i = dt.getRowCount() - 1; i >= 0; i--) {
			dt.removeRow(i);
		}

		List<Reader> list = service.queryReader(queryA,queryF);
		
		for(int i =0; i < list.size(); i++){
			Reader reader = list.get(i);
			String status = "正常(1)";
			if(reader.getReader_status() == 0)
				status = "挂失(0)";
			// "读者学(工)号", "读者姓名","读者类型","读者手机","读者邮箱","已借阅次数","总借阅次数","账户余额","读者状态" 
			Object[] obj ={reader.getReader_id(),reader.getReader_number(),reader.getReader_name(),reader.getReader_type(),reader.getReader_phone(),reader.getReader_email(),reader.getReader_book_conut(),reader.getReader_count(),reader.getReader_money(),status};//具体加载的行
			dt.addRow(obj);
		}

	}
}

package com.jier.soft.Action;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.jier.soft.entity.Reader;
import com.jier.soft.service.ReaderService;
import com.jier.soft.service.impl.ReaderServiceImpl;

public class ReaderAction {

	private ReaderService service = new ReaderServiceImpl();
	/***
	 * ���ض�������
	 */
	public void loadReader(DefaultTableModel dt){

		//��Service�л�ȡ����
		List<Reader> list = service.getAllReaders();

		for(int i =0; i < list.size(); i++){
			Reader reader = list.get(i);
			String status = "����(1)";
			if(reader.getReader_status() == 0)
				status = "��ʧ(0)";
			// "����ѧ(��)��", "��������","��������","�����ֻ�","��������","�ѽ��Ĵ���","�ܽ��Ĵ���","�˻����","����״̬" 
			Object[] obj ={reader.getReader_id(),reader.getReader_number(),reader.getReader_name(),reader.getReader_type(),reader.getReader_phone(),reader.getReader_email(),reader.getReader_book_conut(),reader.getReader_count(),reader.getReader_money(),status};//������ص���
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
	 * ɾ������
	 * @return 
	 */
	public boolean deleteReader(int[] ids) {
		return service.deleteReader(ids);
	}

	/***
	 * ��Ӷ���
	 * @return 
	 */
	public boolean addReader(Reader[] readers) {
		return service.addReader(readers);
	}

	/****
	 *�޸Ķ�����Ϣ 
	 *
	 */
	public boolean updateReader(Reader[] readers){
		return service.updateReader(readers); 
	}

	/***
	 *��������ѯ���� 
	 */
	public void queryReader(String queryA,String queryF,DefaultTableModel dt){

		// �������������
		for (int i = dt.getRowCount() - 1; i >= 0; i--) {
			dt.removeRow(i);
		}

		List<Reader> list = service.queryReader(queryA,queryF);
		
		for(int i =0; i < list.size(); i++){
			Reader reader = list.get(i);
			String status = "����(1)";
			if(reader.getReader_status() == 0)
				status = "��ʧ(0)";
			// "����ѧ(��)��", "��������","��������","�����ֻ�","��������","�ѽ��Ĵ���","�ܽ��Ĵ���","�˻����","����״̬" 
			Object[] obj ={reader.getReader_id(),reader.getReader_number(),reader.getReader_name(),reader.getReader_type(),reader.getReader_phone(),reader.getReader_email(),reader.getReader_book_conut(),reader.getReader_count(),reader.getReader_money(),status};//������ص���
			dt.addRow(obj);
		}

	}
}

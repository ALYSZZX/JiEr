package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JButton;

import com.jier.soft.Action.BookInfoAction;
import java.awt.Font;

public class lendbook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_2;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lendbook frame = new lendbook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public lendbook() {
		setBackground(Color.DARK_GRAY);
		setResizable(false);
		setTitle("\u501F\u4E66");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1088, 739);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BFB\u8005\u7F16\u53F7 :");
		label.setBounds(10, 10, 87, 36);
		label.setFont(new Font("����", Font.PLAIN, 16));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u4E66\u520A\u7F16\u53F7 :");
		label_1.setBounds(10, 59, 87, 41);
		label_1.setFont(new Font("����", Font.PLAIN, 16));
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(95, 8, 135, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 64, 135, 36);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("\u6240\u6709\u56FE\u4E66\uFF1A");
		label_2.setBounds(10, 113, 87, 36);
		contentPane.add(label_2);
		
		
		/*String[] title = {"���߱��","����","���Ĵ���","�Ա�","��������","��������","ע������","֤������ʱ��","���֤��","��ϵ�绰","�����ʼ�","������λ"};
		String[][] content = {}; 
		
		DefaultTableModel dt = new DefaultTableModel(content,title);
		table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 144, 711, 311);
		scrollPane.add(table);
		contentPane.add(scrollPane);
		scrollPane.setColumnHeaderView(table);
		
		*/

		JLabel label_3 = new JLabel("\u672C\u6B21\u501F\u9605\u56FE\u4E66\uFF1A");
		label_3.setBounds(14, 390, 158, 36);
		contentPane.add(label_3);
		
		JButton button = new JButton("\u501F\u4E66\u786E\u5B9A");
		button.setBounds(910, 655, 158, 36);
		contentPane.add(button);
		
		
		String[] title = {"ͼ������","����","������","ͼ�����","ͼ������","�������","���ô���","����"};
		
		DefaultTableModel dt = new DefaultTableModel(null,title);
		
		BookInfoAction action = new BookInfoAction();
		action.loadBookInfo(dt);
		
		table_1 = new JTable(dt);
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(20, 150, 1048, 240);
		contentPane.add(scrollPane);
		
		String[] title1 = {"ͼ����","ͼ������","������","�������","����Ա"};
		
		DefaultTableModel dt1 = new DefaultTableModel(null,title);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 439, 1044, 212);
		contentPane.add(scrollPane_1);
		
		table_2 = new JTable();
		scrollPane_1.setColumnHeaderView(table_2);
	}
}

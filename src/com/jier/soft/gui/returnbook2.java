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

public class returnbook2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTable table_2;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					returnbook2 frame = new returnbook2();
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
	public returnbook2() {
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
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(95, 8, 135, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BE5\u8BFB\u8005\u6240\u501F\u56FE\u4E66\uFF1A");
		label_2.setBounds(10, 113, 121, 36);
		contentPane.add(label_2);
		
		
		/*String[] title = {"读者标号","姓名","借阅次数","性别","出生日期","读者类型","注册日期","证件到期时间","身份证号","联系电话","电子邮件","工作单位"};
		String[][] content = {}; 
		
		DefaultTableModel dt = new DefaultTableModel(content,title);
		table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 144, 711, 311);
		scrollPane.add(table);
		contentPane.add(scrollPane);
		scrollPane.setColumnHeaderView(table);
		
		*/

		JLabel label_3 = new JLabel("\u672C\u6B21\u5F52\u8FD8\u56FE\u4E66\uFF1A");
		label_3.setBounds(14, 390, 158, 36);
		contentPane.add(label_3);
		
		JButton button = new JButton("\u786E\u8BA4\u8FD8\u4E66");
		button.setBounds(910, 655, 158, 36);
		contentPane.add(button);
		
		
		String[] title = {"图书名称","作者","出版社","图书类别","图书数量","借出数量","借用次数","单价"};
		
		DefaultTableModel dt = new DefaultTableModel(null,title);
		
		BookInfoAction action = new BookInfoAction();
		action.loadBookInfo(dt);
		
		table_1 = new JTable(dt);
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(20, 150, 1048, 240);
		contentPane.add(scrollPane);
		
		String[] title1 = {"图书编号","图书名称","出版社","借出日期","操作员"};
		
		DefaultTableModel dt1 = new DefaultTableModel(null,title);
		
		
		action.loadBookInfo(dt1);
		
		
		
		table_2 = new JTable();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 439, 1044, 212);
		contentPane.add(scrollPane_1);
		
		
		
		scrollPane_1.setColumnHeaderView(table_2);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0\u4E66\u7C4D");
		btnNewButton.setBounds(910, 393, 158, 36);
		contentPane.add(btnNewButton);
		
		JLabel label_1 = new JLabel("\u8BFB\u8005\u59D3\u540D :");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(259, 10, 87, 36);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(352, 6, 135, 40);
		contentPane.add(textField_1);
		
		JLabel label_4 = new JLabel("\u53EF\u501F\u6570\u91CF :");
		label_4.setFont(new Font("宋体", Font.PLAIN, 16));
		label_4.setBounds(523, 6, 87, 36);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(624, 6, 135, 40);
		contentPane.add(textField_2);
		
		JLabel label_5 = new JLabel("\u663E\u793A\u6240\u6709\u8BFB\u8005");
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		label_5.setBounds(14, 67, 140, 36);
		contentPane.add(label_5);
	}
}

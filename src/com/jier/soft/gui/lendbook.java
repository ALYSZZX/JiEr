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

public class lendbook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

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
		setBounds(100, 100, 737, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BFB\u8005\u7F16\u53F7\uFF1A");
		label.setBounds(10, 10, 72, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u4E66\u520A\u7F16\u53F7\uFF1A");
		label_1.setBounds(10, 38, 72, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(92, 7, 135, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 35, 135, 21);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("\u6240\u6709\u56FE\u4E66\uFF1A");
		label_2.setBounds(10, 63, 72, 15);
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
		

		String[] title = {"图书名称","作者","出版社","图书类别","图书数量","借出数量","借用次数","单价"};
		
		DefaultTableModel dt = new DefaultTableModel(null,title);
		table = new JTable(dt);
		
		BookInfoAction action = new BookInfoAction();
		action.loadBookInfo(dt);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 212, 688, -129);
		scrollPane.add(table);
		contentPane.add(scrollPane);
		scrollPane.setColumnHeaderView(table);
		
		JLabel label_3 = new JLabel("\u672C\u6B21\u501F\u9605\u56FE\u4E66\uFF1A");
		label_3.setBounds(10, 242, 96, 15);
		contentPane.add(label_3);
		
		String[] title1 = {"图书编号","图书名称","出版社","借出日期","操作员"};
		String[][] content1 = {}; 
		
		DefaultTableModel dt1 = new DefaultTableModel(null,title);
		table = new JTable();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(-136, 386, 834, -129);
		scrollPane_1.add(table);
		contentPane.add(scrollPane_1);
		scrollPane_1.setColumnHeaderView(table);
		
		JButton button = new JButton("\u501F\u4E66\u786E\u5B9A");
		button.setBounds(605, 428, 93, 23);
		contentPane.add(button);
	}
}

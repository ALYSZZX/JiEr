package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Window.Type;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.jier.soft.entity.Reader;
import com.jier.soft.service.ReaderService;
import com.jier.soft.service.impl.ReaderServiceImpl;

public class newlyInf extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_2;
	private Reader[] readers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newlyInf frame = new newlyInf();
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
	public newlyInf() {
	    setType(Type.UTILITY);
		setTitle("\u65B0\u589E\u8BFB\u8005\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 491);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("\u7C7B\u578B\u4FE1\u606F");
		panel.setBounds(0, 0, 749, 135);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u6536\u8D39\u6807\u51C6\uFF1A0.2\u5143/\u6BCF\u5929");
		lblNewLabel_1.setBounds(30, 33, 176, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u53EF\u501F\u6570\u91CF\uFF1A10 \u672C");
		lblNewLabel_2.setBounds(225, 33, 197, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u6301\u4E66\u65F6\u95F4\uFF1A30 \u5929");
		lblNewLabel_3.setBounds(483, 33, 164, 29);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u8D85\u671F\u6536\u8D39\u6807\u51C6\uFF1A0.3\u5143/\u6BCF\u5929");
		lblNewLabel_4.setBounds(30, 89, 197, 26);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u8BC1\u4EF6\u6709\u6548\u65F6\u95F4\uFF1A12 \u6708");
		lblNewLabel_5.setBounds(226, 88, 163, 29);
		panel.add(lblNewLabel_5);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 136, 749, 327);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		tabbedPane.addTab("\u57FA\u672C\u4FE1\u606F", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("\u8BFB\u8005\u7F16\u53F7\uFF1A");
		lblNewLabel_7.setBounds(45, 20, 83, 26);
		panel_1.add(lblNewLabel_7);
		
		JLabel label = new JLabel("\u8BFB\u8005\u59D3\u540D\uFF1A");
		label.setBounds(45, 59, 83, 31);
		panel_1.add(label);
		
		JLabel lblNewLabel_8 = new JLabel("\u7535\u5B50\u90AE\u4EF6\uFF1A");
		lblNewLabel_8.setBounds(324, 18, 67, 31);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("\u8054\u7CFB\u7535\u8BDD\uFF1A");
		lblNewLabel_11.setBounds(324, 59, 67, 31);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_14 = new JLabel("\u5907\u6CE8\uFF1A");
		lblNewLabel_14.setBounds(45, 151, 83, 26);
		panel_1.add(lblNewLabel_14);
		
		textField = new JTextField();
		textField.setBounds(113, 23, 162, 21);
		panel_1.add(textField);
		textField.setColumns(10);
	    
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 64, 162, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(382, 23, 162, 21);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(382, 63, 162, 21);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(102, 151, 442, 81);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("\u4FDD\u5B58");
		btnNewButton.setBounds(182, 253, 93, 23);
		panel_1.add(btnNewButton);
		ReaderService service = new ReaderServiceImpl();
		service.addReader(readers);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.setBounds(324, 253, 93, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel label_1 = new JLabel("\u8D26\u6237\u4F59\u989D\uFF1A");
		label_1.setBounds(324, 92, 87, 31);
		panel_1.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(382, 97, 161, 21);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BFB\u8005\u7C7B\u578B\uFF1A");
		label_2.setBounds(42, 100, 67, 23);
		panel_1.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(113, 100, 162, 21);
		comboBox.addItem("教师");
		comboBox.addItem("学生");
		panel_1.add(comboBox);
		
		
	}
}

package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Window.Type;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import com.jier.soft.Action.ReaderAction;

public class Information extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information frame = new Information();
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
	public Information() {
		setTitle("\u8BFB\u8005\u4FE1\u606F\u7EF4\u62A4");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 711, 74);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.setBounds(77, 21, 63, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u5220\u9664");
		btnNewButton_1.setBounds(145, 21, 63, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u7EED\u671F");
		btnNewButton_2.setBounds(217, 21, 63, 23);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\u8865\u5361");
		btnNewButton_3.setBounds(290, 21, 63, 23);
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("\u5BFC\u5165");
		btnNewButton_4.setBounds(362, 21, 63, 23);
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("\u5BFC\u51FA");
		btnNewButton_5.setBounds(433, 21, 68, 23);
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("\u6253\u5370");
		btnNewButton_6.setBounds(507, 21, 68, 23);
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("\u5173\u95ED");
		btnNewButton_7.setBounds(580, 21, 70, 23);
		panel.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("\u65B0\u589E");
		btnNewButton_8.setBounds(10, 22, 61, 23);
		panel.add(btnNewButton_8);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 72, 711, 62);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"\u9009\u62E9\u67E5\u8BE2\u65B9\u5F0F\uFF1A");
		lblNewLabel.setBounds(10, 10, 124, 42);
		panel_1.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(102, 21, 170, 21);
		panel_1.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel(
				"\u8F93\u5165\u8BFB\u8005\u4FE1\u606F\u67E5\u8BE2\uFF1A");
		lblNewLabel_1.setBounds(282, 10, 117, 42);
		panel_1.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(394, 21, 135, 21);
		panel_1.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_9 = new JButton("\u9AD8\u7EA7\u67E5\u8BE2");
		btnNewButton_9.setBounds(608, 20, 93, 23);
		panel_1.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setBounds(539, 20, 62, 23);
		panel_1.add(btnNewButton_10);

		String[] title = { "读者编号", "姓名", "借阅次数", "读者类型", "账户余额" };
		DefaultTableModel dt = new DefaultTableModel(null, title);
		ReaderAction action = new ReaderAction();
		action.loadReader(dt);
		table = new JTable(dt);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 144, 711, 311);	
		contentPane.add(scrollPane);
	}
}

package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class renewbook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					renewbook frame = new renewbook();
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
	public renewbook() {
		setBackground(Color.DARK_GRAY);
		setResizable(false);
		setTitle("\u7EED\u501F");
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
		
		JLabel label_2 = new JLabel("\u8BE5\u8BFB\u8005\u6240\u501F\u56FE\u4E66\uFF1A");
		label_2.setBounds(10, 63, 125, 15);
		contentPane.add(label_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 212, 688, -129);
		contentPane.add(scrollPane);
		
		JLabel label_3 = new JLabel("\u672C\u6B21\u7EED\u501F\u56FE\u4E66\uFF1A");
		label_3.setBounds(10, 242, 96, 15);
		contentPane.add(label_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(-136, 386, 834, -129);
		contentPane.add(scrollPane_1);
		
		JButton button = new JButton("\u501F\u4E66\u786E\u5B9A");
		button.setBounds(605, 428, 93, 23);
		contentPane.add(button);
	}
}

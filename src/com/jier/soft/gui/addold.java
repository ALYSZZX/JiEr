package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class addold extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addold frame = new addold();
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
	public addold() {
		setType(Type.UTILITY);
		setTitle("\u589E\u52A0\u5546\u54C1\uFF08\u91C7\u8D2D\u8FDB\u8D27\uFF09");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("\u67E5\u8BE2\u5546\u54C1\u5217\u8868");
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 342, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u7F16\u53F7\u6216\u540D\u79F0\u67E5\u8BE2\u5546\u54C1");
		label.setBounds(0, 66, 168, 15);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(182, 63, 66, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u52A0\u5165\u6240\u9009\u5546\u54C1");
		btnNewButton.setBounds(258, 62, 57, 23);
		panel.add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 109, 342, 329);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("\u5546\u54C1\u6E05\u5355", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 337, 300);
		panel_2.add(tabbedPane_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		tabbedPane.addTab("\u5546\u54C1\u5217\u8868", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 337, 300);
		panel_3.add(tabbedPane_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("\u6700\u8FD1\u8FDB\u8D27", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(0, 0, 337, 300);
		panel_4.add(tabbedPane_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setToolTipText("");
		panel_1.setBounds(342, 0, 378, 438);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 28, 369, 369);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 369, 369);
		panel_5.add(tabbedPane_1);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.setBounds(22, 406, 57, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5220\u9664");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(89, 406, 58, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u786E\u5B9A");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setBounds(159, 405, 57, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u53D6\u6D88");
		btnNewButton_4.setBounds(226, 406, 60, 23);
		panel_1.add(btnNewButton_4);
	}
}

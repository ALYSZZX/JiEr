package com.jier.soft.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jier.soft.Util.Centre;

public class AboutSoft extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1512280709698582307L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutSoft frame = new AboutSoft();
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
	public AboutSoft() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setBounds(100, 100, 959, 576);
		Centre.centre(this, 959, 576);
		contentPane = new AboutPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 50));
		lblNewLabel.setBounds(325, 30, 407, 79);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u672C\u7CFB\u7EDF\u7531\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 24));
		lblNewLabel_1.setBounds(136, 117, 129, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6731\u653F\u96C4");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 24));
		lblNewLabel_2.setBounds(291, 122, 129, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("\u9EC4\u5FD7\u6602");
		label.setFont(new Font("宋体", Font.BOLD, 24));
		label.setBounds(291, 189, 94, 34);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5F90\u7490\u7476");
		label_1.setFont(new Font("宋体", Font.BOLD, 24));
		label_1.setBounds(291, 253, 118, 34);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u9648\u5BA3\u8BCF");
		label_2.setFont(new Font("宋体", Font.BOLD, 24));
		label_2.setBounds(291, 323, 118, 34);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u738B\u7D20\u59B9");
		label_3.setFont(new Font("宋体", Font.BOLD, 24));
		label_3.setBounds(291, 393, 118, 34);
		contentPane.add(label_3);
		
		JLabel lblNewLabel_3 = new JLabel("\u5171\u540C\u5B8C\u6210\uFF0C\u7248\u6743\u6240\u6709");
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 24));
		lblNewLabel_3.setBounds(468, 393, 315, 34);
		contentPane.add(lblNewLabel_3);
	}
}
class AboutPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1360702537568655925L;
	public AboutPanel() {

	}
	public void paintComponent(Graphics g) {
		int x = 0, y = 0;
		ImageIcon icon = new ImageIcon("image/absoft.png");
		g.drawImage(icon.getImage(), x, y, getSize().width,
				getSize().height, this);
	}
}

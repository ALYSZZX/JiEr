package com.jier.soft.gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jier.soft.Util.Centre;

public class SystemHelp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3596501209979436759L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemHelp frame = new SystemHelp();
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
	public SystemHelp() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setBounds(100, 100, 959, 576);
		setSize(959, 576);
		Centre.centre(this, 959, 576);
		contentPane = new AboutPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setFont(new Font("ËÎÌו", Font.BOLD, 50));
		lblNewLabel.setBounds(325, 30, 407, 79);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8D2D\u4E70\u7CFB\u7EDF\u7248\u6743\u8BE6\u60C5\uFF0C\u8BF7\u8054\u7CFB\u6731\u653F\u96C4\uFF08Tel-15898552269\uFF09");
		lblNewLabel_1.setFont(new Font("ËÎÌו", Font.BOLD, 24));
		lblNewLabel_1.setBounds(197, 164, 644, 74);
		contentPane.add(lblNewLabel_1);
	}
}


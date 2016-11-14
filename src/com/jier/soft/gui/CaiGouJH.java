package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jier.soft.Util.Centre;

public class CaiGouJH extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaiGouJH frame = new CaiGouJH();
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
	
	
	public CaiGouJH() {
		setTitle("\u91C7\u8D2D\u8FDB\u8D27");
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int x,y;
		//采购进货窗口大小
		x=830;
		y=520;
		setSize(x, y);
		Centre.Centre(this,x,y);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		int x,y;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Insets screenInsets=Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration()); 
		y=screenInsets.bottom;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		y=dim.height-y;
		x=dim.width;
		
		setBounds(0, 0, x, y);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

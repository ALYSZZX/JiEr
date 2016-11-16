package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jier.soft.Util.Centre;

import javax.swing.JButton;

public class bookCirculation extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookCirculation frame = new bookCirculation();
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
	public bookCirculation() {
		setTitle("\u56FE\u4E66\u6D41\u901A\u7BA1\u7406");
		int x,y;
		x=465;
		y=100;
		Centre.Centre(this, x, y);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton lendBooks = new JButton("\u501F\u4E66");
		lendBooks.addActionListener(this);
		lendBooks.setActionCommand("lend");
		lendBooks.setBounds(10, 10, 70, 40);
		contentPane.add(lendBooks);
		
		JButton returnBooks = new JButton("\u5F52\u8FD8");
		returnBooks.setBounds(100, 10, 70, 40);
		contentPane.add(returnBooks);
		
		JButton renewBooks = new JButton("\u7EED\u501F");
		renewBooks.addActionListener(this);
		renewBooks.setActionCommand("renew");
		renewBooks.setBounds(190, 10, 70, 40);
		contentPane.add(renewBooks);
		
		JButton lostBooks = new JButton("\u4E22\u5931");
		lostBooks.setBounds(280, 10, 70, 40);
		contentPane.add(lostBooks);
		
		JButton damageBooks = new JButton("\u7834\u635F");
		damageBooks.setBounds(370, 10, 70, 40);
		contentPane.add(damageBooks);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("lend".equals(e.getActionCommand()))
		{
			lendbook lendbook= new lendbook();
			lendbook.setVisible(true);;	
		}
		if("renew".equals(e.getActionCommand()))
		{
			renewbook renewbook= new renewbook();
			renewbook.setVisible(true);;	
		}
		
	}
}

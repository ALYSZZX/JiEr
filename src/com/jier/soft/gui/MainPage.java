package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

import java.awt.FlowLayout;
import java.text.SimpleDateFormat;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.SystemColor;

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
		setTitle("    JiEr \u56FE \u4E66 \u7BA1 \u7406 \u7CFB \u7EDF   ");
		int x, y;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(
				this.getGraphicsConfiguration());
		y = screenInsets.bottom;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		y = dim.height - y;
		x = dim.width;
		setBounds(0, 0, x, y);

		// SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton shiftWork = new JButton("\u6362\u73ED\u767B\u5F55");
		shiftWork.setBounds(10, 59, 93, 23);
		contentPane.add(shiftWork);

		JButton systemHelp = new JButton("\u7CFB\u7EDF\u5E2E\u52A9");
		systemHelp.setBounds(10, 119, 93, 23);
		contentPane.add(systemHelp);

		JButton aboutSoft = new JButton("\u5173\u4E8E\u8F6F\u4EF6");
		aboutSoft.setBounds(10, 178, 93, 23);
		contentPane.add(aboutSoft);

		JButton exitSystem = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		exitSystem.setBounds(10, 231, 93, 23);
		contentPane.add(exitSystem);

		JButton payForIt = new JButton("\u8F6F\u4EF6\u8D2D\u4E70");
		payForIt.setBounds(10, 295, 93, 23);
		contentPane.add(payForIt);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setForeground(Color.CYAN);
		panel.setBounds(123, 59, 1237, 606);
		contentPane.add(panel);
		panel.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("свт╡", Font.PLAIN, 15));
		tabbedPane.setBounds(10, 125, 1202, 481);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		tabbedPane.addTab("\u67E5\u8BE2\u7EDF\u8BA1", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("\u8BFB\u8005\u7BA1\u7406", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("\u501F\u9605\u7BA1\u7406", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("\u4E66\u520A\u7BA1\u7406", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("\u50A8\u84C4\u5361\u7BA1\u7406", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("\u7CFB\u7EDF\u7EF4\u62A4", null, panel_7, null);

		JButton lendBook = new JButton("\u501F\u9605\u56FE\u4E66");
		lendBook.setBounds(27, 35, 93, 23);
		panel.add(lendBook);

		JButton returnBook = new JButton("\u5F52\u8FD8\u56FE\u4E66");
		returnBook.setBounds(171, 35, 93, 23);
		panel.add(returnBook);

		JButton renewBook = new JButton("\u7EED\u501F\u56FE\u4E66");
		renewBook.setBounds(318, 35, 93, 23);
		panel.add(renewBook);

		JButton quiryLending = new JButton("\u501F\u9605\u67E5\u8BE2");
		quiryLending.setBounds(478, 35, 93, 23);
		panel.add(quiryLending);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 665, 1350, 34);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel user = new JLabel("\u5F53\u524D\u64CD\u4F5C\u5458\uFF1A");
		user.setBounds(10, 10, 86, 15);
		panel_1.add(user);

		JLabel lblNewLabel = new JLabel(
				"\u501F\u9605\u56FE\u4E66\uFF1AF2   \u7EED\u501F\u56FE\u4E66\uFF1AF3   \u501F\u9605\u67E5\u8BE2\uFF1AF4   \u5F52\u8FD8\u56FE\u4E66\uFF1AF5   \u9501\u5C4F\uFF1AF6   \u4E66\u520A\u67E5\u8BE2\uFF1AF8  \u63D0\u9192\uFF1AF9   \u9690\u85CF\u663E\u793A\u53F3\u8FB9\u6846\uFF1AF10   \u6267\u884CSQL\uFF1AShift+E   \u53D1\u9001\u77ED\u4FE1Shift+D  ");
		lblNewLabel.setBounds(186, 10, 939, 15);
		panel_1.add(lblNewLabel);

		JLabel systemTime = new JLabel("\u7CFB\u7EDF\u65F6\u95F4\uFF1A");
		systemTime.setBounds(1135, 10, 212, 15);
		panel_1.add(systemTime);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 0, 255));
		panel_8.setBounds(0, 0, 1360, 58);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		JButton button = new JButton("    JiEr \u56FE \u4E66 \u7BA1 \u7406 \u7CFB \u7EDF   ");
		button.setBounds(397, 10, 312, 39);
		panel_8.add(button);
	}
}

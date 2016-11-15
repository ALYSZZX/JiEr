package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JTabbedPane;

import java.awt.Color;
import java.awt.Button;

public class myfirstproject extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myfirstproject frame = new myfirstproject();
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
	@SuppressWarnings("deprecation")
	public myfirstproject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u6362\u73ED\u7BA1\u7406");
		btnNewButton.setBounds(22, 35, 93, 42);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u5355\u636E\u67E5\u8BE2");
		button.setBounds(22, 79, 93, 42);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u9500\u552E\u5206\u6790");
		button_1.setBounds(22, 122, 93, 42);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u5E93\u5B58\u67E5\u8BE2");
		button_2.setBounds(22, 166, 93, 42);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u4ECA\u65E5\u63D0\u9192");
		button_3.setBounds(22, 236, 93, 42);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\u77ED\u4FE1\u7FA4\u53D1");
		button_4.setBounds(22, 276, 93, 42);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("\u8F6F\u4EF6\u5E2E\u52A9");
		button_5.setBounds(22, 316, 93, 42);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("\u8F6F\u4EF6\u8D2D\u4E70\r\n ");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(22, 358, 93, 42);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		button_7.setBounds(22, 422, 93, 23);
		contentPane.add(button_7);
		
		JButton button_14 = new JButton("\u5546\u54C1\u4FE1\u606F");
		button_14.setBounds(125, 422, 93, 23);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("\u4F9B\u5E94\u5546\u8BBE\u7F6E");
		button_15.setBounds(331, 422, 93, 23);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("\u4ED3\u5E93\u8BBE\u7F6E");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setBounds(537, 422, 93, 23);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("\u5458\u5DE5\u4FE1\u606F");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_17.setBounds(743, 422, 93, 23);
		contentPane.add(button_17);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(145, 10, 807, 390);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("进货管理", null, panel, null);
		panel.setLayout(null);
		
		
		JButton btnNewButton_1 = new JButton("\u4ED3\u5E93");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(381, 216, 93, 45);
		panel.add(btnNewButton_1);
		
		JButton button_8 = new JButton("\u5F80\u6765\u8D26\u52A1");
		button_8.setBounds(554, 176, 93, 45);
		panel.add(button_8);
		
		JButton button_9 = new JButton("\u91C7\u8D2D\u5355\u636E\u67E5\u8BE2");
		button_9.setBounds(554, 231, 113, 45);
		panel.add(button_9);
		
		JButton button_10 = new JButton("\u5F53\u524D\u5E93\u5B58\u67E5\u8BE2");
		button_10.setBounds(554, 286, 113, 45);
		panel.add(button_10);
		
		JButton button_11 = new JButton("\u91C7\u8D2D\u9000\u8D27");
		button_11.setBounds(204, 286, 93, 45);
		panel.add(button_11);
		
		JButton button_12 = new JButton("\u91C7\u8D2D\u8FDB\u8D27");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_12.setBounds(204, 179, 93, 45);
		panel.add(button_12);
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		tabbedPane.addTab("销售管理", null, panel_1, null);
		panel_1.setLayout(null);
		
		Button button_13 = new Button("\u4ED3\u5E93");
		button_13.setActionCommand("");
		button_13.setBounds(357, 196, 76, 43);
		panel_1.add(button_13);
		
		Button button_18 = new Button("\u5546\u54C1\u9500\u552E");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_18.setActionCommand("");
		button_18.setBounds(207, 158, 76, 43);
		panel_1.add(button_18);
		
		Button button_19 = new Button("\u987E\u5BA2\u9000\u8D27");
		button_19.setActionCommand("");
		button_19.setBounds(207, 245, 76, 43);
		panel_1.add(button_19);
		
		Button button_21 = new Button("POS\u9500\u552E\u7EDF\u8BA1");
		button_21.setBounds(505, 294, 76, 43);
		panel_1.add(button_21);
		
		Button button_22 = new Button("\u5F53\u524D\u5E93\u5B58\u67E5\u8BE2");
		button_22.setBounds(505, 245, 76, 43);
		panel_1.add(button_22);
		
		Button button_23 = new Button("\u9500\u552E\u5355\u636E\u67E5\u8BE2");
		button_23.setBounds(505, 196, 76, 43);
		panel_1.add(button_23);
		
		Button button_24 = new Button("\u5F80\u6765\u8D26\u52A1");
		button_24.setBounds(505, 141, 76, 43);
		panel_1.add(button_24);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 255, 250));
		tabbedPane.addTab("库存管理", null, panel_2, null);
		panel_2.setLayout(null);
		
		Button button_20 = new Button("\u4ED3\u5E93");
		button_20.setBounds(314, 146, 76, 60);
		panel_2.add(button_20);
		
		Button button_25 = new Button("\u5E93\u5B58\u8C03\u62E8");
		button_25.setBounds(156, 110, 91, 45);
		panel_2.add(button_25);
		
		Button button_26 = new Button("\u62C6\u5206\u6346\u7ED1");
		button_26.setBounds(156, 161, 91, 45);
		panel_2.add(button_26);
		
		Button button_27 = new Button("\u62A5\u635F\u62A5\u6EA2");
		button_27.setBounds(156, 214, 91, 45);
		panel_2.add(button_27);
		
		Button button_28 = new Button("\u5E93\u5B58\u76D8\u70B9");
		button_28.setBounds(452, 110, 91, 45);
		panel_2.add(button_28);
		
		Button button_29 = new Button("\u5E93\u5B58\u53D8\u52A8");
		button_29.setBounds(452, 161, 91, 45);
		panel_2.add(button_29);
		
		Button button_30 = new Button("\u5E93\u5B58\u62A5\u8B66");
		button_30.setBounds(452, 214, 91, 45);
		panel_2.add(button_30);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("统计报表", null, panel_3, null);
		panel_3.setLayout(null);
		
		Button button_31 = new Button("\u4ED3\u5E93");
		button_31.setBounds(335, 164, 76, 62);
		panel_3.add(button_31);
		
		Button button_32 = new Button("\u4F9B\u5E94\u5546\u7EDF\u8BA1");
		button_32.setBounds(137, 125, 112, 33);
		panel_3.add(button_32);
		
		Button button_33 = new Button("\u5546\u54C1\u91C7\u8D2D\u7EDF\u8BA1");
		button_33.setBounds(137, 179, 112, 33);
		panel_3.add(button_33);
		
		Button button_34 = new Button("\u4E1A\u52A1\u91C7\u8D2D");
		button_34.setBounds(137, 230, 112, 33);
		panel_3.add(button_34);
		
		Button button_35 = new Button("\u5E93\u5B58\u53D8\u52A8\u8868");
		button_35.setBounds(316, 253, 112, 33);
		panel_3.add(button_35);
		
		Button button_36 = new Button("\u5E93\u5B58\u6210\u672C\u7EDF\u8BA1");
		button_36.setBounds(316, 101, 112, 33);
		panel_3.add(button_36);
		
		Button button_37 = new Button("\u5BA2\u6237\u9500\u552E\u7EDF\u8BA1");
		button_37.setBounds(492, 101, 112, 33);
		panel_3.add(button_37);
		
		Button button_38 = new Button("\u4E1A\u52A1\u5458\u9500\u552E\u7EDF\u8BA1");
		button_38.setBounds(492, 140, 112, 33);
		panel_3.add(button_38);
		
		Button button_39 = new Button("\u5546\u54C1\u9500\u552E\u7EDF\u8BA1");
		button_39.setBounds(492, 179, 112, 33);
		panel_3.add(button_39);
		
		Button button_40 = new Button("\u5546\u54C1\u9500\u552E\u6392\u884C");
		button_40.setBounds(492, 218, 112, 33);
		panel_3.add(button_40);
		
		Button button_41 = new Button("\u9500\u552E\u8425\u4E1A\u5206\u6790");
		button_41.setBounds(492, 257, 112, 33);
		panel_3.add(button_41);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("日常管理", null, panel_4, null);
		panel_4.setLayout(null);
		
		Button button_42 = new Button("\u4ED3\u5E93");
		button_42.setBounds(319, 175, 76, 64);
		panel_4.add(button_42);
		
		Button button_43 = new Button("\u4F9B\u5E94\u5546\u7BA1\u7406");
		button_43.setBounds(121, 119, 126, 35);
		panel_4.add(button_43);
		
		Button button_44 = new Button("\u8D22\u52A1\u7EFC\u5408\u7BA1\u7406");
		button_44.setBounds(121, 175, 126, 35);
		panel_4.add(button_44);
		
		Button button_45 = new Button("\u4E1A\u52A1\u5458\u7BA1\u7406");
		button_45.setBounds(121, 230, 126, 35);
		panel_4.add(button_45);
		
		Button button_46 = new Button("\u8D60\u54C1\u7BA1\u7406");
		button_46.setBounds(121, 286, 126, 35);
		panel_4.add(button_46);
		
		Button button_47 = new Button("\u5BA2\u6237\u7EFC\u5408\u7BA1\u7406");
		button_47.setBounds(456, 119, 126, 35);
		panel_4.add(button_47);
		
		Button button_48 = new Button("\u5BA2\u6237\u501F\u8D27\u7BA1\u7406");
		button_48.setBounds(456, 175, 126, 35);
		panel_4.add(button_48);
		
		Button button_49 = new Button("\u5408\u540C\u7BA1\u7406");
		button_49.setBounds(456, 230, 126, 35);
		panel_4.add(button_49);
		
		Button button_50 = new Button("\u62A5\u4EF7\u7BA1\u7406");
		button_50.setBounds(456, 286, 126, 35);
		panel_4.add(button_50);
		
		JPanel panel_5 = new JPanel();
		panel_5.setToolTipText("");
		tabbedPane.addTab("系统设置", null, panel_5, null);
		panel_5.setLayout(null);
		
		Button button_51 = new Button("\u5546\u54C1\u7BA1\u7406");
		button_51.setBounds(182, 86, 157, 32);
		panel_5.add(button_51);
		
		Button button_52 = new Button("\u4F9B\u5E94\u5546\u8BBE\u7F6E");
		button_52.setBounds(182, 131, 157, 32);
		panel_5.add(button_52);
		
		Button button_53 = new Button("\u64CD\u4F5C\u5458\u8BBE\u7F6E");
		button_53.setBounds(182, 181, 157, 32);
		panel_5.add(button_53);
		
		Button button_54 = new Button("\u4F1A\u5458\u7BA1\u7406");
		button_54.setBounds(182, 229, 157, 32);
		panel_5.add(button_54);
		
		Button button_55 = new Button("\u7CFB\u7EDF\u8BBE\u7F6E");
		button_55.setBounds(182, 278, 157, 32);
		panel_5.add(button_55);
		
		Button button_56 = new Button("\u4ED3\u5E93\u8BBE\u7F6E");
		button_56.setBounds(532, 86, 157, 32);
		panel_5.add(button_56);
		
		Button button_57 = new Button("\u5BA2\u6237\u8BBE\u7F6E");
		button_57.setBounds(532, 131, 157, 32);
		panel_5.add(button_57);
		
		Button button_58 = new Button("\u5458\u5DE5\u8BBE\u7F6E");
		button_58.setBounds(532, 181, 157, 32);
		panel_5.add(button_58);
		
		Button button_59 = new Button("\u5546\u54C1\u8C03\u4EF7");
		button_59.setBounds(532, 229, 157, 32);
		panel_5.add(button_59);
		
		Button button_60 = new Button("\u7CFB\u7EDF\u7EF4\u62A4");
		button_60.setBounds(532, 278, 157, 32);
		panel_5.add(button_60);
		
	}
}

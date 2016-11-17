package com.jier.soft.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.jier.soft.Util.Centre;
import com.jier.soft.Util.panelWithBackground;

public class MainPage extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8721542428268039721L;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Centre.centre(this, 1366, 725);
		setResizable(false);
	
		JRootPane rp= this.getRootPane(); 
		KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
		InputMap inputMap = rp.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(stroke, "ESCAPE");
		rp.getActionMap().put("ESCAPE", new AbstractAction() {
		/**
			 * 
			 */
			private static final long serialVersionUID = -7237509441184843219L;

		public void actionPerformed(ActionEvent e) { 
		System.exit(0);
		} 
		});
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(Color.BLUE);
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton shiftWork = new JButton("\u6362\u73ED\u767B\u5F55");
		shiftWork.setFont(new Font("微软雅黑", Font.BOLD, 16));
		shiftWork.setBounds(29, 89, 100, 51);
		contentPane.add(shiftWork);

		JButton systemHelp = new JButton("\u7CFB\u7EDF\u5E2E\u52A9");
		systemHelp.setFont(new Font("微软雅黑", Font.BOLD, 16));
		systemHelp.setBounds(29, 180, 100, 51);
		contentPane.add(systemHelp);

		JButton aboutSoft = new JButton("\u5173\u4E8E\u8F6F\u4EF6");
		aboutSoft.setFont(new Font("微软雅黑", Font.BOLD, 16));
		aboutSoft.setBounds(29, 266, 100, 51);
		contentPane.add(aboutSoft);

		JButton exitSystem = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		exitSystem.setFont(new Font("微软雅黑", Font.BOLD, 16));
		exitSystem.setBounds(29, 352, 100, 51);
		exitSystem.addActionListener(this);
		exitSystem.setActionCommand("exit");
		contentPane.add(exitSystem);

		JButton payForIt = new JButton("\u8F6F\u4EF6\u8D2D\u4E70");
		payForIt.setFont(new Font("微软雅黑", Font.BOLD, 16));
		payForIt.setBounds(29, 444, 100, 51);
		contentPane.add(payForIt);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setForeground(Color.CYAN);
		panel.setBounds(167, 59, 1199, 627);
		contentPane.add(panel);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 175, 1242, 452);
		tabbedPane.setFont(new Font("幼圆", Font.PLAIN, 15));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		tabbedPane.addTab("\u67E5\u8BE2\u7EDF\u8BA1", null, panel_2, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		panel_2.setLayout(null);

		JButton btnNewButton = new JButton(
				"\u4E66\u520A\u4FE1\u606F\u67E5\u8BE2");
		btnNewButton.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnNewButton.setBounds(60, 20, 120, 25);
		panel_2.add(btnNewButton);

		JButton button_1 = new JButton("图书借阅查询");
		button_1.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_1.setBounds(60, 60, 120, 25);
		panel_2.add(button_1);

		JButton button_2 = new JButton("借阅历史查询");
		button_2.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_2.setBounds(60, 100, 120, 25);
		panel_2.add(button_2);

		JButton button_3 = new JButton("读者押金查询");
		button_3.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_3.setBounds(60, 180, 120, 25);
		panel_2.add(button_3);

		JButton button_4 = new JButton("收款记录查询");
		button_4.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_4.setBounds(60, 140, 120, 25);
		panel_2.add(button_4);

		JButton button_5 = new JButton("图书破损清单");
		button_5.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_5.setBounds(60, 220, 120, 25);
		panel_2.add(button_5);

		JButton button_6 = new JButton("图书资料盘点");
		button_6.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_6.setBounds(60, 340, 120, 25);
		panel_2.add(button_6);

		JButton button_7 = new JButton("借阅信息统计");
		button_7.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_7.setBounds(60, 300, 120, 25);
		panel_2.add(button_7);

		JButton button_8 = new JButton("图书丢失清单");
		button_8.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_8.setBounds(60, 260, 120, 25);
		panel_2.add(button_8);

		JLabel lblNewLabel_1 = new JLabel("有权限");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(245, 20, 55, 25);
		panel_2.add(lblNewLabel_1);

		JLabel label = new JLabel("有权限");
		label.setFont(new Font("SimSun", Font.PLAIN, 12));
		label.setBounds(245, 60, 55, 25);
		panel_2.add(label);

		JLabel label_1 = new JLabel("有权限");
		label_1.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_1.setBounds(245, 100, 55, 25);
		panel_2.add(label_1);

		JLabel label_2 = new JLabel("有权限");
		label_2.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_2.setBounds(245, 140, 55, 25);
		panel_2.add(label_2);

		JLabel label_3 = new JLabel("有权限");
		label_3.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_3.setBounds(245, 180, 55, 25);
		panel_2.add(label_3);

		JLabel label_4 = new JLabel("有权限");
		label_4.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_4.setBounds(245, 220, 55, 25);
		panel_2.add(label_4);

		JLabel label_5 = new JLabel("有权限");
		label_5.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_5.setBounds(245, 260, 55, 25);
		panel_2.add(label_5);

		JLabel label_6 = new JLabel("有权限");
		label_6.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_6.setBounds(245, 300, 55, 25);
		panel_2.add(label_6);

		JLabel label_7 = new JLabel("有权限");
		label_7.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_7.setBounds(245, 340, 55, 25);
		panel_2.add(label_7);

		JLabel label_8 = new JLabel("按类别对图书数量、借出数等进行统计");
		label_8.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_8.setBounds(381, 340, 226, 25);
		panel_2.add(label_8);

		JLabel label_9 = new JLabel("统计图书或读者借阅频率比较高的信息");
		label_9.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_9.setBounds(381, 300, 226, 25);
		panel_2.add(label_9);

		JLabel label_10 = new JLabel("查询图书丢失记录");
		label_10.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_10.setBounds(381, 260, 226, 25);
		panel_2.add(label_10);

		JLabel label_11 = new JLabel("查询图书破损记录");
		label_11.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_11.setBounds(381, 220, 199, 25);
		panel_2.add(label_11);

		JLabel label_12 = new JLabel("查询有关读者押金信息");
		label_12.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_12.setBounds(381, 180, 199, 25);
		panel_2.add(label_12);

		JLabel label_13 = new JLabel("查询因逾期、破损、丢失等收费记录");
		label_13.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_13.setBounds(381, 140, 218, 25);
		panel_2.add(label_13);

		JLabel label_14 = new JLabel("查询读者的借阅历史信息");
		label_14.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_14.setBounds(381, 100, 199, 25);
		panel_2.add(label_14);

		JLabel label_15 = new JLabel("查询借阅但没有归还的借阅记录");
		label_15.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_15.setBounds(381, 60, 242, 25);
		panel_2.add(label_15);

		JLabel label_16 = new JLabel("查询图书借阅情况");
		label_16.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_16.setBounds(381, 20, 258, 25);
		panel_2.add(label_16);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		tabbedPane.addTab("\u8BFB\u8005\u7BA1\u7406", null, panel_3, null);
		panel_3.setLayout(null);

		JButton button_9 = new JButton("读者信息维护");
		button_9.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_9.setBounds(60, 20, 120, 25);
		panel_3.add(button_9);

		JButton button_10 = new JButton("读者押金管理");
		button_10.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_10.setBounds(60, 60, 120, 25);
		panel_3.add(button_10);

		JButton button_11 = new JButton("读者类型设置");
		button_11.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_11.setBounds(60, 100, 120, 25);
		panel_3.add(button_11);

		JLabel label_17 = new JLabel("有权限");
		label_17.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_17.setBounds(245, 100, 55, 25);
		panel_3.add(label_17);

		JLabel label_18 = new JLabel("有权限");
		label_18.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_18.setBounds(245, 60, 55, 25);
		panel_3.add(label_18);

		JLabel label_19 = new JLabel("有权限");
		label_19.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_19.setBounds(245, 20, 55, 25);
		panel_3.add(label_19);

		JLabel label_20 = new JLabel("管理所有的读者信息，包括录入，修改，删除等");
		label_20.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_20.setBounds(381, 20, 258, 25);
		panel_3.add(label_20);

		JLabel label_21 = new JLabel("管理读者押金信息，对押金进行收取，退还，没收的操作");
		label_21.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_21.setBounds(381, 60, 323, 25);
		panel_3.add(label_21);

		JLabel label_22 = new JLabel("设置读者类别，方便对读者信息进行管理");
		label_22.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_22.setBounds(381, 100, 297, 25);
		panel_3.add(label_22);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.CYAN);
		tabbedPane.addTab("\u501F\u9605\u7BA1\u7406", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel label_23 = new JLabel("有权限");
		label_23.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_23.setBounds(245, 100, 55, 25);
		panel_4.add(label_23);

		JLabel label_24 = new JLabel("有权限");
		label_24.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_24.setBounds(245, 60, 55, 25);
		panel_4.add(label_24);

		JLabel label_25 = new JLabel("有权限");
		label_25.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_25.setBounds(245, 20, 55, 25);
		panel_4.add(label_25);

		JButton TuShuLiuTong = new JButton("图书流通管理");
		TuShuLiuTong.addActionListener(this);
		TuShuLiuTong.setActionCommand("tushuliutong");
		TuShuLiuTong.setFont(new Font("SimSun", Font.PLAIN, 12));
		TuShuLiuTong.setBounds(60, 20, 120, 25);
		panel_4.add(TuShuLiuTong);

		JButton button_13 = new JButton("预期信息管理");
		button_13.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_13.setBounds(60, 60, 120, 25);
		panel_4.add(button_13);

		JButton button_14 = new JButton("逾期借阅管理");
		button_14.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_14.setBounds(60, 100, 120, 25);
		panel_4.add(button_14);

		JLabel label_26 = new JLabel("对到期没有归还的图书进行查询和管理");
		label_26.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_26.setBounds(381, 100, 242, 25);
		panel_4.add(label_26);

		JLabel label_27 = new JLabel("对预借信息进行满足，删除等管理");
		label_27.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_27.setBounds(381, 60, 242, 25);
		panel_4.add(label_27);

		JLabel label_28 = new JLabel("进行借书、还书、续借、破损、丢失等操作");
		label_28.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_28.setBounds(381, 20, 258, 25);
		panel_4.add(label_28);

		JButton button_15 = new JButton("自动取书管理");
		button_15.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_15.setBounds(60, 140, 120, 25);
		panel_4.add(button_15);

		JLabel label_29 = new JLabel("有权限");
		label_29.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_29.setBounds(245, 140, 55, 25);
		panel_4.add(label_29);

		JLabel label_30 = new JLabel("进行批量借书、还书等操作");
		label_30.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_30.setBounds(381, 140, 242, 25);
		panel_4.add(label_30);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.CYAN);
		tabbedPane.addTab("\u4E66\u520A\u7BA1\u7406", null, panel_5, null);
		panel_5.setLayout(null);

		JButton bookMaintenance = new JButton("书刊信息维护");
		bookMaintenance.setFont(new Font("SimSun", Font.PLAIN, 12));
		bookMaintenance.setBounds(60, 20, 120, 25);
		bookMaintenance.addActionListener(this);
		bookMaintenance.setActionCommand("bookmaintenance");
		panel_5.add(bookMaintenance);

		JButton button_17 = new JButton("出版单位设置");
		button_17.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_17.setBounds(60, 60, 120, 25);
		panel_5.add(button_17);

		JButton button_18 = new JButton("书刊类别设置");
		button_18.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_18.setBounds(60, 100, 120, 25);
		panel_5.add(button_18);

		JButton button_19 = new JButton("书刊条码打印");
		button_19.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_19.setBounds(60, 140, 120, 25);
		panel_5.add(button_19);

		JLabel label_31 = new JLabel("有权限");
		label_31.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_31.setBounds(245, 20, 55, 25);
		panel_5.add(label_31);

		JLabel label_32 = new JLabel("有权限");
		label_32.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_32.setBounds(245, 60, 55, 25);
		panel_5.add(label_32);

		JLabel label_33 = new JLabel("有权限");
		label_33.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_33.setBounds(245, 100, 55, 25);
		panel_5.add(label_33);

		JLabel label_34 = new JLabel("有权限");
		label_34.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_34.setBounds(245, 140, 55, 25);
		panel_5.add(label_34);

		JLabel label_35 = new JLabel("打印自定义的书刊条码，方便管理");
		label_35.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_35.setBounds(381, 140, 258, 25);
		panel_5.add(label_35);

		JLabel label_36 = new JLabel("设置书刊类别，系统默认使用《中国法》");
		label_36.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_36.setBounds(381, 100, 242, 25);
		panel_5.add(label_36);

		JLabel label_37 = new JLabel("维护出版社等出版单位信息，方便录入及管理");
		label_37.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_37.setBounds(381, 60, 242, 25);
		panel_5.add(label_37);

		JLabel label_38 = new JLabel("添加及管理所有的图书、期刊、杂志等信息 ");
		label_38.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_38.setBounds(381, 20, 258, 25);
		panel_5.add(label_38);

		JButton button_20 = new JButton("书刊销售管理");
		button_20.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_20.setBounds(60, 220, 120, 25);
		panel_5.add(button_20);

		JButton button_21 = new JButton("书刊库存管理");
		button_21.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_21.setBounds(60, 180, 120, 25);
		panel_5.add(button_21);

		JLabel label_39 = new JLabel("有权限");
		label_39.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_39.setBounds(245, 183, 55, 25);
		panel_5.add(label_39);

		JLabel label_40 = new JLabel("有权限");
		label_40.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_40.setBounds(245, 223, 55, 25);
		panel_5.add(label_40);

		JLabel label_41 = new JLabel("书刊出入库变动明细查询");
		label_41.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_41.setBounds(381, 183, 242, 25);
		panel_5.add(label_41);

		JLabel label_42 = new JLabel("图书对外销售管理");
		label_42.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_42.setBounds(381, 223, 242, 25);
		panel_5.add(label_42);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.CYAN);
		tabbedPane.addTab("储值卡管理", null, panel_6, null);

		JLabel label_43 = new JLabel("有权限");
		label_43.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_43.setBounds(245, 100, 55, 25);
		panel_6.add(label_43);

		JLabel label_44 = new JLabel("有权限");
		label_44.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_44.setBounds(245, 60, 55, 25);
		panel_6.add(label_44);

		JLabel label_45 = new JLabel("有权限");
		label_45.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_45.setBounds(245, 20, 55, 25);
		panel_6.add(label_45);

		JButton button_22 = new JButton("储值卡添加");
		button_22.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_22.setBounds(60, 20, 120, 25);
		panel_6.add(button_22);

		JButton button_23 = new JButton("储值卡充值");
		button_23.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_23.setBounds(60, 60, 120, 25);
		panel_6.add(button_23);

		JButton button_24 = new JButton("储值卡注销");
		button_24.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_24.setBounds(60, 100, 120, 25);
		panel_6.add(button_24);

		JLabel label_46 = new JLabel("注销读者储值卡（退卡）");
		label_46.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_46.setBounds(381, 100, 242, 25);
		panel_6.add(label_46);

		JLabel label_47 = new JLabel("修改读者储值卡余额信息");
		label_47.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_47.setBounds(381, 60, 242, 25);
		panel_6.add(label_47);

		JLabel label_48 = new JLabel("为读者分配储值卡");
		label_48.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_48.setBounds(381, 20, 258, 25);
		panel_6.add(label_48);

		JButton button_25 = new JButton("储值卡管理");
		button_25.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_25.setBounds(60, 140, 120, 25);
		panel_6.add(button_25);

		JLabel label_49 = new JLabel("有权限");
		label_49.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_49.setBounds(245, 140, 55, 25);
		panel_6.add(label_49);

		JLabel label_50 = new JLabel("查看读者储值卡信息，批量修改、删除、添加储值卡等");
		label_50.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_50.setBounds(381, 140, 242, 25);
		panel_6.add(label_50);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.CYAN);
		tabbedPane.addTab("系统维护", null, panel_7, null);

		JButton button_26 = new JButton("修改密码");
		button_26.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_26.setBounds(60, 20, 120, 25);
		panel_7.add(button_26);

		JButton button_27 = new JButton("系统初始化");
		button_27.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_27.setBounds(60, 60, 120, 25);
		panel_7.add(button_27);

		JButton button_28 = new JButton("操作员管理");
		button_28.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_28.setBounds(60, 100, 120, 25);
		panel_7.add(button_28);

		JButton button_29 = new JButton("数据库备份恢复");
		button_29.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_29.setBounds(60, 180, 120, 25);
		panel_7.add(button_29);

		JButton button_30 = new JButton("操作日志管理");
		button_30.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_30.setBounds(60, 140, 120, 25);
		panel_7.add(button_30);

		JButton button_31 = new JButton("系统参数设置");
		button_31.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_31.setBounds(60, 220, 120, 25);
		panel_7.add(button_31);

		JButton button_33 = new JButton("图书馆信息设置");
		button_33.setHorizontalAlignment(SwingConstants.LEFT);
		button_33.setFont(new Font("宋体", Font.PLAIN, 12));
		button_33.setBounds(60, 300, 120, 25);
		panel_7.add(button_33);

		JButton button_34 = new JButton("收费模式设置");
		button_34.setFont(new Font("SimSun", Font.PLAIN, 12));
		button_34.setBounds(60, 260, 120, 25);
		panel_7.add(button_34);

		JLabel label_51 = new JLabel("有权限");
		label_51.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_51.setBounds(245, 20, 55, 25);
		panel_7.add(label_51);

		JLabel label_52 = new JLabel("有权限");
		label_52.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_52.setBounds(245, 60, 55, 25);
		panel_7.add(label_52);

		JLabel label_53 = new JLabel("有权限");
		label_53.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_53.setBounds(245, 100, 55, 25);
		panel_7.add(label_53);

		JLabel label_54 = new JLabel("有权限");
		label_54.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_54.setBounds(245, 140, 55, 25);
		panel_7.add(label_54);

		JLabel label_55 = new JLabel("有权限");
		label_55.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_55.setBounds(245, 180, 55, 25);
		panel_7.add(label_55);

		JLabel label_56 = new JLabel("有权限");
		label_56.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_56.setBounds(245, 220, 55, 25);
		panel_7.add(label_56);

		JLabel label_57 = new JLabel("有权限");
		label_57.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_57.setBounds(245, 260, 55, 25);
		panel_7.add(label_57);

		JLabel label_58 = new JLabel("有权限");
		label_58.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_58.setBounds(245, 300, 55, 25);
		panel_7.add(label_58);

		JLabel label_61 = new JLabel("设置图书馆的基本信息");
		label_61.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_61.setBounds(381, 300, 226, 25);
		panel_7.add(label_61);

		JLabel label_62 = new JLabel("设置收费模式");
		label_62.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_62.setBounds(381, 260, 226, 25);
		panel_7.add(label_62);

		JLabel label_63 = new JLabel("维护单位、部门、书室、架位等基本字典信息");
		label_63.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_63.setBounds(381, 220, 199, 25);
		panel_7.add(label_63);

		JLabel label_64 = new JLabel("对数据库进行备份和恢复");
		label_64.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_64.setBounds(381, 180, 199, 25);
		panel_7.add(label_64);

		JLabel label_65 = new JLabel("查看软件操作日志");
		label_65.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_65.setBounds(381, 140, 218, 25);
		panel_7.add(label_65);

		JLabel label_66 = new JLabel("对操作员的信息及权限进行管理");
		label_66.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_66.setBounds(381, 100, 199, 25);
		panel_7.add(label_66);

		JLabel label_67 = new JLabel("首次使用时对数据库初始化");
		label_67.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_67.setBounds(381, 60, 242, 25);
		panel_7.add(label_67);

		JLabel label_68 = new JLabel("修改当前操作员密码");
		label_68.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_68.setBounds(381, 20, 258, 25);
		panel_7.add(label_68);

		JButton lendBook = new JButton("\u501F\u9605\u56FE\u4E66");
		lendBook.setBounds(72, 65, 102, 48);
		lendBook.setFont(new Font("幼圆", Font.BOLD, 16));

		JButton returnBook = new JButton("\u5F52\u8FD8\u56FE\u4E66");
		returnBook.setBounds(245, 65, 102, 48);
		returnBook.setFont(new Font("幼圆", Font.BOLD, 16));

		JButton renewBook = new JButton("\u7EED\u501F\u56FE\u4E66");
		renewBook.setBounds(427, 65, 102, 48);
		renewBook.setFont(new Font("幼圆", Font.BOLD, 16));

		JButton quiryLending = new JButton("\u501F\u9605\u67E5\u8BE2");
		quiryLending.setBounds(609, 65, 102, 48);
		quiryLending.setFont(new Font("幼圆", Font.BOLD, 16));
		panel.setLayout(null);
		panel.add(lendBook);
		panel.add(returnBook);
		panel.add(renewBook);
		panel.add(quiryLending);
		panel.add(tabbedPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 685, 1376, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel user = new JLabel("\u5F53\u524D\u64CD\u4F5C\u5458\uFF1A");
		user.setFont(new Font("SimSun", Font.PLAIN, 12));
		user.setBounds(10, 10, 86, 15);
		panel_1.add(user);

		JLabel lblNewLabel = new JLabel(
				"\u501F\u9605\u56FE\u4E66\uFF1AF2   \u7EED\u501F\u56FE\u4E66\uFF1AF3   \u501F\u9605\u67E5\u8BE2\uFF1AF4   \u5F52\u8FD8\u56FE\u4E66\uFF1AF5   \u9501\u5C4F\uFF1AF6   \u4E66\u520A\u67E5\u8BE2\uFF1AF8  \u63D0\u9192\uFF1AF9   \u9690\u85CF\u663E\u793A\u53F3\u8FB9\u6846\uFF1AF10   \u6267\u884CSQL\uFF1AShift+E   \u53D1\u9001\u77ED\u4FE1Shift+D  ");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 12));
		lblNewLabel.setBounds(186, 10, 939, 15);
		panel_1.add(lblNewLabel);

		JLabel systemTime = new JLabel("\u7CFB\u7EDF\u65F6\u95F4\uFF1A");
		systemTime.setFont(new Font("SimSun", Font.PLAIN, 12));
		systemTime.setBounds(1135, 10, 212, 15);
		panel_1.add(systemTime);

		Image image = new ImageIcon("source/1.png").getImage();
		JPanel panel_8 = new panelWithBackground(image);
		panel_8.setBackground(new Color(255, 0, 255));
		panel_8.setBounds(0, 0, 1376, 59);
		contentPane.add(panel_8);

		JButton button = new JButton(
				"    JiEr \u56FE \u4E66 \u7BA1 \u7406 \u7CFB \u7EDF   ");
		button.setFont(new Font("幼圆", Font.BOLD, 16));
		button.setBounds(550, 0, 300, 59);
		Color c=new Color(0,0,255);//背影颜色随便设任意值,只起占位作用。  
		button.setBackground(c);
		button.setOpaque(false);//设置背景透明  
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (JOptionPane.showConfirmDialog(null, "正在打开JiEr官网，是否继续？",
						"提醒", JOptionPane.YES_NO_OPTION) == 0)
				{
					if (java.awt.Desktop.isDesktopSupported()) {
						try {
							// 创建一个URI实例
							java.net.URI uri = java.net.URI
									.create("https://msdn.microsoft.com/");
							// 获取当前系统桌面扩展
							java.awt.Desktop dp = java.awt.Desktop.getDesktop();
							// 判断系统桌面是否支持要执行的功能
							if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
								// 获取系统默认浏览器打开链接
								dp.browse(uri);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		panel_8.setLayout(null);
		button.setBackground(UIManager.getColor("CheckBox.light"));
		panel_8.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("tushuliutong".equals(e.getActionCommand()))
		{
			bookCirculation tushuliutong = new bookCirculation();
			tushuliutong.setVisible(true);
		}
		if("exit".equals(e.getActionCommand()))
		{
			if (JOptionPane.showConfirmDialog(null, "正在关闭，是否继续？",
					"提醒", JOptionPane.YES_NO_OPTION) == 0)
			{

				System.exit(0);
			}
		}
		if("bookmaintenance".equals(e.getActionCommand()))
		{
			
			bookMaintenance bookMaintenance=new bookMaintenance();	
			bookMaintenance.setVisible(true);
		}
	}
}

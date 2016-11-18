package com.jier.soft.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jier.soft.Action.ReaderAction;
import com.jier.soft.Util.Centre;
import com.jier.soft.entity.Reader;

public class AddReader extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4809620258702152597L;
	private ReaderInfo readerinfo;
	private JPanel contentPane;
	private JTextField number;
	private JTextField email;
	private JTextField phone;
	private JTextField money;
	private JTextField name;
	private JTextField status;
	private JComboBox<String> comboBox;
	private ReaderAction action = new ReaderAction();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddReader frame = new AddReader(null);
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
	public AddReader(ReaderInfo readerinfo) {
		this.readerinfo = readerinfo;
	   // setType(Type.UTILITY);
		setTitle("\u65B0\u589E\u8BFB\u8005\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(996, 645);
		Centre.centre(this, 996, 645);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new BackPanel();
		panel.setToolTipText("\u7C7B\u578B\u4FE1\u606F");
		panel.setBounds(0, 0, 978, 136);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u6536\u8D39\u6807\u51C6\uFF1A0.2\u5143/\u6BCF\u5929");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(111, 33, 214, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u53EF\u501F\u6570\u91CF\uFF1A10 \u672C");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(392, 33, 197, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u6301\u4E66\u65F6\u95F4\uFF1A\u89C1\u56FE\u4E66\u4FE1\u606F");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(633, 33, 197, 29);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u8D85\u671F\u6536\u8D39\u6807\u51C6\uFF1A0.3\u5143/\u6BCF\u5929");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(145, 89, 240, 26);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u8BC1\u4EF6\u6709\u6548\u65F6\u95F4\uFF1A12 \u6708");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(544, 88, 214, 29);
		panel.add(lblNewLabel_5);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 136, 978, 462);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new Back1Panel();
		panel_1.setToolTipText("");
		tabbedPane.addTab("\u57FA\u672C\u4FE1\u606F", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("\u8BFB\u8005\u5B66(\u5DE5)\u53F7\uFF1A");
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(78, 20, 137, 47);
		panel_1.add(lblNewLabel_7);
		
		JLabel label = new JLabel("\u8BFB\u8005\u59D3\u540D\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(114, 80, 96, 39);
		panel_1.add(label);
		
		JLabel lblNewLabel_8 = new JLabel("\u7535\u5B50\u90AE\u4EF6\uFF1A");
		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(487, 18, 90, 31);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("\u8054\u7CFB\u7535\u8BDD\uFF1A");
		lblNewLabel_11.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(487, 80, 112, 31);
		panel_1.add(lblNewLabel_11);
		
		number = new JTextField();
		number.setFont(new Font("宋体", Font.PLAIN, 18));
		number.setBounds(259, 13, 162, 44);
		panel_1.add(number);
		number.setColumns(10);
		
		email = new JTextField();
		email.setFont(new Font("宋体", Font.PLAIN, 18));
		email.setBounds(643, 14, 162, 43);
		panel_1.add(email);
		email.setColumns(10);
		
		phone = new JTextField();
		phone.setFont(new Font("宋体", Font.PLAIN, 18));
		phone.setBounds(643, 76, 162, 43);
		panel_1.add(phone);
		phone.setColumns(10);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.setBounds(364, 319, 142, 52);
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("add");
		panel_1.add(btnNewButton);
		
		JLabel label_1 = new JLabel("\u8D26\u6237\u4F59\u989D\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(487, 133, 112, 50);
		panel_1.add(label_1);
		
		money = new JTextField();
		money.setFont(new Font("宋体", Font.PLAIN, 18));
		money.setBounds(644, 139, 161, 43);
		panel_1.add(money);
		money.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BFB\u8005\u7C7B\u578B\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(114, 141, 120, 34);
		panel_1.add(label_2);
		
		comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox.setBounds(259, 139, 162, 44);
		comboBox.addItem("教师");
		comboBox.addItem("学生");
		panel_1.add(comboBox);
		
		name = new JTextField();
		name.setFont(new Font("宋体", Font.PLAIN, 18));
		name.setColumns(10);
		name.setBounds(259, 76, 161, 43);
		panel_1.add(name);
		
		JLabel status111 = new JLabel("\u8BFB\u8005\u72B6\u6001\uFF1A");
		status111.setFont(new Font("宋体", Font.PLAIN, 18));
		status111.setBounds(114, 208, 120, 34);
		panel_1.add(status111);
		
		status = new JTextField();
		status.setEditable(false);
		status.setFont(new Font("宋体", Font.PLAIN, 18));
		status.setText("1");
		status.setColumns(10);
		status.setBounds(260, 196, 161, 43);
		panel_1.add(status);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("add".equals(e.getActionCommand())){
			Reader reader = new Reader();
			reader.setReader_number(Integer.parseInt(number.getText()));
			reader.setReader_name(name.getText());
			String type = (String) comboBox.getSelectedItem();
			reader.setReader_type(type);//类型
			reader.setReader_phone(phone.getText());
			reader.setReader_email(email.getText());
			reader.setReader_status(Integer.parseInt(status.getText()));
			reader.setReader_book_conut(0);
			reader.setReader_count(0);
			reader.setReader_money(Double.parseDouble(money.getText()));
			Reader[] readers = {reader};
			boolean flag =action.addReader(readers);
			if(flag){
				this.dispose();
				this.readerinfo.flash();
			}
			
		}
		
	}
}

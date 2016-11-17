package com.jier.soft.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jier.soft.Action.BookInfoAction;
import com.jier.soft.Util.Centre;

public class bookMaintenance extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5525047071968833741L;
	private JPanel contentPane;
	private JTextField textField;
	DefaultTableModel dt;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookMaintenance frame = new bookMaintenance();
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
	public bookMaintenance() {
		setTitle("\u4E66\u520A\u4FE1\u606F\u7EF4\u62A4");
	    this.setResizable(false);
	    this.setSize(800, 600);
		Centre.centre(this, 800, 600);
	    contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 794, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("\u589E\u52A0");
		button.setBounds(100, 10, 100, 30);
		panel.add(button);
		
		JButton button_1 = new JButton("\u4FEE\u6539");
		button_1.setBounds(350, 10, 100, 30);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u5220\u9664");
		button_2.setBounds(600, 10, 100, 30);
		panel.add(button_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 48, 794, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9009\u62E9\u67E5\u8BE2\u65B9\u5F0F\uFF1A");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 12));
		lblNewLabel.setBounds(43, 10, 95, 20);
		panel_1.add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(132, 10, 144, 20);
		comboBox.addItem("���ⷽʽ");
		comboBox.addItem("�鿯���");
		comboBox.addItem("�鿯����");
		comboBox.addItem("��������");
		comboBox.addItem("�鿯����");
		comboBox.addItem("���浥λ");
		comboBox.addItem("�鿯����");
		comboBox.addItem("ISBN���");
		
		
		
		panel_1.add(comboBox);
		JLabel label = new JLabel("\u8F93\u5165\u67E5\u8BE2\u4FE1\u606F\uFF1A");
		label.setFont(new Font("����", Font.PLAIN, 12));
		label.setBounds(343, 10, 95, 20);
		panel_1.add(label);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setBounds(662, 8, 80, 25);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(448, 10, 160, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 86, 804, 508);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		String[] title = {
				"ͼ������","����","ͼ�����","�ܲ���","�������","ʣ�����","�ɽ���ʱ��","�������","������","I S B N","�������","����","״̬"};
		dt = new DefaultTableModel(null,title);	
		BookInfoAction bookinfo=new BookInfoAction();
		bookinfo.loadBookInfo(dt);
		
		table=new JTable(dt);
		table.setBackground(Color.WHITE);
		
		
		
		/*setAutoResizeMode:�趨����Զ�������AUTO_RESIZE_OFF  ���Զ������еĿ�ȣ�ʹ�ù�������
		AUTO_RESIZE_NEXT_COLUMN  �� UI �е�����ʱ��������һ�н����෴����ĵ�����
		AUTO_RESIZE_SUBSEQUENT_COLUMNS  �� UI �����У����ĺ������Ա����ܿ�Ȳ��䣬����Ĭ�ϵ���Ϊ��
		AUTO_RESIZE_LAST_COLUMN  �����еĵ�����С�����У�ֻ�����һ�н��е�����
		AUTO_RESIZE_ALL_COLUMNS  �����еĵ�����С�����У��������������е��С�*/
		
		
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		scrollPane.setBounds(0, 0, 794, 486);
		panel_2.add(scrollPane);
	}
}

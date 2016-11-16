package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jier.soft.Util.Centre;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTable;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class bookMaintenance extends JFrame {

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
	@SuppressWarnings("null")
	public bookMaintenance() {
		setTitle("\u4E66\u520A\u4FE1\u606F\u7EF4\u62A4");
	    this.setResizable(false);
	    this.setSize(800, 600);
		Centre.Centre(this, 800, 600);
	    contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
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
		panel_1.setBounds(0, 48, 794, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9009\u62E9\u67E5\u8BE2\u65B9\u5F0F\uFF1A");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 12));
		lblNewLabel.setBounds(43, 10, 95, 20);
		panel_1.add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox();
//		DefaultComboBoxModel model = new DefaultComboBoxModel(); 
//		model.addElement("�Զ���"); 
//		model.addElement("�Զ���1"); 
//		JComboBox comboBox = new JComboBox(model);
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
		
		
		String[] title = {"ͼ������","�ܲ���","�������","ʣ�����","�������","�鿯���","�鿯����","�鿯����","�����","I S B N",
				"����","������","�Ա���","�������","��������","�ݲط���","��������","�������","�ʶ�����","����ISS","����cn","��������",
				"���쵥λ","�鿯����","������ʽ","�鿯����","�Ǽ�ʱ��","����","���ݼ��","��ע"};
		dt = new DefaultTableModel(null,title);
		table = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u56FE\u4E66\u540D\u79F0", "\u603B\u518C\u6570", "\u501F\u51FA\u518C\u6570", "\u5269\u4F59\u518C\u6570", "\u501F\u51FA\u6B21\u6570", "\u4E66\u520A\u7F16\u53F7", "\u4E66\u520A\u6761\u7801", "\u4E66\u520A\u5206\u7C7B", "\u4E3B\u9898\u8BCD", "I S B N", "\u4F5C\u8005", "\u51FA\u7248\u793E", "\u4E1B\u7F16\u540D", "\u51FA\u7248\u6B21\u6570", "\u51FA\u7248\u65E5\u671F", "\u9986\u85CF\u5206\u7C7B", "\u6240\u5728\u4E66\u5BA4", "\u6240\u5728\u4E66\u67B6", "\u9002\u8BFB\u5E74\u9F84", "\u56FD\u9645ISS", "\u56FD\u5185cn", "\u51FA\u7248\u5468\u671F", "\u4E3B\u529E\u5355\u4F4D", "\u4E66\u520A\u8BED\u8A00", "\u8F7D\u4F53\u5F62\u5F0F", "\u4E66\u520A\u9644\u4EF6", "\u767B\u8BB0\u65F6\u95F4", "\u5355\u4EF7", "\u5185\u5BB9\u7B80\u4ECB", "\u5907\u6CE8"
			}
		));	
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

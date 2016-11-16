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
//		model.addElement("自动化"); 
//		model.addElement("自动化1"); 
//		JComboBox comboBox = new JComboBox(model);
		comboBox.setBounds(132, 10, 144, 20);
		comboBox.addItem("任意方式");
		comboBox.addItem("书刊编号");
		comboBox.addItem("书刊名称");
		comboBox.addItem("作者姓名");
		comboBox.addItem("书刊条码");
		comboBox.addItem("出版单位");
		comboBox.addItem("书刊分类");
		comboBox.addItem("ISBN编号");
		
		
		
		panel_1.add(comboBox);
		
		JLabel label = new JLabel("\u8F93\u5165\u67E5\u8BE2\u4FE1\u606F\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 12));
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
		
		
		String[] title = {"图书名称","总册数","借出册数","剩余册数","借出次数","书刊编号","书刊条码","书刊分类","主题词","I S B N",
				"作者","出版社","丛编名","出版次数","出版日期","馆藏分类","所在书室","所在书架","适读年龄","国际ISS","国内cn","出版周期",
				"主办单位","书刊语言","载体形式","书刊附件","登记时间","单价","内容简介","备注"};
		dt = new DefaultTableModel(null,title);
		table = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u56FE\u4E66\u540D\u79F0", "\u603B\u518C\u6570", "\u501F\u51FA\u518C\u6570", "\u5269\u4F59\u518C\u6570", "\u501F\u51FA\u6B21\u6570", "\u4E66\u520A\u7F16\u53F7", "\u4E66\u520A\u6761\u7801", "\u4E66\u520A\u5206\u7C7B", "\u4E3B\u9898\u8BCD", "I S B N", "\u4F5C\u8005", "\u51FA\u7248\u793E", "\u4E1B\u7F16\u540D", "\u51FA\u7248\u6B21\u6570", "\u51FA\u7248\u65E5\u671F", "\u9986\u85CF\u5206\u7C7B", "\u6240\u5728\u4E66\u5BA4", "\u6240\u5728\u4E66\u67B6", "\u9002\u8BFB\u5E74\u9F84", "\u56FD\u9645ISS", "\u56FD\u5185cn", "\u51FA\u7248\u5468\u671F", "\u4E3B\u529E\u5355\u4F4D", "\u4E66\u520A\u8BED\u8A00", "\u8F7D\u4F53\u5F62\u5F0F", "\u4E66\u520A\u9644\u4EF6", "\u767B\u8BB0\u65F6\u95F4", "\u5355\u4EF7", "\u5185\u5BB9\u7B80\u4ECB", "\u5907\u6CE8"
			}
		));	
		/*setAutoResizeMode:设定表的自动调整，AUTO_RESIZE_OFF  不自动调整列的宽度；使用滚动条。
		AUTO_RESIZE_NEXT_COLUMN  在 UI 中调整列时，对其下一列进行相反方向的调整。
		AUTO_RESIZE_SUBSEQUENT_COLUMNS  在 UI 调整中，更改后续列以保持总宽度不变，这是默认的行为。
		AUTO_RESIZE_LAST_COLUMN  在所有的调整大小操作中，只对最后一列进行调整。
		AUTO_RESIZE_ALL_COLUMNS  在所有的调整大小操作中，按比例调整所有的列。*/
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		scrollPane.setBounds(0, 0, 794, 486);
		panel_2.add(scrollPane);
	}
}

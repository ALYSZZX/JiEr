package com.jier.soft.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jier.soft.Action.ReaderAction;
import com.jier.soft.Util.Centre;

public class ReaderInfo extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1457511339404888173L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private ReaderAction action = new ReaderAction();
	private DefaultTableModel dt;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReaderInfo frame = new ReaderInfo();
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
	public ReaderInfo() {
		setTitle("\u8BFB\u8005\u4FE1\u606F\u7EF4\u62A4");
		//setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setBounds(100, 100, 996, 645);
		setSize(996, 645);
		Centre.centre(this, 996, 645);
		contentPane = new BackPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new Back1Panel();
		panel.setBounds(0, 0, 978, 74);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton.setBounds(167, 21, 94, 40);
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("update");
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u5220\u9664");
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_1.setBounds(311, 21, 94, 40);
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setActionCommand("deleteReader");
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u7EED\u671F");
		btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_2.setBounds(458, 21, 94, 40);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\u8865\u5361");
		btnNewButton_3.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_3.setBounds(600, 21, 94, 40);
		panel.add(btnNewButton_3);

		JButton btnNewButton_8 = new JButton("\u65B0\u589E");
		btnNewButton_8.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_8.setBounds(33, 21, 94, 40);
		btnNewButton_8.addActionListener(this);
		btnNewButton_8.setActionCommand("AddReader");
		panel.add(btnNewButton_8);

		JPanel panel_1 = new BackPanel();
		panel_1.setBounds(0, 72, 978, 89);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"\u67E5\u8BE2\u65B9\u5F0F\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(38, 12, 90, 66);
		panel_1.add(lblNewLabel);

		JComboBox<String> comboBox = new JComboBox<String> ();
		comboBox.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox.setBounds(142, 29, 128, 33);
		comboBox.addItem("读者编号");
		comboBox.addItem("读者姓名");
		comboBox.addItem("读者电话");
		comboBox.addItem("读者邮箱");
		panel_1.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel(
				"\u8F93\u5165\u8BFB\u8005\u4FE1\u606F\u67E5\u8BE2 :");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(300, 24, 164, 42);
		panel_1.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 18));
		textField.setBounds(478, 23, 174, 42);
		panel_1.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_9 = new JButton("\u9AD8\u7EA7\u67E5\u8BE2");
		btnNewButton_9.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_9.setBounds(817, 22, 123, 47);
		panel_1.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_10.setBounds(681, 22, 104, 47);
		panel_1.add(btnNewButton_10);

		String[] title = { "读者编号","读者学(工)号", "读者姓名","读者类型","读者手机","读者邮箱","已借阅次数","总借阅次数","账户余额","读者状态" };
		dt = new DefaultTableModel(null, title);
		action.loadReader(dt);
		table = new JTable(dt);
		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		table.setFont(new Font("宋体", Font.PLAIN, 18));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 174, 978, 424);	
		contentPane.add(scrollPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("AddReader".equals(e.getActionCommand())){
			AddReader add = new AddReader(this);
			add.setVisible(true);
		}
		if("deleteReader".equals(e.getActionCommand())){
			int id = -1;
			int i =table.getSelectedRow();
			if(i > -1){
				id = (Integer)table.getValueAt(i, 0);
				String name = (String) table.getValueAt(table.getSelectedRow(), 2);
				int[] ids = {id};
				boolean flag= action.deleteReader(ids);
				if(flag){
					JOptionPane.showMessageDialog(this, "成功删除"+name,"提示框",JOptionPane.INFORMATION_MESSAGE);
					this.flash();
				}
			}else{
				JOptionPane.showMessageDialog(this, "请选中一名读者！","提示框",JOptionPane.INFORMATION_MESSAGE);
			}
		}

		if("update".equals(e.getActionCommand())){
			int i =table.getSelectedRow();
			if(i > -1){
				UpdateReader ur = new UpdateReader(this);
				ur.setVisible(true);
			}else{
				JOptionPane.showMessageDialog(this, "请选中一名读者！","提示框",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public JTable getTable() {
		return table;
	}

	public void flash(){
		action.loadReaderbeforDel(dt);
	}
}

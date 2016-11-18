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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jier.soft.Action.ReaderAction;
import com.jier.soft.Util.Centre;
import com.jier.soft.entity.Reader;

public class UpdateReader extends JFrame implements ActionListener{

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
	private JTextField id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateReader frame = new UpdateReader(null);
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
	public UpdateReader(ReaderInfo readerinfo) {
		this.readerinfo = readerinfo;
	   // setType(Type.UTILITY);
		setTitle("\u4FEE\u6539\u8BFB\u8005\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(996, 645);
		Centre.centre(this, 996, 645);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new BackPanel();
		panel_1.setBounds(0, 0, 973, 598);
		contentPane.add(panel_1);
		panel_1.setToolTipText("");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("\u8BFB\u8005\u5B66(\u5DE5)\u53F7\uFF1A");
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(84, 135, 137, 47);
		panel_1.add(lblNewLabel_7);
		
		JLabel label = new JLabel("\u8BFB\u8005\u59D3\u540D\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(125, 211, 96, 39);
		panel_1.add(label);
		
		JLabel lblNewLabel_8 = new JLabel("\u7535\u5B50\u90AE\u4EF6\uFF1A");
		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(488, 68, 90, 31);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("\u8054\u7CFB\u7535\u8BDD\uFF1A");
		lblNewLabel_11.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(488, 143, 112, 31);
		panel_1.add(lblNewLabel_11);
		
		number = new JTextField();
		number.setEditable(false);
		number.setFont(new Font("宋体", Font.PLAIN, 18));
		number.setBounds(259, 137, 162, 44);
		panel_1.add(number);
		number.setColumns(10);
		
		email = new JTextField();
		email.setFont(new Font("宋体", Font.PLAIN, 18));
		email.setBounds(643, 62, 162, 43);
		panel_1.add(email);
		email.setColumns(10);
		
		phone = new JTextField();
		phone.setFont(new Font("宋体", Font.PLAIN, 18));
		phone.setBounds(643, 137, 162, 43);
		panel_1.add(phone);
		phone.setColumns(10);
		
		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.setBounds(403, 462, 142, 52);
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("update");
		panel_1.add(btnNewButton);
		
		JLabel label_1 = new JLabel("\u8D26\u6237\u4F59\u989D\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(488, 205, 112, 50);
		panel_1.add(label_1);
		
		money = new JTextField();
		money.setFont(new Font("宋体", Font.PLAIN, 18));
		money.setBounds(643, 209, 161, 43);
		panel_1.add(money);
		money.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BFB\u8005\u7C7B\u578B\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(125, 300, 120, 34);
		panel_1.add(label_2);
		
		comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox.setBounds(259, 295, 162, 44);
		comboBox.addItem("教师");
		comboBox.addItem("学生");
		panel_1.add(comboBox);
		
		name = new JTextField();
		name.setEditable(false);
		name.setFont(new Font("宋体", Font.PLAIN, 18));
		name.setColumns(10);
		name.setBounds(260, 209, 161, 43);
		panel_1.add(name);
		
		JLabel status111 = new JLabel("\u8BFB\u8005\u72B6\u6001\uFF1A");
		status111.setFont(new Font("宋体", Font.PLAIN, 18));
		status111.setBounds(480, 300, 120, 34);
		panel_1.add(status111);
		
		status = new JTextField();
		status.setFont(new Font("宋体", Font.PLAIN, 18));
		status.setText("1");
		status.setColumns(10);
		status.setBounds(643, 296, 161, 43);
		panel_1.add(status);
		
		JLabel label_3 = new JLabel("\u8BFB\u8005\u7F16\u53F7 :");
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(116, 60, 105, 47);
		panel_1.add(label_3);
		
		id = new JTextField();
		id.setEditable(false);
		id.setFont(new Font("宋体", Font.PLAIN, 18));
		id.setColumns(10);
		id.setBounds(259, 62, 162, 44);
		panel_1.add(id);
		
		JLabel lblNewLabel = new JLabel("\u6B64\u754C\u9762\u7528\u4E8E\u8BFB\u8005\u4FE1\u606F\u4FEE\u6539\u3001\u8BFB\u8005\u5145\u503C\u4EE5\u53CA\u6302\u5931(\u5C06\u8BFB\u8005\u72B6\u6001\u7F6E0)");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel.setBounds(204, 374, 569, 47);
		panel_1.add(lblNewLabel);
		
		this.setDefault();
		
	}
	private void setDefault(){
		JTable table = readerinfo.getTable();
		int i = table.getSelectedRow();
		if(i > -1){
			id.setText(table.getValueAt(i, 0)+"");
			number.setText(table.getValueAt(i, 1)+"");
			name.setText((String) table.getValueAt(i, 2));
			comboBox.setSelectedItem(table.getValueAt(i, 3));
			phone.setText((String) table.getValueAt(i, 4));
			email.setText((String) table.getValueAt(i, 5));
			money.setText(table.getValueAt(i, 8)+"");
			if(table.getValueAt(i, 9).equals("正常(1)"))
				status.setText(1+"");
			else
				status.setText(0+"");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("update".equals(e.getActionCommand())){
			Reader reader = new Reader();
			reader.setReader_id(Integer.parseInt(id.getText()));
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
			boolean flag =action.updateReader(readers);
			if(flag){
				this.dispose();
				this.readerinfo.flash();
				JOptionPane.showMessageDialog(this, "修改成功","提示框",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
	}
}

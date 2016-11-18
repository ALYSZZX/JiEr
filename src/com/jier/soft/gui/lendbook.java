package com.jier.soft.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jier.soft.Action.LendAction;
import com.jier.soft.entity.BookLend;
import com.jier.soft.entity.Reader;

public class lendbook extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4983549579755980687L;
	private JPanel contentPane;
	private JTextField queryA;
	private JTable table;
	private JTable table_2;
	private JTable table_1;
	private JLabel name;
	private JLabel lend;
	private JLabel canlend;
	private DefaultTableModel dt,dt1;
	private Reader reader;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lendbook frame = new lendbook();
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
	public lendbook() {
		setBackground(Color.DARK_GRAY);
		setResizable(false);
		setTitle("\u501F\u4E66");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1088, 739);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BFB\u8005\u5B66(\u5DE5)\u53F7 :");
		label.setBounds(10, 10, 135, 36);
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		contentPane.add(label);
		
		queryA = new JTextField();
		queryA.setBounds(143, 9, 135, 40);
		contentPane.add(queryA);
		queryA.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6240\u6709\u56FE\u4E66\uFF1A");
		label_2.setBounds(10, 113, 87, 36);
		contentPane.add(label_2);
		
		
		/*String[] title = {"读者标号","姓名","借阅次数","性别","出生日期","读者类型","注册日期","证件到期时间","身份证号","联系电话","电子邮件","工作单位"};
		String[][] content = {}; 
		
		DefaultTableModel dt = new DefaultTableModel(content,title);
		table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 144, 711, 311);
		scrollPane.add(table);
		contentPane.add(scrollPane);
		scrollPane.setColumnHeaderView(table);
		
		*/

		JLabel label_3 = new JLabel("\u672C\u6B21\u501F\u9605\u56FE\u4E66\uFF1A");
		label_3.setBounds(14, 390, 158, 36);
		contentPane.add(label_3);
		
		JButton button = new JButton("\u501F\u4E66\u786E\u5B9A");
		button.setBounds(910, 655, 158, 36);
		button.addActionListener(this);
		button.setActionCommand("add");
		contentPane.add(button);
		
		
		String[] title = {"图书编号","图书名称","作者","出版社","图书类别","图书数量","借出数量","借用次数","单价"};
		
		dt = new DefaultTableModel(null,title);
		
		LendAction action = new LendAction();
		action.loadBookInfo(dt);
		
		table_1 = new JTable(dt);
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(20, 150, 1048, 240);
		contentPane.add(scrollPane);
		
		String[] title1 = {"图书编号","图书名称","作者","出版社","图书数量","本数"};
		
		dt1 = new DefaultTableModel(null,title1);				
		
		table_2 = new JTable(dt1);
		
		JScrollPane scrollPane_1 = new JScrollPane(table_2);
		scrollPane_1.setBounds(24, 439, 1044, 212);
		contentPane.add(scrollPane_1);
		
		//scrollPane_1.setColumnHeaderView(table_2);
		
		JButton downButton = new JButton("\u6DFB\u52A0\u4E66\u7C4D");
		downButton.setBounds(910, 393, 158, 36);
		downButton.addActionListener(this);
		downButton.setActionCommand("down");
		contentPane.add(downButton);
		
		JLabel label_1 = new JLabel("\u8BFB\u8005\u59D3\u540D :");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(419, 10, 87, 36);
		contentPane.add(label_1);
		
		name = new JLabel("");
		name.setBounds(506, 10, 104, 36);
		contentPane.add(name);
		
		JButton btnNewButton_1 = new JButton("\u67E5\u8BE2");
		btnNewButton_1.setBounds(292, 11, 113, 36);
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setActionCommand("querybynumber");
		contentPane.add(btnNewButton_1);
		
		JLabel label_4 = new JLabel("\u5DF2\u501F\u4E66 :");
		label_4.setFont(new Font("宋体", Font.PLAIN, 16));
		label_4.setBounds(618, 10, 87, 36);
		contentPane.add(label_4);
		
		lend = new JLabel("");
		lend.setBounds(719, 10, 104, 36);
		contentPane.add(lend);
		
		JLabel label_7 = new JLabel("\u53EF\u501F\u4E66 :");
		label_7.setFont(new Font("宋体", Font.PLAIN, 16));
		label_7.setBounds(837, 10, 87, 36);
		contentPane.add(label_7);
		
		canlend = new JLabel("");
		canlend.setBounds(934, 10, 104, 36);
		contentPane.add(canlend);
		
		JButton showALl = new JButton("\u663E\u793A\u6240\u6709\u8BFB\u8005");
		showALl.setBounds(10, 59, 220, 41);
		contentPane.add(showALl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("querybynumber".equals(e.getActionCommand())){
			LendAction action = new LendAction();
			reader =action.getReader("reader_number", queryA.getText());
			if(reader == null){
				JOptionPane.showMessageDialog(this,"没找到该学(工号)号为"+queryA.getText()+"的读者","提示框",JOptionPane.INFORMATION_MESSAGE );
			}else{
				name.setText(reader.getReader_name());
				lend.setText(reader.getReader_book_conut()+"");
				canlend.setText((10-reader.getReader_book_conut())+"");
			}
		}
		if("down".equals(e.getActionCommand())){
			String num =JOptionPane.showInputDialog(this,"请输入本次借书本数","1");
			int index=table_1.getSelectedRow();
			//System.out.println(table_1.getValueAt(index, 5).toString());
			if(Integer.parseInt(num)<= Integer.parseInt(table_1.getValueAt(index, 5).toString())){
				dt1.addRow(new Object[]{table_1.getValueAt(index, 0),table_1.getValueAt(index, 1),table_1.getValueAt(index, 2),table_1.getValueAt(index, 3),table_1.getValueAt(index, 5),num});
			}else{
				JOptionPane.showMessageDialog(this,"该书数量不足","提示框",JOptionPane.INFORMATION_MESSAGE );
			}
		}
		if("add".equals(e.getActionCommand())){
			int num = table_2.getRowCount();
			BookLend[] lends = new BookLend[num];
			for(int i = 0;i <num;i++){
				BookLend lend = new BookLend();
				lend.setReader_id(reader.getReader_id());
				lend.setBook_id(Integer.parseInt(table_2.getValueAt(i, 0)+""));
				Date date=new Date();
				lend.setLend_time(date);
				lend.setLend_book_count(Integer.parseInt(table_2.getValueAt(i, 5)+""));
				lends[i] =lend;
				dt1.removeRow(i);
			}
			LendAction action = new LendAction();
			boolean flag =action.addLend(lends);
			if(flag){
				JOptionPane.showMessageDialog(this,"借书成功","提示框",JOptionPane.INFORMATION_MESSAGE );
			}
		}
		
	}
}

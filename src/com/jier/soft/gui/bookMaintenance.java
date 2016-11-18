package com.jier.soft.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jier.soft.Action.BookInfoAction;
import com.jier.soft.Util.Centre;
import com.jier.soft.Util.panelWithBackground;
import com.jier.soft.entity.BookInfo;

import javax.swing.JSeparator;

public class bookMaintenance extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5525047071968833741L;
	private JPanel contentPane;
	private JTextField searchValue;
	DefaultTableModel dt;
	private JTable table;
	private String value;
	private String limiter;
	private JComboBox<String> comboBox; 
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
		
		Image image1 = new ImageIcon("image/absoft.png").getImage();
		JPanel panel = new panelWithBackground(image1);
		//JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 794, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton add = new JButton("\u589E\u52A0");

		add.setFocusPainted(false);
		add.setFont(new Font("SimSun", Font.PLAIN, 12));
		add.setBounds(98, 17, 100, 30);
		add.addActionListener(this);
		add.setActionCommand("add");
		panel.add(add);
		
		JButton update = new JButton("\u4FEE\u6539");
		update.setFont(new Font("SimSun", Font.PLAIN, 12));
		update.setBounds(348, 17, 100, 30);
		update.addActionListener(this);
		update.setActionCommand("update");
		panel.add(update);
		
		JButton btnDelete = new JButton("\u5220\u9664");
		btnDelete.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnDelete.setBounds(598, 17, 100, 30);
		btnDelete.addActionListener(this);
		btnDelete.setActionCommand("delete");
		panel.add(btnDelete);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 59, 794, 57);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9009\u62E9\u67E5\u8BE2\u65B9\u5F0F\uFF1A");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 12));
		lblNewLabel.setBounds(44, 12, 95, 20);
		panel_1.add(lblNewLabel);
		
		comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("SimSun", Font.PLAIN, 12));
		comboBox.setBounds(133, 12, 144, 20);
		comboBox.addItem("ȫ����ʾ");
		comboBox.addItem("�鿯����");
		comboBox.addItem("��������");
		comboBox.addItem("�鿯����");
		comboBox.addItem("ISBN���");
		comboBox.addActionListener(this);
		comboBox.setActionCommand("typeselected");		
		
		panel_1.add(comboBox);
		JLabel label = new JLabel("\u8F93\u5165\u67E5\u8BE2\u4FE1\u606F\uFF1A");
		label.setFont(new Font("����", Font.PLAIN, 12));
		label.setBounds(344, 12, 95, 20);
		panel_1.add(label);
		
		JButton btnSearch = new JButton("\u67E5\u8BE2");
		btnSearch.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnSearch.setBounds(663, 10, 80, 25);
		btnSearch.addActionListener(this);
		btnSearch.setActionCommand("search");
		panel_1.add(btnSearch);
		
		searchValue = new JTextField();
		searchValue.setBounds(449, 12, 160, 20);
		panel_1.add(searchValue);
		searchValue.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 115, 804, 456);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		String[] title = {
				"ͼ����","ͼ������ ","����","ͼ�����","�ܲ���","�������","ʣ�����","�ɽ���ʱ��","�������","������","I S B N","�������","����","״̬"};
		dt = new DefaultTableModel(null,title);	
		BookInfoAction bookinfo=new BookInfoAction();
		bookinfo.loadBookInfo(dt);
		
		table=new JTable(dt);
		table.setBackground(Color.WHITE);
		
		
		
		/*setAutoResizeMode:�趨����Զ�������
		AUTO_RESIZE_OFF  ���Զ������еĿ�ȣ�ʹ�ù�������
		AUTO_RESIZE_NEXT_COLUMN  �� UI �е�����ʱ��������һ�н����෴����ĵ�����
		AUTO_RESIZE_SUBSEQUENT_COLUMNS  �� UI �����У����ĺ������Ա����ܿ�Ȳ��䣬����Ĭ�ϵ���Ϊ��
		AUTO_RESIZE_LAST_COLUMN  �����еĵ�����С�����У�ֻ�����һ�н��е�����
		AUTO_RESIZE_ALL_COLUMNS  �����еĵ�����С�����У��������������е��С�*/
		
		
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		scrollPane.setBounds(0, 0, 794, 456);
		panel_2.add(scrollPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 58, 794, 10);
		contentPane.add(separator);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("delete".equals(e.getActionCommand()))
		{
			int[] getSelectedRow;
			int key=0;

			BookInfoAction delete = new BookInfoAction();
			BookInfo book = new BookInfo();
			ArrayList<BookInfo> list= new ArrayList<BookInfo>();
			
//			getSelectedRow=table.getSelectedRows();
//			while(key!=getSelectedRow.length)
//			{
			key=table.getSelectedRow();
				//��tabal�ػ�ȡ��ѡ���еĸ����ֶ�
				book.setBook_id(Integer.parseInt(table.getValueAt(key, 0).toString()));
				book.setBook_name(table.getValueAt(key, 1).toString());
				book.setBook_author(table.getValueAt(key, 2).toString());
				book.setBook_type(table.getValueAt(key, 3).toString());
				book.setBook_count(Integer
						.parseInt(table.getValueAt(key, 4).toString()));
				book.setBook_lend(Integer
						.parseInt(table.getValueAt(key, 5).toString()));
				book.setBook_remain(Integer
						.parseInt(table.getValueAt(key, 6).toString()));
				book.setBook_lend_time(Integer
						.parseInt(table.getValueAt(key, 7).toString()));
				book.setBook_lend_count(Integer
						.parseInt(table.getValueAt(key, 8).toString()));
				book.setBook_publish(table.getValueAt(key, 9).toString());
				book.setISBN(table.getValueAt(key, 10).toString());
				book.setBook_pubtimes(Integer
						.parseInt(table.getValueAt(key, 11).toString()));
	            book.setBook_price(Double
	            		.parseDouble(table.getValueAt(key, 12).toString()));
	            book.setBook_status(Integer
						.parseInt(table.getValueAt(key, 13).toString()));   
	            BookInfo[] books= {book};
	      
           delete.deleteBook(books);
         //   this.setVisible(false);
BookInfoAction action=new BookInfoAction();
action.loadBook(dt);
			
		}
			
		if("add".equals(e.getActionCommand()))
		{
			this.setVisible(false);
			addBook add=new addBook();
			add.setVisible(true);
		}
		if("search".equals(e.getActionCommand()))
		{

			 if("ȫ����ʾ".equals(limiter))
				 limiter=null;
			 else  if("�鿯����".equals(limiter))
				 limiter="book_name";
				 else  if("��������".equals(limiter))
					 limiter="book_author";
					 else  if("�鿯����".equals(limiter))
						 limiter="book_type";
						 else  if("ISBN���".equals(limiter))
							 limiter="ISBN";
if(limiter!=null)
{	
			value=searchValue.getText().trim();
			System.out.println("limiter:"+limiter+"     value:"+value);
			BookInfoAction action=new BookInfoAction();
			action.loadSelectedBookInfo(dt, limiter, value);
}	
else
{
	BookInfoAction action=new BookInfoAction();
	action.loadBook(dt);;	
}
		}
		if("typeselected".equals(e.getActionCommand()))
		{
			 limiter=(String) comboBox.getSelectedItem();	
		}
		if("update".equals(e.getActionCommand()))
		{
			
			int row=table.getSelectedRow();
			if(row==-1)
			{
				JOptionPane.showMessageDialog(this, "�����б��е����Ҫ�޸ĵ���", "��ѡ��",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
            System.out.println(row);
        	BookInfoAction add = new BookInfoAction();
			BookInfo book = new BookInfo();
			
			BookInfo[] books = { book };
			
			//��tabal�ػ�ȡ��ѡ���еĸ����ֶ�
			book.setBook_id(Integer.parseInt(table.getValueAt(row, 0).toString()));
			book.setBook_name(table.getValueAt(row, 1).toString());
			book.setBook_author(table.getValueAt(row, 2).toString());
			book.setBook_type(table.getValueAt(row, 3).toString());
			book.setBook_count(Integer
					.parseInt(table.getValueAt(row, 4).toString()));
			book.setBook_lend(Integer
					.parseInt(table.getValueAt(row, 5).toString()));
			book.setBook_remain(Integer
					.parseInt(table.getValueAt(row, 6).toString()));
			book.setBook_lend_time(Integer
					.parseInt(table.getValueAt(row, 7).toString()));
			book.setBook_lend_count(Integer
					.parseInt(table.getValueAt(row, 8).toString()));
			book.setBook_publish(table.getValueAt(row, 9).toString());
			book.setISBN(table.getValueAt(row, 10).toString());
			book.setBook_pubtimes(Integer
					.parseInt(table.getValueAt(row, 11).toString()));
            book.setBook_price(Double
            		.parseDouble(table.getValueAt(row, 12).toString()));
            book.setBook_status(Integer
					.parseInt(table.getValueAt(row, 13).toString()));
            //��updateBook�Ĵ��ڣ������ر�����
            updateBook update=new updateBook(book);
            this.setVisible(false);
			update.setVisible(true);
			}
		}
	}
}

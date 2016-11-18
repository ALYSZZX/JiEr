package com.jier.soft.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import com.jier.soft.Action.BookInfoAction;
import com.jier.soft.Util.Centre;
import com.jier.soft.entity.BookInfo;

import javax.swing.JComboBox;

public class updateBook extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField bookName;
	private JTextField bookAuthor;
	private JTextField publishingHouse;
	private JTextField bookCount;
	private JTextField bookLendTime;
	private JTextField ISBN;
	private JTextField bookPrice;
	private JTextField bookPubtimes;
	private String bookType;
	private JComboBox comboBox;
    private JTextField bookRemain;
    private JTextField bookStatus;
    private JTextField bookLenCount;
    private JTextField bookLend;
    private static	BookInfo book;
	private int key;
	private int bookid;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateBook frame = new updateBook(book);
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
	@SuppressWarnings("unchecked")
	public updateBook(BookInfo book) {
		setLocation(0, -39);
		setTitle("\u66F4\u6539\u4E66\u520A\u4FE1\u606F");
		this.setSize(600, 400);
		Centre.centre(this, 600, 400);
		
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
      
		
        bookid=book.getBook_id();
        
		bookAuthor = new JTextField();
		bookAuthor.setColumns(10);
		bookAuthor.setBounds(383, 10, 153, 21);
		bookAuthor.setText(book.getBook_author());
		contentPane.add(bookAuthor);
		
		bookName = new JTextField();
		bookName.setBounds(99, 10, 153, 21);
		contentPane.add(bookName);
		bookName.setColumns(10);
		bookName.setText(book.getBook_name());


		publishingHouse = new JTextField();
		publishingHouse.setColumns(10);
		publishingHouse.setBounds(99, 54, 153, 21);
		contentPane.add(publishingHouse);
		publishingHouse.setText(book.getBook_publish());


		bookCount = new JTextField();
		bookCount.setColumns(10);
		bookCount.setBounds(99, 100, 153, 21);
		contentPane.add(bookCount);
		bookCount.setText(String.valueOf(book.getBook_count()));


		bookLendTime = new JTextField();
		bookLendTime.setColumns(10);
		bookLendTime.setBounds(383, 100, 153, 21);
		contentPane.add(bookLendTime);
		bookLendTime.setText(String.valueOf(book.getBook_lend_time()));
		
		ISBN = new JTextField();
		ISBN.setColumns(10);
		ISBN.setBounds(99, 147, 153, 21);
		ISBN.setText(String.valueOf(book.getISBN()));
		contentPane.add(ISBN);

		
		bookPrice = new JTextField();
		bookPrice.setColumns(10);
		bookPrice.setBounds(383, 147, 153, 21);
		bookPrice.setText(String.valueOf(book.getBook_price()));
		contentPane.add(bookPrice);
		

		bookPubtimes = new JTextField();
		bookPubtimes.setColumns(10);
		bookPubtimes.setBounds(99, 196, 153, 21);
		bookPubtimes.setText(String.valueOf(book.getBook_pubtimes()));
		contentPane.add(bookPubtimes);
		
		
		String[] type = {"马克思主义、列宁主义、毛泽东思想、邓小平理论", "矿业工程", "哲学、宗教",
				"石油、天然气工业", "社会科学总论", "冶金工业", "政治、法律", "金属学与金属工艺", "军事",
				"机械、仪表工业", " 经济", "武器工业", "文化科学、教育、体育", "能源与动力工程", "语言、文字",
				"电子能技术", "文学", "电工技术", "艺术", "光线电电子学、电信技术", "历史、地理",
				"自动化技术、计算机技术", "自然科学总论", "化学工业", "数理科学和化学", "轻工业、手工业",
				"天文学、地球科学", "建筑科学", "生物科学", "水利工程", " 医药、卫生", "交通运输", "农业科学",
				"航空、航天", "工业技术", "环境科学、安全科学", "一般工业技术", "综合性图书" };
		
		
		for(key=0;key<32;key++)
			if(String.valueOf(book.getBook_type()).equals(type[key]))
				break;
			
		comboBox = new JComboBox(type);
		comboBox.setFont(new Font("SimSun", Font.PLAIN, 12));
		comboBox.setBounds(383, 55, 153, 21);
		contentPane.add(comboBox);
		comboBox.setSelectedIndex(key); 
		comboBox.addActionListener(this);
		comboBox.setActionCommand("typeselected");

		bookRemain = new JTextField();
		bookRemain.setColumns(10);
		bookRemain.setBounds(383, 196, 153, 21);
		contentPane.add(bookRemain);
		bookRemain.setText(String.valueOf(book.getBook_remain()));
		
		bookStatus = new JTextField();
		bookStatus.setColumns(10);
		bookStatus.setBounds(99, 277, 153, 21);
		contentPane.add(bookStatus);
		bookStatus.setText(String.valueOf(book.getBook_status()));
		
		bookLenCount = new JTextField();
		bookLenCount.setColumns(10);
		bookLenCount.setBounds(383, 236, 153, 21);
		contentPane.add(bookLenCount);
		bookLenCount.setText(String.valueOf(book.getBook_lend_count()));
		
		bookLend = new JTextField();
		bookLend.setColumns(10);
		bookLend.setBounds(99, 236, 153, 21);
		contentPane.add(bookLend);
		bookLend.setText(String.valueOf(book.getBook_lend()));
		
		JLabel label = new JLabel("\u4F5C    \u8005\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 12));
		label.setBounds(314, 10, 100, 20);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u56FE\u4E66\u540D\u79F0\uFF1A");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 12));
		lblNewLabel.setBounds(30, 10, 100, 20);
		contentPane.add(lblNewLabel);

		JLabel bookType1 = new JLabel("\u56FE\u4E66\u7C7B\u522B");
		bookType1.setFont(new Font("宋体", Font.PLAIN, 12));
		bookType1.setBounds(314, 55, 100, 20);
		contentPane.add(bookType1);

		JLabel label_2 = new JLabel("\u51FA\u7248\u793E\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 12));
		label_2.setBounds(30, 54, 100, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u56FE\u4E66\u6570\u91CF\uFF1A");
		label_3.setFont(new Font("宋体", Font.PLAIN, 12));
		label_3.setBounds(30, 100, 100, 20);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("\u53EF\u501F\u51FA\u65F6\u95F4\uFF1A");
		label_4.setFont(new Font("宋体", Font.PLAIN, 12));
		label_4.setBounds(314, 100, 100, 20);
		contentPane.add(label_4);

		JLabel lblISB = new JLabel("I S B N\uFF1A");
		lblISB.setFont(new Font("宋体", Font.PLAIN, 12));
		lblISB.setBounds(30, 147, 100, 20);
		contentPane.add(lblISB);

		JLabel d = new JLabel("\u56FE\u4E66\u5355\u4EF7\uFF1A");
		d.setFont(new Font("宋体", Font.PLAIN, 12));
		d.setBounds(314, 147, 100, 20);
		contentPane.add(d);

		JButton btnYes = new JButton(
				"\u786E\u5B9A");
		btnYes.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnYes.addActionListener(this);
		btnYes.setActionCommand("yes");
		btnYes.setBounds(80, 330, 120, 30);
		contentPane.add(btnYes);

		JButton btnCancel = new JButton("\u53D6\u6D88");
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("cancel");
		btnCancel.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnCancel.setBounds(416, 331, 120, 30);
		contentPane.add(btnCancel);


		JLabel text = new JLabel("\u56FE\u4E66\u7248\u672C\uFF1A");
		text.setFont(new Font("宋体", Font.PLAIN, 12));
		text.setBounds(30, 196, 100, 20);
		contentPane.add(text);

		

		
		JLabel label_5 = new JLabel("\u5269\u4F59\u518C\u6570\uFF1A");
		label_5.setFont(new Font("宋体", Font.PLAIN, 12));
		label_5.setBounds(314, 196, 100, 20);
		contentPane.add(label_5);
		
		JLabel label_1 = new JLabel("\u72B6    \u6001\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 12));
		label_1.setBounds(30, 277, 100, 20);
		contentPane.add(label_1);
		
		JLabel label_7 = new JLabel("\u501F\u51FA\u518C\u6570");
		label_7.setFont(new Font("宋体", Font.PLAIN, 12));
		label_7.setBounds(30, 236, 100, 20);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u501F\u51FA\u6B21\u6570\uFF1A");
		label_8.setFont(new Font("宋体", Font.PLAIN, 12));
		label_8.setBounds(314, 236, 100, 20);
		contentPane.add(label_8);
	}

	public void back() {
		this.setVisible(false);
		bookMaintenance bookMaintenance = new bookMaintenance();
		bookMaintenance.setVisible(true);
	}

	public boolean update()
	{
		if(Integer.parseInt(this.bookCount.getText())!=Integer.parseInt(this.bookLend.getText())
				+Integer.parseInt(this.bookRemain.getText()))
		{
			JOptionPane.showMessageDialog(this, "图书的总册数应为剩余册数与借出册数之和", "警告",JOptionPane.WARNING_MESSAGE);
		return false; 
		}
		else if(this.bookAuthor.getText()!=null&&this.bookName.getText()!=null&&this.bookCount.getText()!=null&&this.bookPrice.getText()!=null&&bookType!=null&&this.bookLendTime.getText()!=null&&this.ISBN.getText()!=null&&this.publishingHouse.getText()!=null&&this.bookLend.getText()!=null&&this.bookRemain.getText()!=null&&this.bookLenCount.getText()!=null&&this.bookStatus.getText()!=null&&this.bookCount.getText()!=null)
		{
			JOptionPane.showMessageDialog(this, "请勿留空", "警告",JOptionPane.WARNING_MESSAGE);
			return false; 
		}
			else
		{
		BookInfoAction update = new BookInfoAction();
		BookInfo book = new BookInfo();
		System.out.println("id"+bookid);
		book.setBook_id(bookid);
        book.setBook_author(bookAuthor.getText());
        book.setBook_count(Integer.parseInt(this.bookCount.getText()));
        book.setBook_lend(Integer.parseInt(this.bookLend.getText()));;
        book.setBook_lend_count(Integer.parseInt(this.bookLenCount.getText()));
        book.setBook_lend_time(Integer.parseInt(this.bookLendTime.getText()));
        book.setBook_name(this.bookName.getText());
        book.setBook_price(Double.parseDouble(this.bookPrice.getText()));
        book.setBook_publish(this.publishingHouse.getText());
        book.setBook_pubtimes(Integer.parseInt(this.bookPubtimes.getText()));
        book.setBook_remain(Integer.parseInt(this.bookRemain.getText()));
        book.setBook_status(Integer.parseInt(this.bookStatus.getText()));
        book.setISBN(this.ISBN.getText());
        book.setBook_type(bookType);	
        
		BookInfo[] books = { book };
		update.updateBook(books);
		return true; 
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 退回书刊维护界面
		if ("cancel".equals(e.getActionCommand())) {
			back();
		}
		if ("yes".equals(e.getActionCommand())) {
			if(update())
			  back();
		}
		if ("typeselected".equals(e.getActionCommand())) {

			bookType = (String) comboBox.getSelectedItem();
		}
	}
}

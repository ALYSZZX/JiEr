package com.jier.soft.gui;

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

public class addBook extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField bookName;
	private JTextField bookAuthor;
	private JTextField publishingHouse;
	private JTextField bookCount;
	private JTextField bookLendTime;
	private JTextField ISBN;
	private JTextField price;
	private JTextField bookPubtimes;
	private String bookType="";
	private JComboBox<?> comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addBook frame = new addBook();
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
	public addBook() {
		setTitle("\u65B0\u589E\u4E66\u520A\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		;
		this.setSize(600, 400);
		Centre.centre(this, 600, 400);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u56FE\u4E66\u540D\u79F0\uFF1A");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 12));
		lblNewLabel.setBounds(30, 30, 100, 20);
		contentPane.add(lblNewLabel);

		bookName = new JTextField(null);
		bookName.setBounds(99, 30, 153, 21);
		contentPane.add(bookName);
		bookName.setColumns(10);

		JLabel label = new JLabel("\u4F5C\u8005\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 12));
		label.setBounds(314, 30, 100, 20);
		contentPane.add(label);

		bookAuthor = new JTextField(null);
		bookAuthor.setColumns(10);
		bookAuthor.setBounds(383, 30, 153, 21);
		contentPane.add(bookAuthor);

		JLabel bookType1 = new JLabel("\u56FE\u4E66\u7C7B\u522B");
		bookType1.setFont(new Font("宋体", Font.PLAIN, 12));
		bookType1.setBounds(314, 79, 100, 20);
		contentPane.add(bookType1);

		JLabel label_2 = new JLabel("\u51FA\u7248\u793E\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 12));
		label_2.setBounds(30, 78, 100, 20);
		contentPane.add(label_2);

		publishingHouse = new JTextField(null);
		publishingHouse.setColumns(10);
		publishingHouse.setBounds(99, 78, 153, 21);
		contentPane.add(publishingHouse);

		JLabel label_3 = new JLabel("\u56FE\u4E66\u6570\u91CF\uFF1A");
		label_3.setFont(new Font("宋体", Font.PLAIN, 12));
		label_3.setBounds(30, 132, 100, 20);
		contentPane.add(label_3);

		bookCount = new JTextField(null);
		bookCount.setColumns(10);
		bookCount.setBounds(99, 132, 153, 21);
		contentPane.add(bookCount);

		JLabel label_4 = new JLabel("\u53EF\u501F\u51FA\u65F6\u95F4\uFF1A");
		label_4.setFont(new Font("宋体", Font.PLAIN, 12));
		label_4.setBounds(314, 132, 100, 20);
		contentPane.add(label_4);

		bookLendTime = new JTextField(null);
		bookLendTime.setColumns(10);
		bookLendTime.setBounds(383, 132, 153, 21);
		contentPane.add(bookLendTime);

		JLabel lblISB = new JLabel("I S B N\uFF1A");
		lblISB.setFont(new Font("宋体", Font.PLAIN, 12));
		lblISB.setBounds(30, 187, 100, 20);
		contentPane.add(lblISB);

		ISBN = new JTextField(null);
		ISBN.setColumns(10);
		ISBN.setBounds(99, 187, 153, 21);
		contentPane.add(ISBN);

		JLabel d = new JLabel("\u56FE\u4E66\u5355\u4EF7\uFF1A");
		d.setFont(new Font("宋体", Font.PLAIN, 12));
		d.setBounds(314, 187, 100, 20);
		contentPane.add(d);

		price = new JTextField(null);
		price.setColumns(10);
		price.setBounds(383, 187, 153, 21);
		contentPane.add(price);

		JButton btnYesAndExit = new JButton(
				"\u786E\u5B9A\u5E76\u9000\u51FA\u6DFB\u52A0");
		btnYesAndExit.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnYesAndExit.addActionListener(this);
		btnYesAndExit.setActionCommand("yesandexit");
		btnYesAndExit.setBounds(80, 295, 120, 30);
		contentPane.add(btnYesAndExit);

		JButton btnYesAndContinue = new JButton(
				"\u786E\u5B9A\u5E76\u7EE7\u7EED\u6DFB\u52A0");
		btnYesAndContinue.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnYesAndContinue.setBounds(245, 296, 120, 30);
		btnYesAndContinue.addActionListener(this);
		btnYesAndContinue.setActionCommand("yesandcontinue");
		contentPane.add(btnYesAndContinue);

		JButton btnCancel = new JButton("\u53D6\u6D88");
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("cancel");
		btnCancel.setFont(new Font("SimSun", Font.PLAIN, 12));
		btnCancel.setBounds(416, 296, 120, 30);
		contentPane.add(btnCancel);

		bookPubtimes = new JTextField(null);
		bookPubtimes.setColumns(10);
		bookPubtimes.setBounds(99, 236, 153, 21);
		contentPane.add(bookPubtimes);

		JLabel label_1 = new JLabel("\u56FE\u4E66\u7248\u672C\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 12));
		label_1.setBounds(30, 236, 100, 20);
		contentPane.add(label_1);

		String[] type = { "马克思主义、列宁主义、毛泽东思想、邓小平理论", "矿业工程", "哲学、宗教",
				"石油、天然气工业", "社会科学总论", "冶金工业", "政治、法律", "金属学与金属工艺", "军事",
				"机械、仪表工业", "经济", "武器工业", "文化科学、教育、体育", "能源与动力工程", "语言、文字",
				"电子能技术", "文学", "电工技术", "艺术", "光线电电子学、电信技术", "历史、地理",
				"自动化技术、计算机技术", "自然科学总论", "化学工业", "数理科学和化学", "轻工业、手工业",
				"天文学、地球科学", "建筑科学", "生物科学", "水利工程", "医药、卫生", "交通运输", "农业科学",
				"航空、航天", "工业技术", "环境科学、安全科学", "一般工业技术", "综合性图书" };
		comboBox = new JComboBox<Object>(type);
		comboBox.setFont(new Font("SimSun", Font.PLAIN, 12));
		comboBox.setBounds(383, 79, 153, 21);
		contentPane.add(comboBox);
		comboBox.addActionListener(this);
		comboBox.setActionCommand("typeselected");
	}

	public void back() {
		this.setVisible(false);
		bookMaintenance bookMaintenance = new bookMaintenance();
		bookMaintenance.setVisible(true);
	}

	public boolean add()
	{
		System.out.println(bookType.length());
		if(this.bookAuthor.getText().length()==0||this.bookName.getText().length()==0||this.bookCount.getText().length()==0||this.price.getText().length()==0||bookType.length()==0||this.bookLendTime.getText().length()==0||this.ISBN.getText().length()==0||this.publishingHouse.getText().length()==0||this.bookCount.getText().length()==0)
		{
			JOptionPane.showMessageDialog(this, "请勿留空", "警告",JOptionPane.WARNING_MESSAGE);
		    return false;	
		}
		else
		{
			BookInfoAction add = new BookInfoAction();
			BookInfo book = new BookInfo();
			book.setBook_author(this.bookAuthor.getText().trim());
			book.setBook_name(this.bookName.getText().trim());
			book.setBook_count(Integer
					.parseInt(this.bookCount.getText().trim()));
			book.setBook_price(Double.parseDouble(this.price.getText()
					.trim()));
			book.setBook_type(bookType);
			book.setBook_lend_time(Integer.parseInt(this.bookLendTime.getText()
					.trim()));
			book.setISBN(this.ISBN.getText());
			book.setBook_publish(this.publishingHouse.getText());
			book.setBook_pubtimes(Integer.parseInt(this.bookPubtimes.getText()));
			book.setBook_remain(Integer
					.parseInt(this.bookCount.getText().trim()));
			
		BookInfo[] books = { book };
	add.addBook(books);
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

		if ("yesandexit".equals(e.getActionCommand())) {
			if(add())
			back();
		}
		if ("typeselected".equals(e.getActionCommand())) {

			bookType = (String) comboBox.getSelectedItem();
		}

		if ("yesandcontinue".equals(e.getActionCommand())) {
          add();
          this.bookAuthor.setText("");
          this.bookCount.setText("");
          this.bookLendTime.setText("");
          this.bookName.setText("");
          this.bookPubtimes.setText("");
          this.ISBN.setText("");
          this.price.setText("");
          this.publishingHouse.setText("");
		}
	}
}

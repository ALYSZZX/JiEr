package com.jier.soft.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import com.jier.soft.Action.LoginAction;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JTextField userField;
	private JPasswordField passwordField;

	public LoginFrame(){
		setTitle("图书管理系统-登录");

		contentPane = new NewPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 861, 542);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u56FE\u4E66\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setFont(new Font("华文隶书", Font.PLAIN, 60));
		lblNewLabel.setBounds(207, 52, 506, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("用户名 :");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 24));
		lblNewLabel_1.setBounds(281, 171, 95, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("密   码 :");
		label.setFont(new Font("微软雅黑", Font.BOLD, 24));
		label.setBounds(281, 264, 95, 53);
		contentPane.add(label);
		
		userField = new JTextField();
		userField.setText("admin");
		userField.setFont(new Font("微软雅黑", Font.BOLD, 20));
		userField.setBounds(390, 181, 172, 43);
		contentPane.add(userField);
		userField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("微软雅黑", Font.BOLD, 20));
		passwordField.setBounds(390, 274, 172, 43);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("登录");
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.setBounds(249, 370, 146, 53);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("Login");
		
		JButton button = new JButton("退出");
		button.setBackground(new Color(245, 222, 179));
		button.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button.setBounds(439, 370, 146, 53);
		contentPane.add(button);
		button.addActionListener(this);
		button.setActionCommand("Exit");
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getActionCommand().equals("Exit")){
			System.exit(0);
		}
		if(e.getActionCommand().equals("Login")){
			String username = this.userField.getText();
			char[] pwd = this.passwordField.getPassword();
			String password = new String(pwd,0,pwd.length);
			if(username.isEmpty()){
				JOptionPane.showMessageDialog(this,"用户名不能为空！","提示框", JOptionPane.INFORMATION_MESSAGE);
			}else if(password.isEmpty()){
				JOptionPane.showMessageDialog(this,"密码不能为空！","提示框", JOptionPane.INFORMATION_MESSAGE);
			}
			
			LoginAction action = new LoginAction();
			boolean flag =action.login(username, password);
			if(flag){
				MainPage mf = new MainPage();
				this.dispose();
				mf.setVisible(true);
			}else{
				JOptionPane.showMessageDialog(this,"用户名或密码错误！","提示框", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
class NewPanel extends JPanel {
	  public NewPanel() {

	  }
	  public void paintComponent(Graphics g) {
	   int x = 0, y = 0;
	   ImageIcon icon = new ImageIcon("image/backgroud.png");// 003.jpg是测试图片在项目的根目录下
	   g.drawImage(icon.getImage(), x, y, getSize().width,
	     getSize().height, this);// 图片会自动缩放
//	    g.drawImage(icon.getImage(), x, y,this);//图片不会自动缩放
	  }
	 }

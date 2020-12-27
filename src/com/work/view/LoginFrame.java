package com.work.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.work.pojo.User;
import com.work.service.impl.LoginUserServiceImpl;

import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\laiXiang\\shop\\image\\\u96F6\u98DF.png"));
		setTitle("\u767B\u5F55\u754C\u9762");
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 484, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u96F6\u98DF\u7BA1\u7406\u7CFB\u7EDF\u767B\u5F55\u754C\u9762");
		lblNewLabel.setIcon(new ImageIcon("G:\\laiXiang\\shop\\image\\\u96F6\u98DFlogo(1).png"));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 22));
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\laiXiang\\shop\\image\\\u7528\u6237.png"));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6   \u7801\uFF1A");
		lblNewLabel_2.setIcon(new ImageIcon("G:\\laiXiang\\shop\\image\\\u5BC6   \u7801 .png"));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				logingAct(ae);
			}
		});
		btnNewButton.setIcon(new ImageIcon("G:\\laiXiang\\shop\\image\\\u767B\u5F55.png"));
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				restValue(ae);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("G:\\laiXiang\\shop\\image\\\u91CD\u7F6E.png"));
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		passwordField = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(94, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addGap(87))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(124)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
						.addComponent(passwordField))
					.addContainerGap(125, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(109)
					.addComponent(btnNewButton)
					.addGap(70)
					.addComponent(btnNewButton_1)
					.addContainerGap(113, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addGap(44))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void logingAct(ActionEvent ae) {
		// TODO Auto-generated method stub
		// 获取文本框和密码框的信息
		String name = textField.getText().toString();
		String password = new String(passwordField.getPassword());
		System.out.println("第一次获取："+name+":"+password);
		//判断输入框是否为空
		if ("".equals(name) || "".equals(password)) {
			JOptionPane.showMessageDialog(this, "账号或密码为空");
		}else {
			//判断密码或账号是否输入有误
			LoginUserServiceImpl loginUserServiceImpl = new LoginUserServiceImpl();
			System.out.println("第二次获取："+name+":"+password);
			User user = loginUserServiceImpl.name(name, password);
			System.out.println("用户："+user);
			if (user==null) {
				JOptionPane.showMessageDialog(this, "你输入的账号或密码有误");
			}else {
				MainFrame frame = new MainFrame();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			    this.dispose();
			}
			
		}
		
		
	}

	protected void restValue(ActionEvent ae) {
		// TODO Auto-generated method stub
		textField.setText("");
		passwordField.setText("");
	}
}

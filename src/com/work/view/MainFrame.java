package com.work.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import com.work.pojo.Shop;
import com.work.service.impl.ShopServiceImpl;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\laiXiang\\shop\\image\\\u96F6\u98DF.png"));
		setTitle("\u96F6\u98DF\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u96F6\u98DF\u5217\u8868");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 24));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_1 = new JLabel("\u7F16\u53F7");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("\u540D\u79F0");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		JLabel lblNewLabel_3 = new JLabel("\u79CD\u7C7B");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		JLabel lblNewLabel_4 = new JLabel("\u4EF7\u683C");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		JButton btnNewButton = new JButton("\u65B0\u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				button1(ae);
			}

			private void button1(ActionEvent ae) {
				
				//判断输入框内容是否为空
				if ("".equals(textField.getText().trim()) || "".equals(textField_1.getText().trim()) || "".equals(textField_2.getText().trim()) || "".equals(textField_3.getText().trim())) {
					JOptionPane.showMessageDialog(scrollPane, "请输入信息");
				}else {
					//                 获取文本框的信息
				int id = Integer.valueOf(textField.getText().trim());
				String Sname = textField_1.getText().trim();
				String kind = textField_2.getText().trim();
				Double price = Double.parseDouble(textField_3.getText().trim());
				
				
				System.out.println("编号："+id+"名称："+Sname+"种类："+kind+"价格:"+price);
				Shop shop = new Shop(id,Sname,kind,price);
				ShopServiceImpl serviceImpl = new ShopServiceImpl();
				serviceImpl.sava(shop);
				System.out.println("新增商品："+serviceImpl.getById(id));
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				setTable();
				JOptionPane.showMessageDialog(scrollPane, "添加成功");
				
				}

				
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				button2(ae);
			}

			private void button2(ActionEvent ae) {
//              获取文本框的信息
				int id = Integer.valueOf(textField_4.getText().trim());
				String Sname = textField_5.getText().trim();
				String kind = textField_6.getText().trim();
				Double price = Double.parseDouble(textField_7.getText().trim());
				
				
				System.out.println("编号："+id+"名称："+Sname+"种类："+kind+"价格:"+price);
				Shop shop = new Shop(id,Sname,kind,price);
				ShopServiceImpl serviceImpl = new ShopServiceImpl();
				serviceImpl.update(shop);;
				System.out.println("修改商品："+serviceImpl.getById(id));
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				setTable();
				JOptionPane.showMessageDialog(scrollPane, "修改成功");
				
			}
		});
		
		btnNewButton_2 = new JButton("\u5220\u9664");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				button3(ae);
			}

			private void button3(ActionEvent ae) {
              //判断输入框是否为空
				if ("".equals(textField_8.getText().trim())) {
					JOptionPane.showMessageDialog(scrollPane, "请输入信息");
				}else {
             //	                 获取文本框的信息
					int id = Integer.valueOf(textField_8.getText().trim());
					ShopServiceImpl serviceImpl = new ShopServiceImpl();
					serviceImpl.delete(id);
					textField_8.setText("");
					setTable();
					JOptionPane.showMessageDialog(scrollPane, "删除成功");
				}
				
			}

		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(273)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(19)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(28)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_3))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_4)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(47)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_2)
								.addComponent(btnNewButton_1)
								.addComponent(btnNewButton))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent ae) {
				updateById(ae);
			}

			private void updateById(MouseEvent ae) {
				//根据id查询信息
				DefaultTableModel dft = (DefaultTableModel) table.getModel();
				int index =table.getSelectedRow();
				int id = (int) dft.getValueAt(index, 0);
				System.out.println("id:"+id);
				ShopServiceImpl serviceImpl = new ShopServiceImpl();
				Shop shop = serviceImpl.getById(id);
				
				//把选中的商品信息导入输入框
				textField_4.setText(shop.getId()+"");
				textField_5.setText(shop.getSname());
				textField_6.setText(shop.getKind());
				textField_7.setText(shop.getPrice()+"");
				
			}
		});
		table.setFont(new Font("宋体", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7F16\u53F7", "\u540D\u79F0", "\u79CD\u7C7B", "\u4EF7\u683C"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		setTable();
	}
	public void  setTable() {
		DefaultTableModel defaultTableModel = new javax.swing.table.DefaultTableModel(new String[] { "编号", "名称", "种类", "价格"}, 0);
		table.setModel(defaultTableModel);
		defaultTableModel.setRowCount(0);
		ShopServiceImpl shopServiceImpl = new ShopServiceImpl();
		List<Shop> list = shopServiceImpl.getAll();
		for (Shop shop : list) {
			System.out.println("商品："+shop);
			defaultTableModel.addRow(new Object[] { shop.getId(),
					shop.getSname(), shop.getKind(), shop.getPrice()});
		}

	}
}

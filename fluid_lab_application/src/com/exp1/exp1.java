package com.exp1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exp1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exp1 frame = new exp1();
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
	public exp1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FRICTION FACTOR CALCULATION");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setBounds(208, 23, 450, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Head Loss Calculation");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(32, 93, 192, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Head(m)");
		lblNewLabel_2.setBounds(54, 124, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(157, 122, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Specific Gravity");
		lblNewLabel_3.setBounds(54, 165, 94, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 157, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(208, 199, 116, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Head Loss(hf)      =");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=textField.getText();
				String b=textField_1.getText();
				double aa=Double.parseDouble(a);
				double bb=Double.parseDouble(b);
				double c=aa*(bb-1);
				textField_7.setText(String.valueOf(c));
			}
		});
		btnNewButton.setBounds(54, 198, 156, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Friction Factor Calculation");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(32, 285, 241, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Gravity(m/s^2)");
		lblNewLabel_5.setBounds(32, 342, 103, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(32, 374, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Dia. of pipe(m)");
		lblNewLabel_5_1.setBounds(169, 342, 116, 16);
		contentPane.add(lblNewLabel_5_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 374, 116, 22);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_5_2 = new JLabel("head loss(hf)(m)");
		lblNewLabel_5_2.setBounds(305, 342, 103, 16);
		contentPane.add(lblNewLabel_5_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(305, 374, 116, 22);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_5_3 = new JLabel("length of pipe(m)");
		lblNewLabel_5_3.setBounds(445, 342, 103, 16);
		contentPane.add(lblNewLabel_5_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(445, 374, 116, 22);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_5_4 = new JLabel("Velocity of flow(m/s)");
		lblNewLabel_5_4.setBounds(580, 342, 126, 16);
		contentPane.add(lblNewLabel_5_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(580, 374, 126, 22);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_4 = new JLabel("formula:-   hf=Head(sp.gravity -1)");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_4.setBounds(270, 89, 277, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Formula :-  f=(2*g*D*hf)/(l*V^2)");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_6.setBounds(270, 282, 304, 22);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("Friction factor(f)    =");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double g=Double.parseDouble(textField_2.getText());
				double d=Double.parseDouble(textField_3.getText());
				double hf=Double.parseDouble(textField_4.getText());
				double l=Double.parseDouble(textField_5.getText());
				double v=Double.parseDouble(textField_6.getText())*Double.parseDouble(textField_6.getText());
				double cc=(2*g*d*hf)/(l*v);
				textField_8.setText(String.valueOf(cc));
			}
		});
		btnNewButton_1.setBounds(270, 447, 162, 25);
		contentPane.add(btnNewButton_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(430, 448, 116, 22);
		contentPane.add(textField_8);
		
		
	}
}

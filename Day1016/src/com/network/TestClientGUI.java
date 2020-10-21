package com.network;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;
public class TestClientGUI extends JFrame implenemts ActionListener{

	static Client client = new TestClient();
	TestServer server = new TestServer();
	static JTextArea textArea = new JTextField();
	JButton inputBt = new JButton("ют╥б");
	JScrollPane scroll = new JscrollPane(textArea);
	public TestClientGUI() {
		setLayout(null);
		scroll.setBounds(0,0,490,500);
		textField.setBounds(0,500,400,30);
		inputBt.setBounds(400,500,80,30);
		
		add(scroll);
		add(textField);
		add(inputBt);
		
		setTitle("TestClient");
		setBOunds(0,0,500,570);
		setVisivle(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		intputBt.addActionListener(this);
	}
}

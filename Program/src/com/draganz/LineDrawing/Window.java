package com.draganz.LineDrawing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Window extends JFrame{

	
	
	public Window(){
		super("ProgramA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * public ColorChoser(){
		super("The Title");
		color = DEFAULT_COLOR;
		panel = new JPanel();
		panel.setBackground(color);
		
		button = new JButton("Choose a color");
		button.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						color = JColorChooser.showDialog(null, "Pick your color", color);
						if(color==null) color = DEFAULT_COLOR;
						
						panel.setBackground(color);
					}
				}
		);
		
		add(panel, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
	}
		 */
	}
	
}

/*class tuna extends JFrame{
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public tuna(){
		super("the title");
		setLayout(new FlowLayout());
		item1 = new JTextField(10);
		add(item1);
		item2 = new JTextField("enter text here");
		add(item2);
		item3 = new JTextField("uneditable",20);
		item3.setEditable(false);
		add(item3);
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	
	private class thehandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			String string = "";
			
			if(event.getSource()==item1){
				string=String.format("field 1: %s", event.getActionCommand());
			}else if(event.getSource()==item2){
				string=String.format("field 2: %s", event.getActionCommand());
			}else if(event.getSource()==item3){
				string=String.format("field 3: %s", event.getActionCommand());
			}else if(event.getSource()==passwordField){
				string=String.format("password field is: %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
			
		}
		
	}
	
}*/









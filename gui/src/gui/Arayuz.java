package gui;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arayuz extends JFrame{

	JButton btn;
	JButton btn2;
	JLabel lbl;
	JTextField tf;
	
	public Arayuz(){
		init();
		
	}
	private void addComponent() {
		
		lbl = new JLabel("yaz");
		tf = new JTextField(15);
		btn = new JButton("Click on me ");
		btn2 = new JButton("Bu buton hiçbirþey yapmýyor xd ");
		add(lbl);
		add(tf);
		add(btn);
		add(btn2);
	}
	
	private void init () {
		this.setTitle("Clicker Simulation");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		addComponent();
	}
	
	public static void main(String[] args) {

		
		Arayuz mygui = new Arayuz();
	

	}

		
	}



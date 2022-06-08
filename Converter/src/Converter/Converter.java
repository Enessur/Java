package Converter;

import java.awt.FlowLayout;

import javax.swing.*;


public class Converter extends JFrame{
	
	public Converter() {
	init();
}
	
	JButton convert;
	JLabel celsius;
	JLabel fahrenheit;
	JTextField tf;
	private void addComponent() {
		celsius = new JLabel("Enter Celcius : ");
		tf = new JTextField(15);
		convert = new JButton("Convert");
		fahrenheit = new JLabel("\nFahrenheit : ");
		
		add(celsius);
		add(tf);
		add(convert);
		add(fahrenheit);
	}
	private void init() {
		this.setTitle("Converter");	
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		addComponent();
	
	}
	
	
	
	public static void main(String[] args) {
		Converter myconverter = new Converter();
		System.out.println("hi");
	}

}

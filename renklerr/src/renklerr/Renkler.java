package renklerr;

import java.awt.*;
import java.awt.Container;

import javax.swing.*;
	

public class Renkler {

public static void main(String[] args) {
	JPanel panel1 = new JPanel();
	JFrame myFrame = new JFrame("Coloful Grids for Sudoku :d ");
	myFrame.setSize(300,300);
	myFrame.setVisible(true);
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel1.setLayout(new GridLayout(4,3));
	Container pane = myFrame.getContentPane();
	
	
	
	pane.setLayout(new GridLayout(9,9));
	JFrame deneme = new JFrame ();


	
	
	panel1.setLayout(null);
	deneme.setLayout(new FlowLayout());
	for(int i = 0;i<81;i++) {
		myFrame.add(new Panel());
	}
	
}
	

	
}

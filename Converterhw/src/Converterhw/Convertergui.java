package Converterhw;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Convertergui  extends JFrame implements ActionListener{
	
	JFrame window = new JFrame("Converter");
	JLabel celsiusLabel = new JLabel("Celsius");
	JTextField celsiusText = new JTextField();
	JLabel fahrenheitLabel = new JLabel("Fahrenheit");
	JTextField fahrenheitText = new JTextField("tüm büyü burda gerçekleþio");
	JButton convertButton = new JButton("Convert");
	GridLayout gl = new GridLayout ();
	ImageIcon ultraCold;
	ImageIcon cold;
	ImageIcon normal;
	ImageIcon hot;
	ImageIcon ultraHot;
	JLabel photo;

	Convertergui(){
		gl.setRows(3);
		gl.setColumns(2);
		
		window.setLayout(gl);
		
		convertButton.addActionListener(this);
		
		
		window.add(celsiusLabel);
		window.add(celsiusText);
		window.add(fahrenheitLabel);
		window.add(fahrenheitText);
		window.add(convertButton);
				
		window.setSize(500,500);
		window.setLocation(500,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}	
	
	public void actionPerformed(ActionEvent pb) {
		if(pb.getSource()== convertButton) {
			double celcius = Double.parseDouble(celsiusText.getText());
			double fahrenheit = (celcius*9/5)+(32);
			fahrenheitText.setText(" "+fahrenheit);
			if ( celcius <= -20) {
				ultraCold = new ImageIcon(getClass().getResource("maxresdefault.jpg"));
				photo = new JLabel(ultraCold);
				window.add(photo);
			}
			else if(celcius > -20 && celcius <= 6) {
				cold = new ImageIcon(getClass().getResource("cold.jpg"));
				photo = new JLabel(cold);
				window.add(photo);
				
			}
			else if(celcius > 6 && celcius <= 24) {
				normal = new ImageIcon(getClass().getResource("normal.jpg"));
				photo = new JLabel(normal);
				window.add(photo);
				
			}
			else if(celcius > 24   && celcius <= 35) {
				hot = new ImageIcon(getClass().getResource("hot.jpg"));
				photo = new JLabel(hot);
				window.add(photo);
				
			}
			else {
				ultraHot = new ImageIcon(getClass().getResource("ultrahot.jpg"));
				photo = new JLabel(ultraHot);
				window.add(photo);
				
			}
			
			
			
		}
	}
	public static void main(String[] args) {
		Convertergui myconverter = new Convertergui();
	
	}	

}

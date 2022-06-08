package butonsayaç;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.*;


public class buttonsayaç extends JFrame implements ActionListener{

	
	
	
	int count = 0;
	JFrame frame = new JFrame("counter");
	JButton countbtn = new JButton("Counter Button");
	JTextField txtfld = new JTextField("  "+count);
	
	 buttonsayaç() {
		
		
		countbtn.addActionListener(this);
		frame.add(countbtn);
		frame.add(txtfld);
		
		frame.setLayout(new FlowLayout());
		
		frame.setTitle("Counter Button");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent cb) {
		
		if(cb.getSource()==countbtn) {
			count = count +1;
			
			txtfld.setText("   "+count);
		}
		
	}

	
	public static void main(String[] args) {
		
		buttonsayaç btnsy = new buttonsayaç();
		
		
	}
	
}

package renklerr;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;

public class Panel extends JPanel {
	
	
	private Color randomColor() {
	int red = (int) (Math.random()*256 );
	int green = (int) (Math.random()*256 );
	int blue = (int) (Math.random()*256 );
	
	return new Color(red,green,blue);
	
	}	
		class myListener extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e){
			setBackground(randomColor());
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			setBackground(randomColor());
		}
		@Override
		public void mouseExited(MouseEvent e) {
			setBackground(randomColor());
		}
		
		
		
	}	
		
		
			
	public Panel() {

		
	addMouseListener(new myListener());
		setBackground(randomColor());
		
		

	
		
}

	
}

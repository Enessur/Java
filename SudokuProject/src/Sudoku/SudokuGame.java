package Sudoku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SudokuGame extends JFrame implements ActionListener{
 	
    
    	
         JFrame frame = new JFrame ();       
         JPanel sudokuP = new JPanel();
         JPanel consoleP = new JPanel();
         JButton red = new JButton();
         JButton green = new JButton();
         JButton blue = new JButton();
         JButton yellow = new JButton();
         JButton check = new JButton("Check");
         int color =0;
         int[][] values = new int [4][4];
         JButton[][] index = new JButton[4][4];
          
         
         public  Color colors(int c) {
        	 int check = color;
        	 
        	 if(check == 0 ) {
        		 return Color.RED;
        	 }
        	 else if(check == 1 ) {
        		 return Color.GREEN;
        	 }
        	 else if(check == 2 ) {
        		 return Color.BLUE;
        	 }
        	 else {
        		 return Color.YELLOW;
        	 }
       	 
         }
 
         
       public SudokuGame (){
        	
        frame.setTitle("TestSudoku");
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());
        frame.setVisible(true);
       
    
           consoleP.setLayout(new GridLayout(3,2));
           sudokuP.setLayout(new GridLayout(4,4));
      
        check.addActionListener(this);       
        red.addActionListener(this);    
        green.addActionListener(this);       
        blue.addActionListener(this);     
        yellow.addActionListener(this);

        red.setBackground(Color.RED);
        green.setBackground(Color.GREEN);
        blue.setBackground(Color.BLUE);
        yellow.setBackground(Color.YELLOW);
        
        consoleP.add(red);
        consoleP.add(green);
        consoleP.add(blue);
        consoleP.add(yellow);
        consoleP.add(check);      
        
        for(int i = 0; i<4 ; i++) {
       	 for(int j =0 ;j<4;j++) {
       		 index[i][j] = new JButton();
       		 index[i][j].addActionListener(this);
       	    }
         }       
        values[0][0]= 1;
        values[0][1]= 5;       
        values[0][2]= 5;    
        values[0][3]= 4;
            
        values[1][0]= 4;  
        values[1][1]= 5;       
        values[1][2]= 1;     
        values[1][3]= 5;
               
        values[2][0]= 5; 
        values[2][1]= 1;    
        values[2][2]= 4;   
        values[2][3]= 5;
          
        values[3][0]= 3;
        values[3][1]= 5;
        values[3][2]= 2;
        values[3][3]= 5;
    
        for(int i = 0; i<4 ; i++) {
        	for(int j = 0 ; j<4; j++) {
        		if(values[i][j]== 1) {
        			index[i][j].setBackground(Color.RED);
        		}
        		if(values[i][j]== 2) {
        			index[i][j].setBackground(Color.BLUE);
        		}
        		if(values[i][j]== 3) {
        			index[i][j].setBackground(Color.GREEN);
        		}
        		if(values[i][j]== 4) {
        			index[i][j].setBackground(Color.YELLOW);
        		}
        		if(values[i][j]==5){
        			index[i][j].setBackground(Color.WHITE);
        		}
        		
        	}
        }
     

       for(int i = 0 ; i< 4 ; i++) {
    	   for (int j = 0 ;j<4; j++) {
    		   sudokuP.add(index[j][i]);
    		   
    	   }
    	   
       }
        frame.add(sudokuP);
        frame.add(consoleP);
        
   
        }
    
       public void actionPerformed(ActionEvent cb){
    	  
	   
           if(cb.getSource()==red) {
        	color = -1;   

    	   }
    	  
    	   if(cb.getSource()==green) {
    		  color = 0;
    	   }
    	    if(cb.getSource()==blue) {
    		  color = 1;
    	   }
    	   
    	   if(cb.getSource()==yellow) {
    		  color = 2;
    	  
           }	   
        
			for(int i = 0; i<4 ; i++) {
				for(int j = 0 ; j<4; j++) {
						if(cb.getSource()==index[i][j]){
						index[i][j].setBackground(colors(color));
						if(color == -1) {
							values[i][j] = 1;
						}
						if(color == 0) {
							values[i][j] = 3;
						}
						if(color == 1) {
							values[i][j] = 2;
						}
						if(color == 2) {
							values[i][j] = 4;
						}
						if(cb.getSource()== index[i][j]) {
							index[i][j].setBackground(colors(color++));
							if (color == 3) {
								color = 0;
								color--;
							}
							
							
							
						}
						}
					}
        		
				}
			
			
			if(cb.getSource()==check) {
				int i;
				int j;
				for( i = 0; i< 4; i++) {
					
					
					for( j = 0; j<4;j++) {
						
						System.out.println(values[i][j]);
					
					}
				
				}
				System.out.println("----------");
				
				{
					if(values[0][0]==values[0][1] || values[0][0]==values[0][2] || values[0][0]==values[0][3] || values[0][1]==values[0][2] || values[0][1]==values[0][3] || values[0][2]==values[0][3])
					{
					System.out.println("Column 1 is not correct.");
				
					}

					if(values[1][0]==values[1][1] || values[1][0]==values[1][2] || values[1][0]==values[1][3] || values[1][1]==values[1][2] || values[1][1]==values[1][3] || values[1][2]==values[1][3])
					{
					System.out.println("Column 2 is not correct.");
			
					}

					if(values[2][0]==values[2][1] || values[2][0]==values[2][2] || values[2][0]==values[2][3] || values[2][1]==values[2][2] || values[2][1]==values[2][3] || values[2][2]==values[2][3])
					{
					System.out.println("Column 3 is not correct.");
		
					}

					if(values[3][0]==values[3][1] || values[3][0]==values[3][2] || values[3][0]==values[3][3] || values[3][1]==values[3][2] || values[3][1]==values[3][3] || values[3][2]==values[3][3])
					{
					System.out.println("Column 4 is not correct.");
		
					} 


					if(values[0][0]==values[1][0] || values[0][0]==values[2][0] || values[0][0]==values[3][0] || values[1][0]==values[2][0] || values[1][0]==values[3][0] || values[2][0]==values[3][0])
					{
					System.out.println("Row 1 is not correct.");
			
					}

					if(values[0][1]==values[1][1] || values[0][1]==values[2][1] || values[0][1]==values[3][1] || values[1][1]==values[2][1] || values[1][1]==values[3][1] || values[2][1]==values[3][1])
					{
					System.out.println("Row 2 is not correct.");
	
					}

					if(values[0][2]==values[1][2] || values[0][2]==values[2][2] || values[0][2]==values[3][2] || values[1][2]==values[2][2] || values[1][2]==values[3][2] || values[2][2]==values[3][2])
					{
					System.out.println("Row 3 is not correct.");

					}

					if(values[0][3]==values[1][3] || values[0][3]==values[2][3] || values[0][3]==values[3][3] || values[1][3]==values[2][3] || values[1][3]==values[3][3] || values[2][3]==values[3][3])
					{
					System.out.println("Row 4 is not correct. ");

					}

					if(values[0][0]==values[1][1] || values[0][1]==values[1][0])
					{
					System.out.println("Box 1 isn't correct.");
		
					}

					if(values[0][2]==values[1][3] || values[0][3]==values[1][2])
					{
					System.out.println("Box 2 isn't  correct.");
		
					}

					if(values[2][0]==values[3][1] || values[3][0]==values[2][1])
					{
					System.out.println("Box 3 isn't correct.");
	
					}

					if(values[2][2]==values[3][3] || values[2][3]==values[3][2])
					{
					System.out.println("Box 4 isn't correct.");
			
					}
				}
			
			}
			
		}
        
       public static void main(String[] args) {
       	
       	SudokuGame sudoku = new SudokuGame();

    }

}
  
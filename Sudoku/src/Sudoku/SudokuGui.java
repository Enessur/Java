package Sudoku;



import java.awt.*;


import javax.swing.*;

public class SudokuGui extends JFrame{
	
	 public SudokuGui() {
	        // Create panel for Sudoku
	        JPanel board = new JPanel();
	        board.setLayout(new GridLayout(3, 3));
	        board.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        for (int row = 0; row < 3; ++row) {
	            for (int col = 0; col < 3; ++col) {
	                JPanel box = new JPanel(new GridLayout(3, 3));
	                box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	                for (int cell = 0; cell < 9; ++cell) {
	                    box.add(new JTextField(2));
	                }
	                board.add(box);
	            }
	        }

	        // Create difficulty combo box
	        JComboBox<String> difficultyChoices = new JComboBox<>(new String[] { "Hard", "Easy" });
	        difficultyChoices.setSelectedIndex(0);

	        // Create menu panel
	        JPanel menu = new JPanel();
	        menu.setLayout(new GridBagLayout());
	        GridBagConstraints menuConstraints = new GridBagConstraints();

	        menuConstraints.anchor = GridBagConstraints.WEST;
	        menuConstraints.weightx = 0.5;
	        menuConstraints.weighty = 0.5;
	        menuConstraints.gridwidth = 2;

	        menuConstraints.gridx = 2;
	        menuConstraints.gridy = 0;
	        menu.add(new JButton("Reset"), menuConstraints);

	        menuConstraints.gridx = 2;
	        menuConstraints.gridy = 1;
	        menu.add(new JButton("Hint"), menuConstraints);

	        menuConstraints.gridx = 2;
	        menuConstraints.gridy = 2;
	        menu.add(new JButton("Solve"), menuConstraints);

	        menuConstraints.gridx = 2;
	        menuConstraints.gridy = 3;
	        menu.add(new JButton("New Puzzle"), menuConstraints);

	        menuConstraints.weighty = 1.0;
	        menuConstraints.gridx = 2;
	        menuConstraints.gridy = 4;
	        menu.add(new JLabel("Difficulty:"), menuConstraints);

	        menuConstraints.fill = GridBagConstraints.HORIZONTAL;
	        menuConstraints.weightx = 0.5;
	        menuConstraints.weighty = 0.5;
	        menuConstraints.gridwidth = 2;
	        menuConstraints.gridx = 0;
	        menuConstraints.gridy = 5;
	        menu.add(difficultyChoices, menuConstraints);

	        // Create output panel
	        JTextArea output = new JTextArea(5, 20);
	        output.setEditable(false);
	        output.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Output Area"));

	        // Join the 3 panels on the frame
	        Container cp = getContentPane();
	        cp.setLayout(new BorderLayout());

	        cp.add(board, BorderLayout.WEST);
	        cp.add(menu, BorderLayout.EAST);
	        cp.add(output, BorderLayout.SOUTH);
	    }

	    public static void main(String[] args) {
	        // Create a frame and set its properties
	        JFrame frame = new SudokuGui();
	        frame.setTitle("TestSudoku");
	        frame.setSize(600, 600);
	        frame.setLocationRelativeTo(null); // Center the frame

	        // Setup the window
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.pack();
	        frame.setVisible(true);
	    }


}

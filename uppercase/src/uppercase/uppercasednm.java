package uppercase;

import java.util.Scanner;

public class uppercasednm {

	public uppercasednm() {
		
		System.out.println("Type here :");
		Scanner scanLine = new Scanner(System.in);
		
		
		String text =  scanLine.nextLine();
		
		System.out.println(" "+text.toUpperCase());
		
	}
	
	
	
	
	public static void main(String[] args) {
	
			uppercasednm yazi = new uppercasednm();
	}

}

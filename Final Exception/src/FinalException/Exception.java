package FinalException;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		
	myThread t = new myThread();
	
	
	t.start();
	
	System.out.println("Press any button to stop :");
		
	new Scanner(System.in).nextLine();
	
	t.setShutDown();
	System.out.println("byee main");

	}

}


package arraylist;

import java.util.ArrayList;

public class arrlist {

		public static void main(String args) {
			
		ArrayList<String> grup = new ArrayList<String>();
		
		grup.add("enes");
		grup.add("k�bra");
		grup.add("eslem");
		
		
		System.out.println("karde� say�s� : "+grup.size());
		
		for(int i = 0 ; i<grup.size();i++) {
	
			System.out.println(i+". karde� = "+grup.get(i));
		}
		
		
		
		
		
		}
}

package arraylist;

import java.util.ArrayList;

public class arrlist {

		public static void main(String args) {
			
		ArrayList<String> grup = new ArrayList<String>();
		
		grup.add("enes");
		grup.add("kübra");
		grup.add("eslem");
		
		
		System.out.println("kardeş sayısı : "+grup.size());
		
		for(int i = 0 ; i<grup.size();i++) {
	
			System.out.println(i+". kardeş = "+grup.get(i));
		}
		
		
		
		
		
		}
}

package arraylist;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> grup = new ArrayList<String>();
		
		grup.add("enes");
		grup.add("k�bra");
		grup.add("eslem");
		grup.add("remove");
		grup.remove(2);
		
		System.out.println("karde� say�s� : "+grup.size());
		
		for(int i = 0 ; i<grup.size();i++) {
	
			System.out.println(i+1 +". karde� = "+grup.get(i));
		}
		for(String s:grup) {
			System.out.println("elemanlar : "+s);
		}
		
	}

}

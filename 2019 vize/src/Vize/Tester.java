package Vize;

import java.util.ArrayList;
import java.util.Random;

public class Tester {

	public static void Call (ArrayList<person>kisiler) {
		
		for (person kisi:kisiler) {
			
			kisi.Talk();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <person>p = new ArrayList<>(); 
		Random rnd = new Random();
		
		for (int i = 0; i< 10; i++) {
			int a =rnd.nextInt(3);
			if(a == 0) {
				p.add(new Foe("Dusman"));
			}
			else if(a == 1) {
				p.add(new Friend("Arkadas"));
			}
			else p.add(new Closefriend("yakin ark"));
			
		}
		Call(p);
		
	}

}

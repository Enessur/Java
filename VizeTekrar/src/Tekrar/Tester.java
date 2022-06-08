package Tekrar;

import java.util.ArrayList;
import java.util.Random;

public class Tester {

	public static  void Call(ArrayList<Person> kisiler) {
		for(Person kisi:kisiler) {
			kisi.Talk();
				
			}
		
	}
	
	
	public static void main(String[] args) {
	
		ArrayList<Person>p = new ArrayList<>();
		Random rnd = new Random();
		
		for(int i = 0; i< 10; i++) {
			int a = rnd.nextInt(3);
			
			if(a == 0) {
				p.add (new Foe("Bruh"));
				
			}
			else if(a == 1) {
				p.add (new Friend("Bruhh"));
			}
			else p.add (new CloseFriend("yey"));
		}
		
		Call(p);
		
	}

}

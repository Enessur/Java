package dicerollhw;

import java.util.ArrayList;
import java.util.Random;

public class dice {

	public static void main(String[] args) {
		
		 ArrayList<Integer> Dices = new ArrayList<>();
		int count = 0;
		Random roll = new Random();
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		
		for(int i = 0; i<20 ; i++) {
			count++;
			
			int rndm = roll.nextInt(100);
			
			if(rndm <= 5 ) {
				Dices.add(1);	
				count1++;
			}
			else if(rndm >= 6 && rndm <=15 ) {
				Dices.add(2);				
				count2++;
			}
			else if(rndm >= 16 && rndm <=35 ) {
				Dices.add(3);				
				count3++;
			}
			else if(rndm >= 36 && rndm <=40 ) {
				Dices.add(4);				
				count4++;
			}
			else if(rndm >= 41 && rndm <=45 ) {
				Dices.add(5);				
				count5++;
			}
			else if(rndm >= 46 && rndm <=50 ) {
				Dices.add(6);				
				count6++;
			}
			else if(rndm >= 51 && rndm <=55 ) {
				Dices.add(7);
			
				count7++;
			}
			else if(rndm >= 56 && rndm <=60 ) {
				Dices.add(8);
				count8++;
			}
			else if(rndm >= 61 && rndm <=70 ) {
				Dices.add(9);
				count9++;
			}
			else  {
				Dices.add(10);
			
				count10++;
			}
			
			
		}
		System.out.println("Dice rolled "+count+" times.");
		for (int i = 0; i<Dices.size(); i++) {
			System.out.println((i+1)+". Roll = "+Dices.get(i));
		}
		System.out.println("1 is rolled "+count1+" times.");
		System.out.println("2 is rolled "+count2+" times.");
		System.out.println("3 is rolled "+count3+" times.");
		System.out.println("4 is rolled "+count4+" times.");
		System.out.println("5 is rolled "+count5+" times.");
		System.out.println("6 is rolled "+count6+" times.");
		System.out.println("7 is rolled "+count7+" times.");
		System.out.println("8 is rolled "+count8+" times.");
		System.out.println("9 is rolled "+count9+" times.");
		System.out.println("10 is rolled "+count10+" times.");		
	}

}

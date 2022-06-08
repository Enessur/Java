package hazýrlýk;

import java.util.Random;

public class FinalHazýrlýk {
	
	
	public static void main(String[] args) {
		yemek mercimek = new yemek();
		mercimek.miktar = 100;
		anne a = new anne(mercimek);
		child1 c1 = new child1(mercimek);
		child2 c2 = new child2(mercimek);
		child3 c3 = new child3(mercimek);
		
		Thread t =new Thread(a);
		Thread t1 =new Thread(c1);
		Thread t2 =new Thread(c2);
		Thread t3 =new Thread(c3);
		
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}

	class anne implements Runnable{
		yemek mercimek;
		public  anne(yemek mercimek) {
			this.mercimek=mercimek;
		}
		public void run() {
			
			for (int i = 0;i<100 ; i++ ) {
			
				mercimek.miktar++;
			System.out.println("Anne çorba koyuyor :"+mercimek.miktar);
			}
			
		}
	}
	
	
	class  child1 implements Runnable{
		yemek mercimek;
		public  child1(yemek mercimek) {
			this.mercimek=mercimek;
		}
		
		public void run() {
		
			for(int i = 0; i<100; i++) {
				
				mercimek.miktar--;
				System.out.println("çocuk 1 içiyor :"+mercimek.miktar);
				
			}
	
		}
		
	}
	class child2 implements Runnable{
		yemek mercimek;
		int x;
		public  child2(yemek mercimek) {
			this.mercimek = mercimek;
		
		}
		public void run() {
			Random roll = new Random();
			int rndm = roll.nextInt(100);
			x = rndm;
			
			for(int i= 0;i<x;i++) {
				
				mercimek.miktar--;
				System.out.println("çocuk 2 içiyor :"+mercimek.miktar);
			}
			
		}
	}

	class child3 implements Runnable{
		yemek mercimek;
		int x;
		public  child3(yemek mercimek) {
			this.mercimek = mercimek;
		}
		public void run() {
			Random roll = new Random();
			int rndm = roll.nextInt(100);
			x = rndm;
			
			for(int i= 0;i<x;i++) {
				
				mercimek.miktar--;
				System.out.println("çocuk 3 içiyor :"+mercimek.miktar);
			}
	
		}
	}
	
	
	
	


class yemek{
		int miktar;
	}
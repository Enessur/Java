package Finalthread;

public class CamelRace {

	public static void main(String[] args) {
	
		road r = new road();
		road r1 = new road();
		road r2 = new road();
		
		r.road = 0;
		r1.road = 0;
		r2.road = 0;
		
		camel1 c1 = new camel1(r);
		camel2 c2 = new camel2(r1);
		camel3 c3 = new camel3(r2);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		
		
		t1.start();
		t2.start();
		t3.start();
	
	}
}

	class camel1 implements Runnable{
		road r;
		public camel1(road r) {
			this.r = r;
		}
		public void run() {
			
		
			
			for (int i = 0;i<100;i++) {
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e){
					
				}
			r.road++;
				System.out.println("Camel 1 takes :"+r.road+" meter");
				
			}
		}
	}
	
	class camel2 implements Runnable{
		road r1;
		public camel2(road r1) {
			this.r1 = r1;
		}
		public void run() {
			
		
		
			for (int i = 0;i<100;i++) {
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e){
					
				}
				r1.road++;
				System.out.println("Camel 2 takes :"+r1.road+" meter");
			
		}
	}
	}
	
	class camel3 implements Runnable{
		road r2;
		public camel3(road r2) {
			this.r2 = r2;
		}
		public void run() {
			
		
		
		
			for(int i = 0 ; i< 100; i++) {
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e){
					
				}
				r2.road++;
				System.out.println("Camel 3 takes : "+r2.road+" meter");
			
		}
	}
	}	
	
	
	
	
	

class road {
	int road;
}


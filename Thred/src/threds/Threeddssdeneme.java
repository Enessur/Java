package threds;

public class Threeddssdeneme   {

	public static void main(String[] args) {
		
		data d = new data();
		d.deger = 100;
		producer p = new producer(d);
		consumer c = new consumer(d);
		consumer2 c2 = new consumer2(d);
		Thread t = new Thread(c);
		Thread t2 = new Thread(c2);
		p.start();
		t.start();
		t2.start();
	}		
}

class producer extends Thread {
	data d;
		public producer(data d) {
			this.d = d;
		}
	public void run() {
		synchronized(d) {
		for(int i = 0 ; i< 10 ;i++) {
			d.deger++;
			System.out.println("producer value : "+d.deger+"  "+i);
		}
		}
	}
	
		
		
}
class consumer implements Runnable {
	data d;
	public consumer(data d) {
		this.d = d;
	}
	public void run() {
		synchronized(d) {
		for (int i = 0; i<10;i++) {
			d.deger--;
			System.out.println("consumer value : "+d.deger+"  "+i);
			
			}
		}
	}
	
}
class consumer2 implements Runnable {
	data d;
	public consumer2(data d) {
		this.d = d;
	}
	public void run() {
		synchronized(d) {
		for (int i = 0; i<10;i++) {
			d.deger--;
			System.out.println("consumer2 value : "+d.deger+"  "+i);
			
			}
		}
	}
	
}

class data{
	
	int deger;
}
package FinalException;

public class myThread extends Thread{

	private volatile boolean running = true;
	
	public void setShutDown() {
		running = false;
	}
	
	public void run() {
		
		
		while (running) {
			
			System.out.println("Helllooo");
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e){
			
			}
			
		}
		System.out.println("Byee ");
	}
	
	
	
}

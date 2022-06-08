package clock;

public class Clock {

	private int hour;
	private int minutes;
	
	public void setHour(int hour) {
		
		this.hour = hour;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public void tellInfo() {
		System.out.println("Time :"+hour+"."+minutes);
		tellAngles();
		
	}
	
	public void tellAngles() {
		int minuteAngle = 6*minutes;
		if(hour >12 ) {
			hour = hour -12;
		}
		int hourAngle = hour*30;
		
		if(Math.abs(minuteAngle-hourAngle)>= 180) {
			System.out.println("Big angle : "+(Math.abs(minuteAngle-hourAngle)));
			System.out.println("Smol angle : "+(360-Math.abs(hourAngle-minuteAngle)));
		}
		else {
			System.out.println("Small angle : "+(Math.abs(minuteAngle-hourAngle)));
			System.out.println("Big angle : "+(360-Math.abs(hourAngle-minuteAngle)));
		}
		
	}
	public static void main(String[] args) {
		Clock clk = new Clock();
		clk.setHour(15);
		clk.setMinutes(30);
		clk.tellInfo();
	}
}

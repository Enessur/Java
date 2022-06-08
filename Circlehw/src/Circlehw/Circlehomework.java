package Circlehw;

public class Circlehomework {

	public static void main(String[] args) {
		
		double x1,y1,x2,y2,radius1,radius2;
		x1 = 20;
		x2 = 100;
		y1 = 10;
		y2 = 25;
		radius1 = 20;
		radius2 = 30;
		double a = (Math.pow((x1-x2), 2)+(Math.pow((y1-y2), 2)));
		double d = Math.sqrt(a);
		double ad= Math.abs(radius1-radius2);
		if(radius1+radius2 <d) {
		System.out.println("No intersection.");
		}
		else if(ad>d) {
			System.out.println("One circle is inside the other and no instersection.");
		}
		else if ( d == 0 &&  ad == 0){
			System.out.println("They intersect infinite number of locations");		
		}			
	}
}

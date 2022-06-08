package settergetter;

public class test {

	public static void main(String[] args) {
		
		settergetter car = new settergetter();
		car.setColor("mavi");
		car.setModel("bmw");
		car.setPrice(900000);
		
		System.out.println("arabanýn özellikleri :" +car.getColor()+car.getModel()+car.getPrice());
		car.start();
		

	}

}

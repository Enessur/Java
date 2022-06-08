package geneltekrar;

public class main {
	
	public static void main(String[] args){
		
		araba car = new araba();
		
		car.setColor("mavi");
		car.setModel("bmw");
		car.setFiyat(900000);
	
		System.out.println("arabanýn bilgileri : "+ car.getColor()+ car.getModel()+car.getFiyat());
		
		
		araba car1 = new araba("pembe","reno",234522);
		
		car1.showInfos();
		
	
	
	}
}

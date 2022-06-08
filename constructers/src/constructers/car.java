package constructers;

public class car {
	
	private String color;
	private String model;
	private int price;
	
	public car() {
		
	}
	public car (String color, String model,int price) {
		this.color = color;
		this.model = model;
		this.price = price;
	}
	
	public void info() {
		System.out.println("Arabanýn rengi"+this.color+" arabanýn modeli "+this.model+"arabanýn fiyatý "+this.price);
	}
}

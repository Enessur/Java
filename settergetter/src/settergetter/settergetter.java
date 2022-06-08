package settergetter;

public class settergetter {
	
	private String color;
	private String model;
	private int price;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	public void setPrice(int a) {
		this.price = a;
	}
	public int getPrice() {
		return this.price;
	}
	public void start() {
		System.out.println("araba calýstý");
	}
}

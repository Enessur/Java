package geneltekrar;

public class araba {

		private String color;
		private String model;
		private int fiyat;
		
	public araba() {
		System.out.println("buraya de�er d��m�yor");
	}
		
		public void setColor(String color) {
			this.color = color;
			
		}
		public String getColor() {
			return this.color;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getModel(){
			return this.model;
		}
		public void setFiyat(int a) {
			this.fiyat= a;
		}
		public int getFiyat() {
			return this.fiyat;
		}
		
		public araba(String color,String model,int fiyat) {
			this.color = color;
			this.model = model;
			this.fiyat = fiyat;
		}
		public void showInfos() {
			System.out.println("araban�n bilgileri : "+this.color+this.model+this.fiyat);
		}
}

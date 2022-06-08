package FinalConstructor;




class insan{
	
	 int boy;
	 int kilo;
	
	
	public insan(){		//default const
		System.out.println("insan oluþturuldu");
	}
	public insan(int boy,int kilo) {  // polimorfizm
		
		 
		this(); // default const u çalýþtýrýr
		this.boy = 180;  // class insan içinde ki boy artýk 180
		this.kilo = 70; // class insan içindeki kilo artýk 70;
		
		
		
	}
	
}




public class Constructor {

	
	
	
	public static void main(String[] args) {
		
		
		insan enes = new insan();
		insan ali = new insan(190,90);
		
		enes.kilo = 60;
		enes.boy = 180;
		
		
		System.out.println("enesin  bilgileri : "+enes.kilo+","+enes.boy);
		System.out.println("alinin bilgileri : "+ali.kilo+","+ali.boy);
		
	}
	
	
	
	
}

package FinalConstructor;




class insan{
	
	 int boy;
	 int kilo;
	
	
	public insan(){		//default const
		System.out.println("insan olu�turuldu");
	}
	public insan(int boy,int kilo) {  // polimorfizm
		
		 
		this(); // default const u �al��t�r�r
		this.boy = 180;  // class insan i�inde ki boy art�k 180
		this.kilo = 70; // class insan i�indeki kilo art�k 70;
		
		
		
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

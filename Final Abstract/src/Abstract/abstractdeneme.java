package Abstract;


abstract class dog{
	
	public void bark(){
		System.out.println("haw haw");// gövdeli metot oldugu zaman bunu extend eden classýn bu metod u doldurmasýna gerek yok çünkü zaten bellli ne yapýcagý
	}
	
	public abstract void poop(); // gövdesiz metot oldugu zaman bunu extend eden alt classlarýn bu metod u doldurmasý lazým çünkü ne yapýcaklarýný bilmiyorlar
	// bu kod olmadan da köpekler poop yapar ama bunu kullanmamýzýn nedeni köpeðin özelliklerini alan her alt classýn poop yapmasý lazým bu þekilde onu tanýmlamak zorunda kalýyor
	// eðer bir iþlem her alt sýnýf için ayný þekilde gerçekleþiyorsa onu abstract class içinde doldururuz mesela bütün köpekler hawlar bu yüzden burda doldurduk ama eðer
	// konu sevdiði oyuncak olsaydý örneðin goldenlar çubuklar ile oyunamayý severken  huskyler top ile oyunamayý sevsin, bu farklýlýk göstericeði için 
	// bu metod u doldurmuyoruz çünkü bunu alt classlar içinde farklý bir þekilde tanýmlamamýz lazým
	
}


class husky extends dog{
	
	public void bark() {
		System.out.println("bitcoin al");
	}
	
	public void poop() {
		System.out.println("ý never poop in my owner shoes");
	}
	
	
	public void kuyruksalla() {
		System.out.println("hýzlý kuyruk go brrr");
	}
	
	
	
	
}
class golden extends dog{
	
	public void kuyruksalla() {
		System.out.println("kuyruk sallýyorum");
	}
	
	//public void bark() {
		//System.out.println("deneme");   bu override oluyor üzerinde basýlacak
	//}
	
public void poop() {
	System.out.println("ý pooped");
}
}

	 interface kuyruk{
		 
		 	// abstract ile farký içinde asla belirli bir kod olmaz sadece özellikler olur çünkü kodun baþýna görünmez bir public abstract ekliyor interface 
	 void kuyruksalla();
}


public  class abstractdeneme {

	

	
	
	public static void main(String[] args) {
		
	golden doggo =new golden();
	doggo.bark();
	doggo.poop();
	doggo.kuyruksalla();
	
	husky köpke = new husky();
	köpke.bark();
	köpke.poop();
	köpke.kuyruksalla();
	
	dog köp = new husky();
	köp.bark();
	köp.poop();
	
	
	
	
	
	
	}
	
	
	
}

package Abstract;


abstract class dog{
	
	public void bark(){
		System.out.println("haw haw");// g�vdeli metot oldugu zaman bunu extend eden class�n bu metod u doldurmas�na gerek yok ��nk� zaten bellli ne yap�cag�
	}
	
	public abstract void poop(); // g�vdesiz metot oldugu zaman bunu extend eden alt classlar�n bu metod u doldurmas� laz�m ��nk� ne yap�caklar�n� bilmiyorlar
	// bu kod olmadan da k�pekler poop yapar ama bunu kullanmam�z�n nedeni k�pe�in �zelliklerini alan her alt class�n poop yapmas� laz�m bu �ekilde onu tan�mlamak zorunda kal�yor
	// e�er bir i�lem her alt s�n�f i�in ayn� �ekilde ger�ekle�iyorsa onu abstract class i�inde doldururuz mesela b�t�n k�pekler hawlar bu y�zden burda doldurduk ama e�er
	// konu sevdi�i oyuncak olsayd� �rne�in goldenlar �ubuklar ile oyunamay� severken  huskyler top ile oyunamay� sevsin, bu farkl�l�k g�sterice�i i�in 
	// bu metod u doldurmuyoruz ��nk� bunu alt classlar i�inde farkl� bir �ekilde tan�mlamam�z laz�m
	
}


class husky extends dog{
	
	public void bark() {
		System.out.println("bitcoin al");
	}
	
	public void poop() {
		System.out.println("� never poop in my owner shoes");
	}
	
	
	public void kuyruksalla() {
		System.out.println("h�zl� kuyruk go brrr");
	}
	
	
	
	
}
class golden extends dog{
	
	public void kuyruksalla() {
		System.out.println("kuyruk sall�yorum");
	}
	
	//public void bark() {
		//System.out.println("deneme");   bu override oluyor �zerinde bas�lacak
	//}
	
public void poop() {
	System.out.println("� pooped");
}
}

	 interface kuyruk{
		 
		 	// abstract ile fark� i�inde asla belirli bir kod olmaz sadece �zellikler olur ��nk� kodun ba��na g�r�nmez bir public abstract ekliyor interface 
	 void kuyruksalla();
}


public  class abstractdeneme {

	

	
	
	public static void main(String[] args) {
		
	golden doggo =new golden();
	doggo.bark();
	doggo.poop();
	doggo.kuyruksalla();
	
	husky k�pke = new husky();
	k�pke.bark();
	k�pke.poop();
	k�pke.kuyruksalla();
	
	dog k�p = new husky();
	k�p.bark();
	k�p.poop();
	
	
	
	
	
	
	}
	
	
	
}

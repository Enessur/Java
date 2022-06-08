package override;

class Animal{
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println("konu�");
	}
	
	
}
class bird extends Animal{

	public bird(String name) {
	super(name);
	}

	@Override
	public void speak() {
			System.out.println(getName()+ "�t�yor");
	}
	 
}

class dog extends Animal {
	
	public dog(String name) {
		super(name);
	}

	public void fetchstick() {
		System.out.println("� bring stick");
	}
	@Override
	public void speak() {
		System.out.println(getName()+ "haw haw");
	}
	
	
}

class cat extends Animal{
	public cat(String name) {
		super(name);
	}
	@Override
	public void speak(){
		System.out.println(getName()+ " miyav");
	}


}

public class main {
	public static void speak(Animal animal) {
		animal.speak();
	}
	public static void main(String[] args) {
		
		Animal animal = new Animal("hayvan");
		dog doggo = new dog("doggo");
		Animal dnm = new dog("deneme");
		bird ku� = new bird("gg qush");
		ku�.speak();
		dnm.speak();
		doggo.speak();
		animal.speak();
		doggo.fetchstick();
		speak(new cat("kedicik"));
		
	}
}

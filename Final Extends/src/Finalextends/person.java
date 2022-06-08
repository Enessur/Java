package Finalextends;

public abstract class person {


	private String name;
	private String surname;
	private int age;



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	public abstract void ünvan();
	public abstract void showInfo();
	
}


class calýþan extends person{
	

	
	public void ünvan() {
		System.out.println("ben calýsaným");
	}
	public void showInfo() {
		System.out.println("Adým : "+getName()+"Soyadým : "+getSurname()+"Yaþým :"+getAge());
	}
}


class müdür extends calýþan{
	
	
	
	public void ünvan() {
		System.out.println("ben patronum");
	}
}


	


















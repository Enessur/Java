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


	public abstract void �nvan();
	public abstract void showInfo();
	
}


class cal��an extends person{
	

	
	public void �nvan() {
		System.out.println("ben cal�san�m");
	}
	public void showInfo() {
		System.out.println("Ad�m : "+getName()+"Soyad�m : "+getSurname()+"Ya��m :"+getAge());
	}
}


class m�d�r extends cal��an{
	
	
	
	public void �nvan() {
		System.out.println("ben patronum");
	}
}


	


















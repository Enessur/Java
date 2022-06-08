package sýnav;

public class employee {

	
	private String name;
	private String surname;
	private String employee;
	
	public employee(String name,String surname,String employee) {
		this.name =name;
		this.surname = surname;
		this.employee = employee;
		
	}
	public void showInfo(){
		System.out.println("name : "+this.name);
		System.out.println("surname :"+this.surname);
		System.out.println("employee name : "+this.employee);
		
	}
			
}

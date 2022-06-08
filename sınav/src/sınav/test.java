package sýnav;


public class test {
public static void main(String[] args) {
		
		employee employee = new employee("Enes","bu","mustafa");
		employee.showInfo();
		manager manager = new manager("ahmet","sýnav","kamal");
		manager.showInfo();
		
		employee manager1 = new manager("ali","zor","zeynep");
		manager1.showInfo(); 
	}

}

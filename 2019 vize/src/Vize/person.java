package Vize;

import java.util.ArrayList;

public abstract class person {
	
	private String name;
	private ArrayList<person> PIKN = new ArrayList<>();
	public String getName() {return name;}
	public person(String name) {
		this.name = name;
	}
	public void addPerson(person p) {
		PIKN.add(p);
	}
	public void removePerson(person p) {
		PIKN.remove(p);
	}
	public abstract void Talk();
	

}

package Tekrar;

import java.util.ArrayList;

public abstract class Person {

	private String name;
	private ArrayList<Person> PIKN = new ArrayList<>();
	public String getName() {    return name;   }
	public Person(String name) {
		this.name = name;
	}
	public void addPerson(Person p) {
		PIKN.add(p);
	}
	public void removePerson(Person p) {
		PIKN.remove(p);
	}
	public void Talk() {
		
	}
	
	}

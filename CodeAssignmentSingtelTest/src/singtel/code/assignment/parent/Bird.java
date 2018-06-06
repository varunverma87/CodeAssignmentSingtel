package singtel.code.assignment.parent;

import singtel.code.assignment.interfaces.Animal;

public class Bird implements Animal{

	@Override
	public String walk(String message) {
		System.out.println("I am walking");
		return message;
	}
	
	String name;

	public Bird(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString(){
		return name;
		
	}

}

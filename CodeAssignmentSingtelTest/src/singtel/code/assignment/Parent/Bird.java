package singtel.code.assignment.Parent;

import singtel.code.assignment.interfaces.Animal;

public class Bird implements Animal{

	@Override
	public void walk() {
		System.out.println("I am walking");
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

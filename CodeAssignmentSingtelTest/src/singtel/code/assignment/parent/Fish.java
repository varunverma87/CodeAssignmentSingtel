/**
 * 
 */
package singtel.code.assignment.parent;

import singtel.code.assignment.interfaces.Animal;
import singtel.code.assignment.interfaces.Sing;
import singtel.code.assignment.interfaces.Swim;

/**
 * @author VARUN VERMA
 *
 */
public class Fish implements Animal,Sing,Swim{

	String name;
	@Override
	public String walk(String message) {
		
		return name+" "+message;
		
	}

	@Override
	public String sing(String message) {
		// TODO Auto-generated method stub
		return name+" "+message;
	}

	@Override
	public String swim(String message) {
		// TODO Auto-generated method stub
		return name+" "+message;
	}
	
	public Fish(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString(){
		return name;
		
	}

}

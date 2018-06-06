/**
 * 
 */
package singtel.code.assignment.Impl;

import singtel.code.assignment.Parent.AbstractBehaviour;
import singtel.code.assignment.interfaces.Animal;
import singtel.code.assignment.interfaces.Swim;

/**
 * @author VARUN VERMA
 *
 */
public class SwimImpl extends AbstractBehaviour implements Swim{

	public SwimImpl(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String swim(String message) {
		// TODO Auto-generated method stub
		message = "A"+" "+animal+" "+message;
		return message;
	}
	
	

}

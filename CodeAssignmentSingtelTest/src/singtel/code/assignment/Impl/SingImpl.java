/**
 * 
 */
package singtel.code.assignment.Impl;

import singtel.code.assignment.Parent.AbstractBehaviour;
import singtel.code.assignment.interfaces.Animal;
import singtel.code.assignment.interfaces.Sing;

/**
 * @author VARUN VERMA
 *
 */
public class SingImpl extends AbstractBehaviour implements Sing{

	public SingImpl(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sing(String message) {
		// TODO Auto-generated method stub
		message = "A"+" "+animal+" says : "+message;
		return message;
	}
	
	

}

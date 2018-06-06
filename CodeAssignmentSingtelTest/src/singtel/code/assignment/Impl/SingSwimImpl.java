package singtel.code.assignment.Impl;

import singtel.code.assignment.interfaces.Animal;
import singtel.code.assignment.interfaces.Sing;
import singtel.code.assignment.interfaces.Swim;

/**
 * @author VARUN VERMA
 *
 */
public class SingSwimImpl implements Swim,Sing {

	private Sing sing;
	private Swim swim;
	
	public SingSwimImpl(Animal animal) {
		this.sing = new SingImpl(animal);
		this.swim = new SwimImpl(animal);
	}

	@Override
	public String swim(String message) {
		// TODO Auto-generated method stub
		return swim.swim(message);
	}

	@Override
	public String sing(String message) {
		// TODO Auto-generated method stub
		return sing.sing(message);
	}

}

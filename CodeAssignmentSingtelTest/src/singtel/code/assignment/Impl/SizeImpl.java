package singtel.code.assignment.Impl;

import singtel.code.assignment.interfaces.Animal;
import singtel.code.assignment.interfaces.Size;
import singtel.code.assignment.parent.AbstractBehaviour;

public class SizeImpl extends AbstractBehaviour implements Size {

	public SizeImpl(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

		
	@Override
	public String size(String message) {
		// TODO Auto-generated method stub
		return message;
	}

}

package singtel.code.assignment.Impl;

import singtel.code.assignment.interfaces.Animal;
import singtel.code.assignment.interfaces.Color;
import singtel.code.assignment.parent.AbstractBehaviour;

public class ColorImpl extends AbstractBehaviour implements Color {

	public ColorImpl(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String color(String message) {
		// TODO Auto-generated method stub
		return message;
	}

}

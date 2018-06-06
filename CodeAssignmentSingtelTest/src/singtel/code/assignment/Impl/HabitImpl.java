package singtel.code.assignment.Impl;

import singtel.code.assignment.interfaces.Animal;
import singtel.code.assignment.interfaces.Habit;
import singtel.code.assignment.parent.AbstractBehaviour;

public class HabitImpl extends AbstractBehaviour implements Habit {

	public HabitImpl(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String habit(String message) {
		// TODO Auto-generated method stub
		return message;
	}

}

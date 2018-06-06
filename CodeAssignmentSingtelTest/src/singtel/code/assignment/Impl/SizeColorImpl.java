package singtel.code.assignment.Impl;

import singtel.code.assignment.interfaces.Animal;
import singtel.code.assignment.interfaces.Color;
import singtel.code.assignment.interfaces.Sing;
import singtel.code.assignment.interfaces.Size;
import singtel.code.assignment.interfaces.Swim;

/**
 * @author VARUN VERMA
 *
 */
public class SizeColorImpl implements Size,Color {

	private Size size;
	private Color color;
	
	public SizeColorImpl(Animal animal) {
		this.size = new SizeImpl(animal);
		this.color = new ColorImpl(animal);
	}

	@Override
	public String color(String message) {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String size(String message) {
		// TODO Auto-generated method stub
		return message;
	}

	public String overall(String message) {
		// TODO Auto-generated method stub
		return size+" and "+color;
	}

}

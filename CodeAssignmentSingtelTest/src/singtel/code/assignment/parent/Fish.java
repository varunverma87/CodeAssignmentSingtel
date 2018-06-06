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

	@Override
	public String walk(String message) {
		
		return message;
		
	}

	@Override
	public String sing(String message) {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String swim(String message) {
		// TODO Auto-generated method stub
		return message;
	}

}

package singtel.code.assignment.solution;

import singtel.code.assignment.Impl.SingImpl;
import singtel.code.assignment.Impl.SingSwimImpl;
import singtel.code.assignment.Parent.Bird;

public class Solution {
	public static void main(String[] args) {
		
		Bird duck = new Bird("duck");
		SingSwimImpl duckBehaviour = new SingSwimImpl(duck);
		System.out.println(duckBehaviour.sing("“Quack, quack”"));
		System.out.println(duckBehaviour.swim("can swim"));
		
		Bird chicken = new Bird("duck");
		SingImpl chickenBehaviour = new SingImpl(chicken);
		System.out.println(chickenBehaviour.sing("“Cluck, cluck”"));
		
		
		
	}
}

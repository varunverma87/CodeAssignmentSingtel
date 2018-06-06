package singtel.code.assignment.solution;

import singtel.code.assignment.Impl.SingImpl;
import singtel.code.assignment.Impl.SingSwimImpl;
import singtel.code.assignment.parent.Bird;
import singtel.code.assignment.parent.Fish;

public class Solution {
	public static void main(String[] args) {
		
		Bird duck = new Bird("duck");
		SingSwimImpl duckBehaviour = new SingSwimImpl(duck);
		System.out.println(duckBehaviour.sing("“Quack, quack”"));
		System.out.println(duckBehaviour.swim("can swim"));
		
		Bird chicken = new Bird("chicken");
		SingImpl chickenBehaviour = new SingImpl(chicken);
		System.out.println(chickenBehaviour.sing("“Cluck, cluck”"));
		
		Bird rooster = new Bird("rooster");
		SingImpl roosterBehaviour = new SingImpl(rooster);
		System.out.println(roosterBehaviour.sing("“Cock-a-doodle-doo”"));
		
		Bird parrotwithdogs = new Bird("parrot living with dogs");
		SingImpl parrotwithdogsBehaviour = new SingImpl(parrotwithdogs);
		System.out.println(parrotwithdogsBehaviour.sing("“Woof, woof”"));
		
		Bird parrotwithcats = new Bird("parrot living with cats");
		SingImpl parrotwithcatsBehaviour = new SingImpl(parrotwithcats);
		System.out.println(parrotwithcatsBehaviour.sing("“Meow”"));
		
		Bird parrotwithrooster = new Bird("parrot living near the rooster");
		SingImpl parrotwithroosterBehaviour = new SingImpl(parrotwithrooster);
		System.out.println(parrotwithroosterBehaviour.sing("“Cock-a-doodle-doo”"));
		
		Fish fishes = new Fish();
		System.out.println(fishes.walk("Fishes don’t walk"));
		System.out.println(fishes.sing("Fishes don’t sing"));
		System.out.println(fishes.swim("Fishes can swim"));
	}
}

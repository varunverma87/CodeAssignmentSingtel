package singtel.code.assignment.solution;

import singtel.code.assignment.Impl.HabitImpl;
import singtel.code.assignment.Impl.SingImpl;
import singtel.code.assignment.Impl.SingSwimImpl;
import singtel.code.assignment.Impl.SizeColorImpl;
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
		
		Fish fishes = new Fish("fishes");
		System.out.println(fishes.walk("don’t walk"));
		System.out.println(fishes.sing("don’t sing"));
		System.out.println(fishes.swim("can swim"));
		
		Fish shark = new Fish("Shark");
		SizeColorImpl SharkBehaviour = new SizeColorImpl(shark);
		System.out.println(shark+" are "+SharkBehaviour.size("large")+" and "+SharkBehaviour.color("grey"));
		
		Fish clownFish = new Fish("ClownFish");
		SizeColorImpl clownFishBehaviour = new SizeColorImpl(clownFish);
		System.out.println(clownFish+" are "+clownFishBehaviour.size("small")+" and "+clownFishBehaviour.color("orange"));
		
		
		Fish clownFish2 = new Fish("ClownFish");
		HabitImpl clownFish2Behaviour = new HabitImpl(clownFish2);
		System.out.println(clownFish+" "+clownFish2Behaviour.habit("make jokes"));
		
		Fish shark2 = new Fish("Shark");
		HabitImpl shark2Behaviour = new HabitImpl(shark2);
		System.out.println(shark2+" "+shark2Behaviour.habit("eat other fish"));
		
		
		
		
	}
}

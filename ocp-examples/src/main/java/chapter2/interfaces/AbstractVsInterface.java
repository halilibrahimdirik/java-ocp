package chapter2.interfaces;

/*
 * Interfaces are used to implement abstraction. 
 * So the question arises why use interfaces when we have abstract classes?
 * The reason is, abstract classes may contain non-final variables, 
 * whereas variables in interface are final, public and static.
 */
public abstract class AbstractVsInterface {
	int id = 10;
}

// A simple interface
interface Player {
	
	// public, static and final
	int id = 10;

	// public and abstract
	int move();
}

class FootballPlayer implements Player {
	
	public int pubId=0;
	
	public static int staticId=0;

	@Override
	public int move() {
		// TODO 
		//ERROR The final field Player.id cannot be assigned
		// TODO Uncomment
		// TODO id=id+1;
		return 0;
	}
}

class Football {

	public static void main(String[] args) {
		System.out.println(Player.id);
		System.out.println(FootballPlayer.staticId);
		
	}
}

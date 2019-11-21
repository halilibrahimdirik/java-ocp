package chapter4;

public class VariablesInLambdas {

	interface Gorilla {
		String move();
	}

	class GorillaFamily {
		private String walk = "walk";
		

		void everyonePlay(boolean baby) {
			String approach = "amble";
			// approach = "run";

			play(() -> walk);
			play(() -> baby ? "hitch a ride" : "run");
			play(() -> approach);
		}

		void play(Gorilla g) {
			System.out.println(g.move());
		}
	}
}

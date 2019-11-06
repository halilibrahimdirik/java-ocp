package chapter2.bookSamples;

public class FindMatchingAnimals {
	private static void print(Animal animal, CheckTrait trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}

	public static void main(String[] args) {
		CheckTrait trait1 = a -> a.canHop();
		CheckTrait trait2 = (Animal a) -> {
			return a.canHop();
		};
		CheckTrait trait3 = a -> {
			return a.canHop();
		};
		CheckTrait trait4 = (Animal a) -> a.canHop();
		print(new Animal("fish", false, true), trait1);
		print(new Animal("kangaroo", true, false), a -> a.canHop());

		CheckTraitWithNoParam trait5 = () -> true;
		

	}
}

interface CheckTraitWithNoParam {
	public boolean test();
}

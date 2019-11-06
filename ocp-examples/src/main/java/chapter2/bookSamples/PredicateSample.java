package chapter2.bookSamples;

import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {
		Predicate<Animal> trait = a -> a.canHop();
		print(new Animal("fish", false, true), trait);
		Predicate<Animal> trait2 = a -> a.canHop();
		print(new Animal("kangaroo", true, false), trait2);
	}
	
	private static void print(Animal animal, Predicate<Animal> trait) {
		if(trait.test(animal))
		System.out.println(animal);
		}
}

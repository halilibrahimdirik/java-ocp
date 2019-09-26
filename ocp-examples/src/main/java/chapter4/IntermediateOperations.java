package chapter4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {

		// filter()
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.filter(x -> x.startsWith("m")).forEach(System.out::println); // monkey

		// distinct()
		Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
		s2.distinct().forEach(System.out::print); // duckgoose

		// limit() and skip()
		Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
		s3.skip(5).limit(2).forEach(System.out::print); // 67

		// map()
		Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
		s4.map(String::length).forEach(System.out::print); // 676

		// flatMap()
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(l -> l.stream()).forEach(System.out::println);

		// flatMap()
		List<Integer> zero1 = Arrays.asList();
		List<Double> one1 = Arrays.asList(8.0);
		List<Short> two1 = Arrays.asList((short) 1, (short) 2, (short) 3);
		Stream<List<? extends Number>> animals2 = Stream.of(zero1, one1, two1);
		animals2.flatMap(l -> l.stream()).forEach(System.out::println);

		// sorted
		Stream<String> s5 = Stream.of("brown-", "bear-");
		s5.sorted().forEach(System.out::print); // bear-brown-

		Stream<String> s6 = Stream.of("brown bear-", "grizzly-");
		s6.sorted(Comparator.reverseOrder()).forEach(System.out::print); // grizzly-brown bear
		// Here we passed a Comparator to specify that we want to sort in the reverse of
		// natural
		// sort order. Ready for a tricky one? Do you see why this doesn’t compile?
		// s6.sorted(Comparator::reverseOrder); // DOES NOT COMPILE

		Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
		long count = stream.filter(e -> e.startsWith("g")).peek(System.out::println).count(); // grizzly
		System.out.println(count); // 1

	}
}

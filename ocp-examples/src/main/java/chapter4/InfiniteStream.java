package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		IntStream iterate1 = IntStream.iterate(0, i -> i + 2);
		Stream<Integer> mapToObj = iterate1.mapToObj(Integer::valueOf);
		List<Integer> ints = mapToObj.limit(10).collect(Collectors.toList());

		System.out.println(ints);

		// Exception in thread "main" java.lang.IllegalStateException: stream has
		// already been operated upon or closed
		// at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
		// at java.util.stream.IntPipeline.reduce(IntPipeline.java:456)
		// at java.util.stream.IntPipeline.sum(IntPipeline.java:414)
		// at chapter5.InfiniteStream.main(InfiniteStream.java:17)
		// TODO Uncomment Stream<Integer> mapToObj2 =
		// iterate1.mapToObj(Integer::valueOf);

		IntStream iterate2 = IntStream.iterate(0, i -> i + 2).limit(10);
		int sum = iterate2.sum();

		System.out.println("sum : " + sum);

		List<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100)).limit(10)
				.collect(Collectors.toList());

		System.out.println(randomNumbers);

		Integer sum1 = randomNumbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum1);

		Integer sum2 = randomNumbers.stream().reduce(0, Integer::sum);
		System.out.println(sum2);

		Supplier<Employee> s1 = () -> Employee.create();
		Supplier<Employee> s2 = Employee::create;
		List<Employee> employees1 = Stream.generate(s1).limit(5).collect(Collectors.toList());
		List<Employee> employees2 = Stream.generate(s2).limit(5).collect(Collectors.toList());

		System.out.println(employees1);
		System.out.println(employees2);

		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("initial", (s, c) -> s + c);
		System.out.println(word); // wolf

		BinaryOperator<Integer> op = (a, b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3, 5, 6);
		empty.reduce(op).ifPresent(System.out::println); // no output
		oneElement.reduce(op).ifPresent(System.out::println); // 3
		threeElements.reduce(op).ifPresent(System.out::println); // 90

		// collect()
		Stream<String> streamToCollect1 = Stream.of("w", "o", "l", "f");
		StringBuilder wordResult = streamToCollect1.collect(StringBuilder::new, StringBuilder::append,
				StringBuilder::append);
		System.out.println("wordResult " + wordResult);

		Stream<String> streamToCollect2 = Stream.of("w", "o", "l", "f");
		List<String> asList = streamToCollect2.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println("asList " + asList);

		Stream<String> stream4 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = stream4.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set); // [f, l, o, w]
		
		Stream<String> stream5 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set5 = stream5.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set5); // [f, l, o, w]
		
		//If we didn’t need the set to be sorted, we could make the code even shorter:
		Stream<String> stream6 = Stream.of("w", "o", "l", "f");
		Set<String> set6 = stream6.collect(Collectors.toSet());
		System.out.println(set6); // [f, w, l, o]

	}
}

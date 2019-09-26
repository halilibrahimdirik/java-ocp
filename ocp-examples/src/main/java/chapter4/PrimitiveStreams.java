package chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.reduce(0, (s, n) -> s + n));

		Stream<Integer> stream2 = Stream.of(1, 2, 3);
		IntStream mapToInt = stream2.mapToInt(x -> x);
		System.out.println(mapToInt.sum());

		Stream<Byte> streamb = Stream.of((byte) 1, (byte) 2, (byte) 3);
		IntStream mapToByte = streamb.mapToInt(x -> x);
		System.out.println(mapToByte.sum());

		Stream<Integer> stream3 = Stream.of(1, 2, 3);
		DoubleStream doubleStream = stream3.mapToDouble(x -> x);
		System.out.println(doubleStream.sum());

		Stream<Integer> stream4 = Stream.of(1, 2, 3);
		LongStream longStream = stream4.mapToLong(x -> x);
		System.out.println(longStream.sum());

		// Creating a list of Strings
		List<String> list = Arrays.asList("1", "2", "3", "4", "5");

		// Using Stream flatMapToInt(Function mapper)
		list.stream().flatMapToInt(num -> IntStream.of(Integer.parseInt(num))).forEach(System.out::print);
		System.out.println();

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<List<Integer>> lists = Arrays.asList(list1, list2);
		lists.stream().flatMapToInt(ls -> ls.stream().mapToInt(x -> x)).forEach(System.out::print);
		System.out.println();

		DoubleStream random = DoubleStream.generate(Math::random);
		DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
		random.limit(3).forEach(System.out::println);
		System.out.println();
		fractions.limit(3).forEach(System.out::println);
		
		IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
		count.forEach(System.out::println);
		
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println);
		
		
		Stream<String> objStream = Stream.of("1", "2");
		Stream<String> map = objStream.map(s->s);
		
		Stream<String> objStream1 = Stream.of("1", "2");
		DoubleStream mapToDouble = objStream1.mapToDouble(s->Double.parseDouble(s));
		
		
	}
}

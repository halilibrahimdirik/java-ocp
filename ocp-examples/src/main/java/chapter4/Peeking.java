package chapter4;

import java.util.stream.Stream;

public class Peeking {

	public static void main(String[] args) {

		Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
		infinite.limit(5).filter(x -> x % 2 == 1).forEach(System.out::print); // 135
		System.out.println();

		Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
		infinite2.limit(5).peek(System.out::print).filter(x -> x % 2 == 1).forEach(System.out::print);// 11233455
		System.out.println();

		Stream<Integer> infinite3 = Stream.iterate(1, x -> x + 1);
		infinite3.filter(x -> x % 2 == 1).limit(5).forEach(System.out::print); // 13579
		System.out.println();

		Stream<Integer> infinite4 = Stream.iterate(1, x -> x + 1);
		infinite4.filter(x -> x % 2 == 1).peek(System.out::print).limit(5).forEach(System.out::print);// 1133557799
	}
}

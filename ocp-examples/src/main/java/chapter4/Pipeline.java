package chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Pipeline {

	public static void main(String[] args) {

		// get the first two names alphabetically that are four characters long. In
		// Java-7
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		List<String> filtered = new ArrayList<>();
		for (String name : list) {
			if (name.length() == 4)
				filtered.add(name);
		}
		Collections.sort(filtered);
		Iterator<String> iter = filtered.iterator();
		if (iter.hasNext())
			System.out.println(iter.next());
		if (iter.hasNext())
			System.out.println(iter.next());

		// java-8
		List<String> list2 = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list2.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
		System.out.println();

		// It actually hangs until you kill the program or it throws an exception after
		// running out
		// of memory. The foreman has instructed sorted() to wait until everything to
		// sort is present.
		// That never happens because there is an infinite stream
		// TODO- Uncomment
		// Stream.generate(() -> "Elsa").filter(n -> n.length() ==
		// 4).sorted().limit(2).forEach(System.out::println);

		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).sorted().forEach(System.out::println);
		System.out.println();

		// This one hangs as well until we kill the program. The filter doesn’t allow
		// anything
		// through, so limit() never sees two elements. This means that we have to keep
		// waiting and
		// hope that they show up
		// TODO- Uncomment
//		Stream.generate(() -> "Olaf Lazisson").filter(n -> n.length() == 4).limit(2).sorted()
//				.forEach(System.out::println);

	}
}

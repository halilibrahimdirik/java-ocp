package chapter3;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferences {

	public static void main(String[] args) {

		// Method refences static methods
		Consumer<List<Integer>> methodRef1 = Collections::sort;

		Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

		Consumer<List<Integer>> lambda2 = (List<Integer> l) -> Collections.sort(l);

		Consumer<List<Integer>> lambda3 = (List<Integer> l) -> {
			Collections.sort(l);
		};

		Consumer<List<Integer>> lambda4 = new Consumer<List<Integer>>() {
			@Override
			public void accept(List<Integer> l) {
				Collections.sort(l);
			}
		};

		String str = "abc";
		Predicate<String> methodRef2 = str::startsWith;
		Predicate<String> lambda5 = s -> str.startsWith(s);
		
		BiFunction<String,String,Boolean> lambda6 = (s,s2) -> {
			return str.startsWith(s);
		};
	}
}

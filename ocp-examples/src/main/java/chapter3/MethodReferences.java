package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
		
		
		Supplier<ArrayList> methodRef4 = ArrayList::new;
		Supplier<ArrayList> lambda7 = () -> new ArrayList();
		
		
		
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Sam", null);
		favorites.merge("Tom", "Skyride", mapper);
		favorites.merge("Sam", "Skyride", mapper);
		System.out.println(favorites); // {Tom=Skyride, Sam=Skyride}
		
		
		
		
		
	}
}

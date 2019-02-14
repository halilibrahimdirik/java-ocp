package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // empty list

		list.add("Fluffy");// [Fluffy]
		list.add("Webby"); // [Fluffy, Webby]

		String[] array = new String[list.size()]; // empty array
		array[0] = list.get(1); // [Webby]
		array[1] = list.get(0); // [Webby, Fluffy]
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "-");

		
	}

}

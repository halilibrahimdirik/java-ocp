package chapter3;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList2 {

	public static void main(String[] args) {

		String[] arrayT = { "gerbil", "mouse" }; // [gerbil, mouse]
		List<String> listT = Arrays.asList(arrayT); // returns fixed size list

//		listT.add("dene");//Exception in thread "main" java.lang.UnsupportedOperationException
		listT.remove(1);//Exception in thread "main" java.lang.UnsupportedOperationException
		
	}

}

package chapter3;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		
		//List<int> list = new ArrayList<int>();
		//An ArrayList cannot contain primitives. 
		
		int[] array = new int[2];

		String[] arrayT = { "gerbil", "mouse" }; // [gerbil, mouse]
		List<String> listT = Arrays.asList(arrayT); // returns fixed size list

		for (int i = 0; i < arrayT.length; i++)
			System.out.print(arrayT[i] + "-");
		
		System.out.println("**********************");

		for (int i = 0; i < listT.size(); i++)
			System.out.print(listT.get(i) + "-");
		
		System.out.println("**********************");

		listT.set(1, "test"); // [gerbil, test]
		arrayT[0] = "new"; // [new, test]
		
		//String[] array2 = (String[]) listT.toArray(); // [new, test]
		// java.lang.ClassCastException: java.base/[Ljava.lang.Object; 
		//cannot be cast to java.base/[Ljava.lang.String;
		
		String[] y = listT.toArray(new String[0]);
		
		for (int i = 0; i < y.length; i++)
			System.out.print(y[i] + "-");
		
		System.out.println("**********************");

		for (int i = 0; i < arrayT.length; i++)
			System.out.print(arrayT[i] + "-");
		
		System.out.println("**********************");

		for (int i = 0; i < listT.size(); i++)
			System.out.print(listT.get(i) + "-");
		
		System.out.println("**********************");
//		listT.remove(1);// throws UnsupportedOperationException
	}

}

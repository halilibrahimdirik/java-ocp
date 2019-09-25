package chapter3;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {

		//1)An ArrayList cannot contain primitives.
		//TODO-Uncomment List<int> list = new ArrayList<int>();

		int[] array = new int[2];
		
		//2) Changes are reflected in both, since they are backed by the same data.

		String[] arrayT = { "gerbil", "mouse" }; // [gerbil, mouse]
		List<String> listT = Arrays.asList(arrayT); // returns fixed size list

		System.out.println("Array Values:");
		for (int i = 0; i < arrayT.length; i++)
			System.out.print(arrayT[i] + "-");

		System.out.println("");
		System.out.println("**********************");

		System.out.println("List Values:");
		for (int i = 0; i < listT.size(); i++)
			System.out.print(listT.get(i) + "-");

		System.out.println("");
		System.out.println("**********************");

		listT.set(1, "test"); // [gerbil, test]
		arrayT[0] = "new"; // [new, test]


		System.out.println("Array Values Modified:");
		for (int i = 0; i < arrayT.length; i++)
			System.out.print(arrayT[i] + "-");
		System.out.println("");
		System.out.println("**********************");

		System.out.println("List Values Modified:");
		for (int i = 0; i < listT.size(); i++)
			System.out.print(listT.get(i) + "-");
		System.out.println("**********************");

		//3)Finally, line 9 shows that list is not resizable because it is backed by the underlying
        //array.
		//TODO-Uncomment listT.remove(1);// throws UnsupportedOperationException
		
		
		// String[] array2 = (String[]) listT.toArray(); // [new, test]
				// java.lang.ClassCastException: java.base/[Ljava.lang.Object;
				// cannot be cast to java.base/[Ljava.lang.String;

		System.out.println("List To Array Values:");
		String[] y = listT.toArray(new String[0]);

		for (int i = 0; i < y.length; i++)
			System.out.print(y[i] + "-");
		System.out.println("");
		System.out.println("**********************");

	}

}

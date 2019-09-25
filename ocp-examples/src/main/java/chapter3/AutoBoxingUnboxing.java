package chapter3;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		// creating an Integer Object
		// with value 10.
		Integer i = new Integer(10);

		// unboxing the Object
		int i1 = i;

		System.out.println("Value of i: " + i);
		System.out.println("Value of i1: " + i1);

		// Autoboxing of char
		Character gfg = 'a';

		// Auto-unboxing of Character
		char ch = gfg;
		System.out.println("Value of ch: " + ch);
		System.out.println("Value of gfg: " + gfg);

		/*
		 * Here we are creating a list of elements of Integer type. adding the int
		 * primitives type values
		 */
		List<Integer> list = new ArrayList<Integer>();
		for (int t = 0; t < 10; t++)
			list.add(t);
		
		
		/* Here we are creating a list of elements 
        of Integer type. Adding the int primitives 
        type values by converting them into Integer 
        wrapper Object*/
      List<Integer> list1 = new ArrayList<Integer>(); 
      for (int z = 0; z < 10; z++) 
    	  list1.add(Integer.valueOf(z)); 

	}
}

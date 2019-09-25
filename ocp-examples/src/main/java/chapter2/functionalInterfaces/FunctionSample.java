package chapter2.functionalInterfaces;

import java.util.function.Function;

public class FunctionSample {
	public static void main(String args[]) {

		int x = 1;
		int y = x / 2;
		double z = x / 2;
		Double dz = x / 2.0;
		double t = 1 / 2;

		// Function which takes in a number
		// and returns half of it
		Function<Integer, Double> half = a -> a / 2.0;

		// apply the function to get the result
		System.out.println(half.apply(10));
		
		
		 // Now treble the output of half function 
        half = half.andThen(a -> 3 * a); 
  
     // However treble the value given to half function 
        half = half.compose(a -> 3 * a); 
        
        
        // apply the function to get the result 
        System.out.println(half.apply(10)); 
        
        try { 
        	  
            // try to pass null as parameter 
            half = half.andThen(null); 
        } 
        catch (Exception e) { 
            System.out.println("Exception thrown "
                               + "while passing null: " + e); 
        } 
	}
}

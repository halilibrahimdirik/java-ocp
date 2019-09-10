package chapter1.overloading;

//Java program  to illustrate method  
//overloading for widening 
//and autoboxing together 
public class Conversion3 {

	// overloaded method with reference type formal argument
	public void method(Integer a) {

		System.out.println("Primitive type byte formal argument :" + a);
	}

}

class GFG3 {

	public static void main(String[] args) {

		Conversion3 c = new Conversion3();

		// invoking the method
		// FIXME byte val = 5;The method method(Integer) in the type Conversion3 is not applicable for the arguments (byte)
		int val = 5;
		c.method(val);
	}
}

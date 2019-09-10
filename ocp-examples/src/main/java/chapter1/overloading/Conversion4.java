package chapter1.overloading;

//Java program to illustrate 
//autoboxing followed by  
//widening in reference type 
//variables 
public class Conversion4 {

	// overloaded method with reference type
	// formal argument
	public void method(Byte b) {

		// Object b is typecasted to Byte and then printed
		Byte bt = (Byte) b;
		System.out.println("reference type formal argument :" + bt);
	}

}

class GFG4 {

	public static void main(String[] args) {

		Conversion4 c = new Conversion4();

		byte val = 5;

		// b is first widened to Byte
		// and then Byte is passed to Object.
		c.method(val);
	}
}

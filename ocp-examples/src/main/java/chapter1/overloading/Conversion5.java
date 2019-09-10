package chapter1.overloading;

//Java program to illustrate 
//method overloading for var-args 
//and widening concept together 
public class Conversion5 {
	// overloaded method primitive(byte) var-args formal argument
	public void method(byte... a) {
		System.out.println("Primitive type byte formal argument :" + a);
	}

	// overloaded method primitive(int) formal arguments
	public void method(long a, long b) {
		System.out.println("Widening type long formal argument :" + a);
	}
}

class GFG5 {

	public static void main(String[] args) {
		Conversion5 c = new Conversion5();

		// invokes the method having widening
		// primitive type parameters.
		byte val = 5;
		c.method(val, val);
	}
}

package chapter1.overloading;

//Java program to illustrate method  
//overloading  
//in case of widening 
//https://www.geeksforgeeks.org/method-overloading-autoboxing-widening-java/
public class Conversion2 {
	// overloaded method
	public void method(int i) {
		System.out.println("Primitive type int formal argument :" + i);
	}

	// overloaded method primitive formal argument
	// and to be invoked for wrapper Object as

	public void method(float i) {

		System.out.println("Primitive type float formal argument :" + i);
	}
}

class GFG2 {

	public static void main(String[] args) {

		Conversion2 c = new Conversion2();

		// invoking the method with signature
		// has widened data type
		c.method(10);
		c.method(new Long(100));
	}

}

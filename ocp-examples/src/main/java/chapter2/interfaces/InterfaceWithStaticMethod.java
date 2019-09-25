package chapter2.interfaces;

interface InterfaceWithStaticMethod {
	final int a = 10;

	static void display() {
		System.out.println("hello");
	}
}

//A class that implements interface. 
class SampleClass implements InterfaceWithStaticMethod 
{ 
 // Driver Code 
 public static void main (String[] args) 
 { 
	 InterfaceWithStaticMethod.display(); 
 } 
} 

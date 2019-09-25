package chapter2.interfaces;

public interface DefaultSample {
	// An example to show that interfaces can
	// have methods from JDK 1.8 onwards
	final int a = 10;

	default void display() {
		System.out.println("hello");
	}

	void displayAbstract();
}

// A class that implements interface.
class testClass implements DefaultSample {
	// Driver Code
	public static void main(String[] args) {
		testClass t = new testClass();
		t.display();
	}

	@Override
	public void displayAbstract() {
		// TODO Auto-generated method stub
	}
}

package chapter6;

public class Assertions {

	public static void main(String[] args) {
		int numGuests = -5;
		assert (numGuests < 0) : "OhNo";
//		assert numGuests > 0;
		System.out.println(numGuests);
	}
	
	private int addPlusOne(int a, int b) {
		 boolean assert1 = false;
		 assert a++ > 0;
		 assert b > 0;
		 return a + b;
		 }
}

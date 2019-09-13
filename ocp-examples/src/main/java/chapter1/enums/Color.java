package chapter1.enums;

public enum Color {
	RED, GREEN, BLUE;

	// Driver method
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println(c1);

		// Calling values()
		Color arr[] = Color.values();

		// enum with loop
		for (Color col : arr) {
			// Calling ordinal() to find index
			// of color.
			System.out.println(col + " at index " + col.ordinal());
		}

		// Using valueOf(). Returns an object of
		// Color with given constant.
		// Uncommenting second line causes exception
		// IllegalArgumentException
		System.out.println(Color.valueOf("RED"));
		System.out.println(Color.valueOf("WHITE"));
	}

}

package chapter1.enums;

public enum ColorWithConstructor {
	RED, GREEN, BLUE;

	// enum constructor called separately for each
	// constant
	private ColorWithConstructor() {
		System.out.println("Constructor called for : " + this.toString());
	}

	// Only concrete (not abstract) methods allowed
	public void colorInfo() {
		System.out.println("Universal Color");
	}

	public static void main(String[] args) {
		ColorWithConstructor c1 = ColorWithConstructor.RED;
		System.out.println(c1);
		c1.colorInfo();
	}
}

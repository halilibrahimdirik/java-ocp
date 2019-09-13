package chapter1.enums.blog.scottlogic;

public enum Singleton {
	/*
	 * Enums are great as Singletons Using Enums in Java it is very easy to
	 * implement a lazy loading Singleton:
	 */
	INSTANCE;
	private Singleton() {
		// This is called the first time this enum is initialised
		System.out.println("I am initialised");
	}

	public static void main(String[] args) {
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
	}
}

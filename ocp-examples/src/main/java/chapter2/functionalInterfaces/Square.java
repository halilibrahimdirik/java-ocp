package chapter2.functionalInterfaces;

@FunctionalInterface
interface Square {
	int calculate(int x);
}

@FunctionalInterface
interface SquareInteger {
	Integer calculate(Integer x);

	//A functional interface has only one abstract method but it can have multiple default methods.
	default void defaultSample() {
		System.out.println("default sample");
	}
}

class Test {
	public static void main(String args[]) {
		int a = 5;

		// lambda expression to define the calculate method
		Square s1 = (int x) -> x * x;

		Square s2 = x -> x * x;

		Square s3 = x -> {
			return x * x;
		};

		SquareInteger s4 = (Integer x) -> x * x;

		SquareInteger s5 = x -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s5.calculate(a);

		Integer integer = new Integer(1);
		s1.calculate(integer);

		int int1 = 1;
		s4.calculate(int1);

		byte byte1 = 2;
		// TODO Uncomment s4.calculate(byte1);

		System.out.println(ans);
	}
}
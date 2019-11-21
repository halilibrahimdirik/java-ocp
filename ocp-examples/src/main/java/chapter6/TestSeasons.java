package chapter6;

public class TestSeasons {
	public static void test(Seasons s) {
		switch (s) {
		case SPRING:
		case FALL:
			System.out.println("Shorter hours");
			break;
		case SUMMER:
			System.out.println("Longer hours");
			break;
		default:
			assert false : "Invalid season";
		}
	}
}

enum Seasons {
	SPRING, SUMMER, FALL
}

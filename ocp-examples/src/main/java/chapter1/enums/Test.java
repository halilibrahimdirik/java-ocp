package chapter1.enums;

//A simple enum example where enum is declared 
//outside any class (Note enum keyword instead of 
//class keyword) 
enum ColorTest {
	RED, GREEN, BLUE;
}

public class Test {

	Day day;

	// Constructor
	public Test(Day day) {
		this.day = day;
	}

	// Prints a line about Day using switch
	public void dayIsLike() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	// Driver method
	public static void main(String[] args) {
		ColorTest c1 = ColorTest.RED;
		System.out.println(c1);

		String str = "MONDAY";
		Test t1 = new Test(Day.valueOf(str));
		t1.dayIsLike();
	}

	enum ColorInner {
		RED, GREEN, BLUE;
	}

	/*
	 * internally above enum Color is converted to class Color { public static final
	 * Color RED = new Color(); public static final Color BLUE = new Color(); public
	 * static final Color GREEN = new Color(); }
	 */

	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}
}

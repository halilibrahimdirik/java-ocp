package chapter1.innerClasses;

public class TestEffectivelyFinal {

	public void isItFinal() {

		// Which of the variables do you think are effectively final in this code?

		int one = 20;

		int two = one;
		two++;
		int three;
		if (one == 4)
			three = 3;
		else
			three = 4;
		int four = 4;
		class Inner {
		}
		four = 5;

		// effectively final --> one , three 
	}

}

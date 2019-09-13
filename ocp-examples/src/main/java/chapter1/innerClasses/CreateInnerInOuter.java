package chapter1.innerClasses;

import chapter1.innerClasses.Outer.Inner;

public class CreateInnerInOuter {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner(); // create the inner class
		inner.go();
	}
}

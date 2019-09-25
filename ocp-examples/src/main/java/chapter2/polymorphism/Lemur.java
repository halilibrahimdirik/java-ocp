package chapter2.polymorphism;

public class Lemur extends Primate implements HasTail {
	public int age = 10;

	public boolean isTailStriped() {
		return false;
	}

	@Override
	public boolean hasHair() {
		return false;
	}

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		System.out.println(primate.age);
		System.out.println(lemur.hasHair());
	}
}

class Primate {
	
	public int age = 9;
	
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	boolean isTailStriped();
}

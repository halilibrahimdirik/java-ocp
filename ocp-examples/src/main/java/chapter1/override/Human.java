package chapter1.override;

public class Human extends Mammal {
	@Override
	public String speak() {
		return "Hello";
	}

	public static void main(String[] args) {

		Mammal mammal = new Cat();
		System.out.println(mammal.speak());
	}

}

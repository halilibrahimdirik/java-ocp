package chapter1.innerClasses;

public class OuterForLocalInner {
	private int length = 5;

	public void calculate() {
		final int widthEffectivelyFinal = 20;

		int widthNotEffectivelyFinal = 20;

		widthNotEffectivelyFinal = widthNotEffectivelyFinal + 1;

		class Inner {
			public void multiply() {

				// They have access to all fields and methods of the enclosing class.
				System.out.println(length * widthEffectivelyFinal);
				calculateOuter();

				// They do not have access to local variables of a method unless those variables
				// are final
				// or effectively final. More on this shortly.
				//TODO Uncomment To See Error
				//System.out.println(length * widthNotEffectivelyFinal);
				//Error:Local variable widthNotEffectivelyFinal defined in an enclosing scope must be final or effectively final
			}
		}

		Inner inner = new Inner();
		inner.multiply();
	}

	public void calculateOuter() {
		System.out.println("calculateOuter");
	}

	public static void main(String[] args) {
		OuterForLocalInner outer = new OuterForLocalInner();
		outer.calculate();
	}
}

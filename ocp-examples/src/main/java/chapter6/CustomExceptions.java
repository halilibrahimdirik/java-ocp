package chapter6;

@SuppressWarnings("serial")
public class CustomExceptions {

	class CannotSwimException extends Exception {
	}

	class DangerInTheWater extends RuntimeException {
	}

	class SharkInTheWaterException extends DangerInTheWater {
	}

	class Dolphin {
		public void swim() throws CannotSwimException {
			// logic here
		}
	}

	public class ExceptionWithConstructor extends Exception {
		public ExceptionWithConstructor() {
			// super();
		}

		public ExceptionWithConstructor(Exception e) {
			super(e);
		}

		public ExceptionWithConstructor(String message) {
			// super(message);
		}
	}

}

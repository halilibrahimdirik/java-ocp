package chapter7;

public class RunnableIntro {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("");
			}
		};
		runnable.run();

		Runnable runnable1 = () -> {
			System.out.println("");
		};
		Thread thread = new Thread(runnable1);
		thread.start();

	}

}

class Emulator implements Runnable {

	@Override
	public void run() {

	}
}

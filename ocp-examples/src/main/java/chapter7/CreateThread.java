package chapter7;

public class CreateThread {

	public static void main(String[] args) {

		System.out.println("begin");
		(new ReadInventoryThread()).start();

		// 1)Provide a Runnable object or lambda expression to the Thread constructor.
		(new Thread(new PrintData())).start();

		// 2)Create a class that extends Thread and overrides the run() method.
		(new ReadInventoryThread()).start();
		System.out.println("end");
	}
}

class PrintData implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println("Printing record: " + i);

	}
}

class ReadInventoryThread extends Thread {
	public void run() {
		System.out.println("Printing zoo inventory");
	}
}

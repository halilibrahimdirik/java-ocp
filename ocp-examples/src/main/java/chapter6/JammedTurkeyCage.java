package chapter6;

public class JammedTurkeyCage implements AutoCloseable {
	public void close() throws IllegalStateException {
		System.out.println("put turkeys in2");
		throw new IllegalArgumentException("Cage door does not close2");
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage();JammedTurkeyCage t2 = new JammedTurkeyCage()) {
			System.out.println("put turkeys in1");
			throw new IllegalStateException("Cage door does not close1");
		} catch (IllegalStateException e) {
			System.out.println("caugh message: " + e.getMessage());
			for (Throwable t : e.getSuppressed())
				System.out.println("caught suppressed: " + t.getMessage());

		}
	}
}

package chapter6;

import java.io.IOException;

public class JammedTurkeyCage implements AutoCloseable {
	public JammedTurkeyCage(String pp) {
		prm=pp;
	}
	String prm="";
	public void close() throws IllegalStateException {
		System.out.println("put turkeys in close"+prm);
		throw new IllegalArgumentException("Cage door does not close2"+prm);
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage("f1");JammedTurkeyCage t2 = new JammedTurkeyCage("f2")) {
			System.out.println("put turkeys in1");
			throw new IllegalStateException("Cage door does not close1");
		} catch (IllegalArgumentException e) {
			System.out.println("caugh message: " + e.getMessage());
			for (Throwable t : e.getSuppressed())
				System.out.println("caught suppressed: " + t.getMessage());

		}
	}
}

package chapter6;

public class StuckTurkeyCage implements AutoCloseable {
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}

	public static void main(String[] args) {
		try (StuckTurkeyCage t = new StuckTurkeyCage()) { // DOES NOT COMPILE
			System.out.println("put turkeys in");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

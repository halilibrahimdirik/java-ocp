package chapter6;

import java.io.IOException;

public class StuckTurkeyCageQ implements AutoCloseable {
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}

	public static void main(String[] args)   {
		try (StuckTurkeyCageQ stuckTurkeyCageQ = new StuckTurkeyCageQ()) {
			System.out.println("put turkeys in");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
}

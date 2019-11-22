package chapter6;

import java.io.*;

public class AutocloseableFlowQ {
	static class Door implements AutoCloseable {
		public void close() {
			System.out.print("D");
			throw new RuntimeException("door");
		}
	}

	static class Window implements Closeable {
		public void close() {
			System.out.print("W");
			throw new RuntimeException("win");
		}
	}

	public static void main(String[] args) {
		try (Window w = new Window(); Window w2 = new Window();Door d = new Door()) {
			System.out.print("T");
		} catch (Exception e) {
			System.out.print(e.getMessage());
			System.out.print(e.getSuppressed()[0].getMessage());
			System.out.print(e.getSuppressed()[1].getMessage());
			System.out.print("E");
		} finally {
			System.out.print("F");
		}
	}
}

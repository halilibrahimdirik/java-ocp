package chapter8;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamPrintWriter_8_10 {

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter("zoo.log");
		out.print(5); // PrintWriter method
		out.write(String.valueOf(5)); // Writer method
		out.print(2.0); // PrintWriter method
		out.write(String.valueOf(2.0)); // Writer method
		Animal animal = new Animal("Tommy Tiger", 5, 'T');
		out.print(animal); // PrintWriter method
		out.write(animal == null ? "null" : animal.toString()); // Writer method
		out.close();
	}

}

package chapter8;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console_8_11 {

	public static void main(String[] args) throws IOException {

//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String userInput = reader.readLine();
//		System.out.println("You entered the following: " + userInput);

		Console console = System.console();
		if (console != null) {
			String userInput = console.readLine();
			console.writer().println("You entered the following: " + userInput);
		}

	}

}

package chapter6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionCategories {

	public static void main(String[] args) {

		// 1)Checked Exception:re the exceptions that are checked at compile time. If
		// some code within a method throws a checked exception, then the method must
		// either handle the exception or it must specify the exception using throws
		// keyword.
		FileReader file;
		try {
			file = new FileReader("C:\\test\\a.txt");

			BufferedReader fileInput = new BufferedReader(file);

			// Print first 3 lines of file "C:\test\a.txt"
			for (int counter = 0; counter < 3; counter++)
				System.out.println(fileInput.readLine());

			fileInput.close();
		} catch (IOException | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

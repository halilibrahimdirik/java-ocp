package chapter6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;
import java.util.Scanner;

public class ReviewExceptions {
	public void doesNotCompile() { // METHOD DOES NOT COMPILE
		try {
			mightThrow();
		} catch (FileNotFoundException | IllegalStateException e) {
		} catch (InputMismatchException | MissingResourceException e) {
		} catch (SQLException | ArrayIndexOutOfBoundsException e) {
		} catch (IllegalArgumentException e) {
		} catch (Exception e) {
		}
	}

	private void mightThrow() throws DateTimeParseException, IOException, SQLException {
	}

	public void oldApproach(Path path1, Path path2) throws IOException {
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = Files.newBufferedReader(path1);
			out = Files.newBufferedWriter(path2);
			out.write(in.readLine());
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

	public void newApproach(Path path1, Path path2) {
		try (BufferedReader in = Files.newBufferedReader(path1); BufferedWriter out = Files.newBufferedWriter(path2)) {
			out.write(in.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (Scanner s = new Scanner(System.in)) {
			s.nextLine();
		} catch (Exception e) {
//			s.nextInt(); // DOES NOT COMPILE
		} finally {
//			s.nextInt(); // DOES NOT COMPILE
		}

	}
}

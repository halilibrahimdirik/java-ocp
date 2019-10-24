package chapter8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LowLevelHighLevelStream {
	public static void main(String[] args) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("zoo-data.txt"))) {
			System.out.println(bufferedReader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

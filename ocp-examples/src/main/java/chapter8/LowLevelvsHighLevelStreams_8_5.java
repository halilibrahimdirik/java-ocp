package chapter8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class LowLevelvsHighLevelStreams_8_5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream("zoo-data.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);

			FileOutputStream fileOutputStream = new FileOutputStream("zoo-data.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			FileOutputStream fos = new FileOutputStream("t.tmp");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeInt(12345);
			oos.writeObject("Today");
			oos.writeObject(new Date());
			oos.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			FileInputStream fileInputStream = new FileInputStream("zoo-data.txt");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			ObjectInputStream objectStream = new ObjectInputStream(bufferedInputStream);
			
			
			FileOutputStream fileOutputStream = new FileOutputStream("zoo-data.txt");
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
			
			int b;
			while((b = fileInputStream.read()) != -1) {
				fileOutputStream.write(b);
			}
			
			byte[] cs = new byte[100];
			int b1;
			while((b1 = fileInputStream.read(cs))  != -1) {
				fileOutputStream.write(b1);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("zoo-data.txt"))) {
			System.out.println(bufferedReader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (ObjectInputStream objectStream = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("zoo-data.txt")))) {
			System.out.println(objectStream.readObject());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileInputStream fileInputStream = new FileInputStream("zoo-data.txt");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

			FileReader fileReader = new FileReader("zoo-data.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

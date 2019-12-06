package chapter8;

import java.io.File;

public class CreatingAFileObject_8_2 {

	public static void main(String[] args) {

		// 1)
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator);

		// 2)
		File file = new File("/home/smith/data/zoo.txt");
		System.out.println(file.exists());

		File file1 = new File("/home/hidirik/Desktop/cron");
		System.out.println(file1.exists());

		// 3)
		File parent = new File("/home/hidirik");
		File child = new File(parent, "Desktop/cron");
		System.out.println(child.exists());

	}

}

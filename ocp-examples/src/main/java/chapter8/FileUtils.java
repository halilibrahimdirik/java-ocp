package chapter8;

import java.io.File;

public class FileUtils {

	public static void main(String[] args) {
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator);

		File file = new File("/deneme/smith/data/zoo.txt");
		System.out.println(file.exists());

		File parent = new File("/deneme/smith");
		File child = new File(parent, "data/zoo.txt");

		System.out.println("File Exists: " + file.exists());
		if (file.exists()) {
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Parent Path: " + file.getParent());
			if (file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("File LastModified: " + file.lastModified());
			} else {
				for (File subfile : file.listFiles()) {
					System.out.println("\t" + subfile.getName());
				}
			}
		}

	}
}

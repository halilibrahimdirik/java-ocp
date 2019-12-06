package chapter8;

import java.io.File;

public class WorkingWithAFileObject_8_3 {

	public static void main(String[] args) {
		File file1 = new File("/home/hidirik/Desktop/cron");
		File file2 = new File("/home/hidirik/Desktop/cron2");
		System.out.println(file1.exists());
		System.out.println(file1.getName());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getAbsoluteFile());
		System.out.println(file1.isDirectory());
		System.out.println(file1.isFile());
		System.out.println(file1.length());
		System.out.println(file1.lastModified());
		// TODO Uncomment System.out.println(file1.delete());
		// TODO Uncomment System.out.println(file1.renameTo(file2));
		// TODO Uncomment System.out.println(file1.mkdir());
		// TODO Uncomment System.out.println(file1.mkdirs());
		System.out.println(file1.getParent());
		File directory1 = new File("/home/hidirik/Desktop");
		File[] listFiles = directory1.listFiles();
		System.out.println(listFiles[0].getName());
		System.out.println(listFiles[1].getName());

		System.out.println("******************************");

		File file = new File("/home/hidirik/Desktop/cron");
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

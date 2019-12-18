package chapter9;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNormalize_9_3 {

	public static void printPathInformation(Path path) {
		System.out.println("Filename is: " + path.getFileName());
		System.out.println("Root is: " + path.getRoot());
		Path currentParent = path;
		while ((currentParent = currentParent.getParent()) != null) {
			System.out.println(" Current parent is: " + currentParent);
		}
	}

	public static void main(String[] args) {
		Path path = Paths.get("/init/../proc/./version");
		System.out.printf("'%s'.normalize(): %s%n", path, path.normalize());
		
		Path path1 = Paths.get("/proc/../../..");
		System.out.printf("'%s'.normalize(): %s%n", path1, path1.normalize());
		
		Path path2 = Paths.get("/proc/version/..");
		System.out.printf("'%s'.normalize(): %s%n", path2, path2.normalize());
		
		Path path3 = Paths.get("/proc/version/..");
		try {
			System.out.printf("'%s'.toRealPath(): %s%n", path3, path3.toRealPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String originalPath =
		        "/data/projects/project/../another";

		Path path11 = Paths.get(originalPath);
		System.out.println("path11 = " + path11);

		Path path22 = path11.normalize();
		System.out.println("path22 = " + path22);


	}

}

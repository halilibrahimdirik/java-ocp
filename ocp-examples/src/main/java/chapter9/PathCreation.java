package chapter9;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCreation {

	public static void main(String[] args) {
		FileSystem defaultFileSystem = FileSystems.getDefault();
		defaultFileSystem.getPath(".");

		Path path = Paths.get("/");

		File file1 = new File("/");
		Path path1 = file1.toPath();

		URI uri = path.toUri();
		File file2 = path.toFile();

		Path path2 = Paths.get(uri);

		Path path3 = Paths.get("pandas/cuddly.png");

		System.out.println(System.getProperty("path.separator"));

		Path path4 = Paths.get("c:\\zooinfo\\November\\employees.txt");
		System.out.println("path4:" + path4 + " is " + path4.isAbsolute());
		Path path5 = Paths.get("/home/zoodirector");
		System.out.println("path4:" + path4 + " is " + path5.isAbsolute());

		Path path6 = Paths.get("../eagle");
		System.out.println("path6:" + path6 + " is " + path6.isAbsolute());

		// create a Path using the Paths class using a vararg of type String
		Path path7 = Paths.get("/home", "zoodirector");
		System.out.println("path7:" + path7 + " is " + path7.isAbsolute());

		Path path8 = Paths.get("home", "zoodirector");
		System.out.println("path8:" + path8 + " is " + path8.isAbsolute());

		Path path9 = Paths.get("/", "home", "zoodirector");
		System.out.println("path9:" + path9 + " is " + path9.isAbsolute());

		Path path10 = Paths.get("pandas", "cuddly.png");
		System.out.println("path10:" + path10 + " is " + path10.isAbsolute());
		Path path11 = Paths.get("c:", "zooinfo", "November", "employees.txt");
		System.out.println("path11:" + path11 + " is " + path11.isAbsolute());
		Path path12 = Paths.get("/", "home", "zoodirector");
		System.out.println("path12:" + path12 + " is " + path12.isAbsolute());

		try {

			// Throws Exception
			// Path path13 = Paths.get(new URI("file://pandas/cuddly.png"));// THROWS
			// EXCEPTION AT RUNTIME
			// Exception in thread "main" java.lang.IllegalArgumentException: URI has an
			// authority component

			URI uri2 = new URI("file:///c:/zoo-info/November/employees.txt");
			Path path14 = Paths.get(uri2);
			Path path15 = Paths.get(new URI("file:///home/zoodirectory"));
			System.out.println("path15 to uri" + path15.toUri());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Path pathd = Paths.get("/mammal/carnivore/raccoon.image");
		System.out.println("Path is: " + pathd);
		System.out.println("Subpath from 0 to 3 is: " + pathd.subpath(0, 3));
		System.out.println("Subpath from 1 to 3 is: " + pathd.subpath(1, 3));
		System.out.println("Subpath from 1 to 2 is: " + pathd.subpath(1, 2));

		//System.out.println("Subpath from 0 to 4 is: " + pathd.subpath(0, 4)); // THROWS:Exception in thread "main"
																				// java.lang.IllegalArgumentException
		// EXCEPTION AT RUNTIME
		//System.out.println("Subpath from 1 to 1 is: " + pathd.subpath(1, 1)); // THROWS:Exception in thread "main"
																				// java.lang.IllegalArgumentException
		// EXCEPTION AT RUNTIME
		
		Path path21 = Paths.get("fish.txt");
		Path path22 = Paths.get("birds.txt");
		System.out.println(path21.relativize(path22));
		System.out.println(path22.relativize(path21));
		
		
		Path path23 = Paths.get("E:\\habitat");
		Path path24 = Paths.get("E:\\sanctuary\\raven");
		System.out.println(path23.relativize(path24));
		System.out.println(path24.relativize(path23));
		
		Path path31 = Paths.get("/primate/chimpanzee");
		Path path32 = Paths.get("bananas.txt");
//		path31.relativize(path32); // THROWS EXCEPTION AT RUNTIME
		
		
		final Path path41 = Paths.get("/cats/../panther");
		final Path path42 = Paths.get("food");
		System.out.println(path41.resolve(path42));
		
		final Path path51 = Paths.get("/turkey/food");
		final Path path52 = Paths.get("/tiger/cage");
		System.out.println(path51.resolve(path52));
		
		final Path path61 = Paths.get("/turkey/food");
		final Path path62 = Paths.get("food/cage");
		System.out.println(path61.resolve(path62));
		
		final Path path71 = Paths.get("../");
		System.out.println(path71);
		
		

	}
}

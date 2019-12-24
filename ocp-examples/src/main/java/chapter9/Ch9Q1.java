package chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Ch9Q1 {

	public static void main(String[] args) {
		Path path1 = Paths.get("/user/.././root", "../kodiacbear.txt");
		System.out.println(path1);

		Path normalize = path1.normalize();
		System.out.println(normalize);

		Path path2 = Paths.get("/lion");
		Path relativize = normalize.relativize(path2);
		System.out.println(relativize);

		Path path3 = Paths.get("/tiger1/hh1/tiger2");
		Path path4 = Paths.get("/tiger5/hh2/tiger3");
		Path resolve2 = path3.resolve(path4);
		System.out.println("resolve2:" + resolve2);
		Path relativize2 = path3.relativize(path4);
		System.out.println("relativize2:" + relativize2);
		
		Path path31 = Paths.get("E:\\data");
		Path path41 = Paths.get("E:\\user\\home");
		Path relativePath1 = path31.relativize(path41);
		System.out.println(path31.resolve(relativePath1));

	}

}

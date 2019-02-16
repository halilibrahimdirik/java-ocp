package chapter3;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {

	static void printNames(List list) {
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i); // class cast exception here
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add(new StringBuilder("Webby"));
		printNames(names);
	 }
	

}

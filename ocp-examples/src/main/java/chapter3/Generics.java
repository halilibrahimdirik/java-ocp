package chapter3;

import java.util.ArrayList;
import java.util.List;

import chapter1.accessModifers.mouse.Mouse;

public class Generics {

	// This is legal because a non-generic list can contain anything
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

class CrateGeneric<T> {
	private T contents;

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}
	
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		Crate<Mouse> crate = new Crate<>();
		crate.packCrate(mouse);
		Mouse inNewHome = crate.emptyCrate();
	}
}

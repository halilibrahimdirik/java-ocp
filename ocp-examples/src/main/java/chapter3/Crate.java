package chapter3;

import java.util.ArrayList;

import chapter1.accessModifiers.cat.BigCat;

public class Crate<T> {

	private T contents;

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}


	public static void main(String[] args) {
		BigCat bigCat = new BigCat();
		Crate<BigCat> genericsSample = new Crate<>();
		genericsSample.packCrate(bigCat);
		BigCat inNewHome = genericsSample.emptyCrate();
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.addAll(null);
	}

}

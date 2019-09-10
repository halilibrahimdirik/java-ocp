package chapter1.cat.species;

import chapter1.cat.BigCat;

public class Lynx extends BigCat {

	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		// System.out.println(cat.hasFur);
		// System.out.println(cat.hasPaws);
		// System.out.println(cat.id);

		Lynx lynx = new Lynx();
		System.out.println(lynx.name);
		System.out.println(lynx.hasFur);

		// FIXME Compiler Error:The field BigCat.hasPaws is not visible
		// System.out.println(lynx.hasPaws);

		// FIXME Compiler Error:The field BigCat.id is not visible
		// System.out.println(lynx.id);
	}
}

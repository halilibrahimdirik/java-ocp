package chapter1.accessModifiers.cat;

public class Tiger extends BigCat {

	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		// System.out.println(cat.id);

		Tiger lynx = new Tiger();
		System.out.println(lynx.name);
		System.out.println(lynx.hasFur);
		System.out.println(lynx.hasPaws);

		// FIXME Compiler Error:The field BigCat.id is not visible
		// System.out.println(lynx.id);
	}
}

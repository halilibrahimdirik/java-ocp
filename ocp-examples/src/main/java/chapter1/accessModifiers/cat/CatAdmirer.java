package chapter1.accessModifiers.cat;

public class CatAdmirer {

	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		
		//FIXME Compiler Error:The field BigCat.id is not visible
		//System.out.println(cat.id); 
		
	}
}

package chapter3;

import java.util.ArrayList;
import java.util.List;

public class RawTypes<E> {
	E[] mt12;
	String string=new String();
	class Inner {
	}

	static class Nested {
	}

	public static void main(String[] args) {
		RawTypes mt; // warning: MyType is a raw type
		RawTypes.Inner inn; // warning: MyType.Inner is a raw type

		RawTypes.Nested nest; // no warning: not parameterized type
		RawTypes<Object> mt1; // no warning: type parameter given
		RawTypes<?> mt2; // no warning: type parameter given (wildcard OK!)
		
		
		List names = new ArrayList(); // warning: raw type!
		names.add("John");
		names.add("Mary");
		names.add(Boolean.FALSE); // not a compilation error!
		
		
	}
}

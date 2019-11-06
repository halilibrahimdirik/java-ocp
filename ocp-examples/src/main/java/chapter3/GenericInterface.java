package chapter3;

import chapter1.accessModifiers.cat.BigCat;

public interface GenericInterface<T> {

	void ship(T t);

}

class ShippableRobotCrate implements GenericInterface<BigCat> {
	public void ship(BigCat t) {
	}
}

class ShippableAbstractCrate<U> implements GenericInterface<U> {
	public void ship(U t) {
	}
}

class ShippableCrate implements GenericInterface {
	public void ship(Object t) {
	}
}
package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person {
	int empid;
	String name;

	Person(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	public String toString() {
		return "id" + this.empid + "name" + this.name;
	}

	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if (p.empid == this.empid && p.name.equals(this.name)) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return this.empid + this.name.hashCode();
	}
}

public class CollectionFilter {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(101, "aaa"));
		list.add(new Person(200, "bbbb"));
		list.add(new Person(150, "ccccc"));
		list.add(new Person(250, "ddddd"));
		list.add(new Person(250, "ddddd"));

		converListToSet(list);
	}

	public static void converListToSet(List<Person> list) {
		Set<Person> set = list.stream().map(s -> s).collect(Collectors.toSet());
		set.forEach(person -> System.out.println(person));
	}
}

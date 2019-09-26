package chapter5;

public class ReviewingTheString {

	public static void main(String[] args) {

		// 1)String pool
		String s1 = "bunny";
		String s2 = "bunny";
		String s3 = new String("bunny");
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true

		// 2)concatenation = Java processes these operators from left to right.
		String s4 = "1" + 2 + 3;
		String s5 = 1 + 2 + "3";
		System.out.println(s4); // 123
		System.out.println(s5); // 33

		// 3)common String methods.

		String s = "abcde ";
		System.out.println(s.trim().length()); // 5
		System.out.println(s.charAt(4)); // e
		System.out.println(s.indexOf('e')); // 4
		System.out.println(s.indexOf("de")); // 3
		System.out.println(s.substring(2, 4).toUpperCase()); // CD
		System.out.println(s.replace('a', '1')); // 1bcde
		System.out.println(s.contains("DE")); // false
		System.out.println(s.startsWith("a")); // true

	}

}

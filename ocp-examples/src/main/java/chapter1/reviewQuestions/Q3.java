package chapter1.reviewQuestions;

public class Q3 {

	public static void main(String[] args) {

		String s1 = "Canada";
		String s2 = new String(s1);
		if (s1 == s2)
			System.out.println("s1 == s2");
		if (s1.equals(s2))
			System.out.println("s1.equals(s2)");
		
		
		String s3 = "Canada";
		String s4 = "Canada";
		if (s3 == s4)
			System.out.println("s3 == s4");
		if (s3.equals(s4))
			System.out.println("s3.equals(s4)");
		
		
		String s5 = new String(s1);
		String s6 = new String(s1);
		if (s5 == s6)
			System.out.println("s5 == s6");
		if (s5.equals(s6))
			System.out.println("s5.equals(s6)");
		
		String s7 = new String("Canada");
		String s8 = new String("Canada");
		if (s7 == s8)
			System.out.println("s7 == s8");
		if (s7.equals(s8))
			System.out.println("s7.equals(s8)");
		
	}
}

/*
 * What is the result of the following code? String s1 = "Canada"; String s2 =
 * new String(s1); if(s1 == s2) System.out.println("s1 == s2");
 * if(s1.equals(s2)) System.out.println("s1.equals(s2)"); A. There is no output.
 * B. s1 == s2 C. s1.equals(s2) D. Both B and C. E. The code does not compile.
 * F. The code throws a runtime exception
 * 
 * C. s1 points to the string pool. s2 points to an object on the heap, since it
 * is created at runtime. == checks for reference equality. These are different
 * references, making B incorrect. String overrides equals() so the actual
 * values are the same, making C correct. And yes, this question could have
 * appeared on the OCA. Remember that the OCP is cumulative. A question may
 * appear to be about one thing and actually be about a simpler concept.
 */

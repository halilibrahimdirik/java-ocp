package chapter1.reviewQuestions;

public class AnswersCh1 {
	
 	//1) B --> f ->A
	//2) A
	//3) C
	//4) C
    //5) A,D
	//6) B
	//7) E
	//8) B
	//9) B
	//10)C
	//11)B,C -->f --> D
	//12)E
	//13)F -->f --> B
	//14)F -->f --> E
	//15)B,C,D,E -->f --> B,E
	//16)A,C -->f --> E
	//17)B -->f --> B,C
	//18)
	//19)G
	//20)C
	//21)A,C,E,F
	
	
	/*Chapter 1: Advanced Class Design
	1. A. Based on the equals() method in the code, objects are equal if they have the same
	employeeId. The hashCode() method correctly overrides the one from Object. The
	equals() method is an overload of the one from Object and not an override. It would be
	better to pass Object since an override would be better to use here. It is odd to override
	hashCode() and not equals().
	2. A. hashCode() is correct and perfectly reasonable given that equals() also checks that
	field. ClassCastException is a runtime exception and therefore does not need to be handled or declared. The override in equals() is correct. It is common for equals() to refer
	to a private instance variable. This is legal because it is within the same class, even if it is
	referring to a different object of the same class.
	3. C. s1 points to the string pool. s2 points to an object on the heap, since it is created
	at runtime. == checks for reference equality. These are different references, making
	B incorrect. String overrides equals() so the actual values are the same, making C
	correct. And yes, this question could have appeared on the OCA. Remember that the
	OCP is cumulative. A question may appear to be about one thing and actually be about a
	simpler concept.
	4. C. The equals() method is correct. You are allowed to use any business logic that you
	want in determining equality. The hashCode() method is not correct. It violates the rule
	that two objects that return true for equals() must return the same hashCode(). It is also
	a bad idea for the hash code to contain values that could change.
	5. A, D. The relevant rule is that two objects that return true for equals() objects must
	return the same hash code. Therefore A is correct and B is incorrect. Two objects with the
	same hash code may or may not be equal. This makes C incorrect and D correct. The fact
	that two objects are not equal does not guarantee or preclude them from sharing a hash
	code. Remember that hashCode() tells you which bucket to look in and equals() tells you
	whether you have found an exact match.
	6. B. The ordinal() method of an enum returns its corresponding int value. Like arrays,
	enums are zero based. Remember that the index of an enum may change when you recompile
	the code and should not be used for comparison.
	7. E. A case statement on an enum data type must be the unqualified name of an enumeration
	constant. For example, case VANILLA would be valid. You cannot use the ordinal equivalents. Therefore, the code does not compile.
	8. C. Inner is a member inner class. Inner classes are not allowed to contain static methods
	or static variables. Only nested static classes are permitted to contain statics.
	9. B. Outer.this.x is the correct way to refer to x in the Outer class. In Java 7, the answer
	would have been D because you used to have to declare variables as final to use them in a
	local inner class. In Java 8, this requirement was dropped and the variables only need to be
	effectively final, which means that the code would still compile if final were added.
	Chapter 1: Advanced Class Design 549
	10. C. The code compiles fine. A member inner class is allowed to be private, and it is
	allowed to refer to instance variables from the outer class. Two .class files are generated.
	Book.class matches the name of the outer class. The inner class does not compile
	to BookReader.class. That would introduce the possibility of a naming conflict.
	Book$BookReader.class is correct because it shows the scope of the class is limited to
	Book. You don’t need to know that $ is the syntax, but you do need to know the number of
	classes and that BookReader is not a top-level class.
	11. D. FootballGame is trying to refer to a static variable in another class. It needs a static
	import to do so. The correct syntax is import static and not static import. B is incorrect
	because * does not import classes in a package. C is incorrect because it does not refer to a
	static member.
	12. E. The main method tries to cast a Firefox instance to IE. Since IE is not a subclass of
	Firefox, this throws a ClassCastException.
	13. B. c is an instance of Chipmunk. It is an instance of any superclasses or interfaces it implements. In this case, those are Furry, Mammal, and Object. null is not an instance of any
	type. Therefore, the first two if statements execute and result is 3.
	14. E. Code involving instanceof does not compile when there is no way for it to evaluate
	true. D not only compiles but it is always true. E does not compile because ArrayList is
	a concrete class that does not extend Chipmunk. F does compile because Runnable is an
	interface. In theory, someone could subclass Chipmunk and have the subclass implement
	Runnable.
	15. B, E. equals() should return false when the object it passed in is not equal to the current object. This includes null and incorrect types. An equals() method should have a
	null check and an instanceof check.
	16. E. This is a member inner class. It needs to be created using an instance of the outer class.
	The syntax looks weird, but it creates an object of the outer class and then an object of the
	inner class from it.
	17. B, C. Enums are required to have a semicolon after the list of values if there is anything else
	in the enum. Don’t worry; you won’t be expected to track down missing semicolons on the
	whole exam—only on enum questions. Enums are not allowed to have a public constructor.
	18. G. This question appears to be about enums but is really about abstract methods. Just as
	an abstract superclass requires concrete subclasses to have an implementation, abstract
	enum methods require each enum type to implement the method.
	19. A, C. An override must have the same method signature. A and C both do. F is an overload
	because it has a different parameter list. E does not compile because it throws a checked
	exception not declared in the superclass. D compiles but is not an override because it is
	static. B has a different method name, so it is not even an overload.
	20. C. Both objects are BabyRhino objects. Virtual method invocation says that the subclass
	method gets called at runtime rather than the type in the variable reference. However, we
	550 Appendix A ■ Answers to Review Questions
	are not calling methods here. We are referring to instance variables. With instance variables, the reference type does matter.
	21. A, C, E. Remember that @Override means that we are implementing a method from a
	superclass or interface. The Object class declares methods with the signatures in Options A
	and C. Granted, it is a poor implementation of equals(), but it does compile. Option E is
	also correct because the method is declared in Otter. Option F is incorrect because methods from an interface are always public. Option B is incorrect because the parameter type
	does not match the one in Object. Option D is incorrect because the return type does not
	match the one in Object.
	*/
}

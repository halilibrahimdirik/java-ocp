package chapter2.bookSamples;

public class n1 {
/*
Additions in Java 8
Aside from using lambdas for the Comparator implementation, nothing in this chapter has
been unique to Java 8. This section is where that changes. Most of the changes in Java
8 revolve around streams, which we will cover in the next chapter. In this chapter, we
will also introduce method references to show how to make code more compact. Method
references and lambdas are core Java structures now, which means that you should
expect to see them in questions about other topics too. We will show you how to use the
new removeIf(), forEach(), merge(), computeIfPresent(), and computeIfAbsent()
methods.
Using Method References
Method references are a way to make the code shorter by reducing some of the code that
can be inferred and simply mentioning the name of the method. Like lambdas, it takes time
to get used to the new syntax.
Suppose that we have a Duck class with name and weight attributes along with this
helper class:
public class DuckHelper {
public static int compareByWeight(Duck d1, Duck d2) {
return d1.getWeight()—d2.getWeight();
}
public static int compareByName(Duck d1, Duck d2) {
return d1.getName().compareTo(d2.getName());
}
}
Additions in Java 8 153
Now think about how we would write a Comparator for it if we wanted to sort by
weight. Using lambdas, we’d have the following:
Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
Not bad. There’s a bit of redundancy, though. The lambda takes two parameters and
does nothing but pass those parameters to another method. Java 8 lets us remove that
redundancy and simply write this:
Comparator<Duck> byWeight = DuckHelper::compareByWeight;
The :: operator tells Java to pass the parameters automatically into compareByWeight.
DuckHelper::compareByWeight returns a functional interface and not an
int. Remember that :: is like lambdas, and it is typically used for deferred
execution.
There are four formats for method references:
■ Static methods
■ Instance methods on a particular instance
■ Instance methods on an instance to be determined at runtime
■ Constructors
In this chapter, we will be using three functional interfaces in our examples. We will use
more in the next chapter. Remember from Chapter 2 that Predicate is a functional interface that takes a single parameter of any type and returns a boolean. Another functional
interface is Consumer, which takes a single parameter of any type and has a void return
type. Finally, Supplier doesn’t take any parameters and returns any type.
Let’s look at some examples from the Java API. In each set, we show the lambda equivalent. Remember that none of these method references are actually called in the code that
follows. They are simply available to be called in the future. Let’s start with a static method:
14: Consumer<List<Integer>> methodRef1 = Collections::sort;
15: Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
On line 14, we call a method with one parameter, and Java knows that it should create a
lambda with one parameter and pass it to the method.
Wait a minute. We know that the sort method is overloaded. How does Java know that we
want to call the version that omits the comparator? With both lambdas and method references,
Java is inferring information from the context. In this case, we said that we were declaring a
Consumer, which takes only one parameter. Java looks for a method that matches that description.
Next up is calling an instance method on a specifi c instance:
16: String str = "abc";
17: Predicate<String> methodRef2 = str::startsWith;
18: Predicate<String> lambda2 = s -> str.startsWith(s);
154 Chapter 3 ■ Generics and Collections
Line 17 shows that we want to call string.startsWith() and pass a single parameter to
be supplied at runtime. This would be a nice way of filtering the data in a list. Next, we call
an instance method without knowing the instance in advance:
19: Predicate<String> methodRef3 = String::isEmpty;
20: Predicate<String> lambda3 = s -> s.isEmpty();
Line 19 says the method that we want to call is declared in String. It looks like a static
method, but it isn’t. Instead, Java knows that isEmpty is an instance method that does not
take any parameters. Java uses the parameter supplied at runtime as the instance on which
the method is called. Finally, we have a constructor reference:
21: Supplier<ArrayList> methodRef4 = ArrayList::new;
22: Supplier<ArrayList> lambda4 = () -> new ArrayList();
A constructor reference is a special type of method reference that uses new instead of a
method, and it creates a new object. It expands like the method references you have seen
so far. You’ll see method references again in the next chapter when we cover more types of
functional interfaces.
Removing Conditionally
Java 8 introduces a new method called removeIf. Before this, we had the ability to remove
a specified object from a collection or a specified index from a list. Now we can specify
what should be deleted using a block of code.
The method signature looks like this:
boolean removeIf(Predicate<? super E> filter)
It uses a Predicate, which is a lambda that takes one parameter and returns a boolean.
Since lambdas use deferred execution, this allows specifying logic to run when that point in
the code is reached. Let’s take a look at an example:
4: List<String> list = new ArrayList<>();
5: list.add("Magician");
6: list.add("Assistant");
7: System.out.println(list); // [Magician, Assistant]
8: list.removeIf(s -> s.startsWith("A"));
9: System.out.println(list); // [Magician]
Line 8 shows how to remove all of the strings that begin with the letter A. This allows us
to make the Assistant disappear.
How would you replace line 8 with a method reference? Trick question—you can’t. Since
startsWith takes a parameter that isn’t s, it needs to be specified “the long way.”
There isn’t much to removeIf as long as long as you remember how Predicate works. If this
isn’t familiar, go back and review Chapter 2. We will be using lambdas a lot in the next chapter,
and you need to have this down cold. The most important thing to remember about removeIf is
that it is one of two methods that are on a collection and it takes a lambda parameter.
Additions in Java 8 155
Updating All Elements
Another new method introduced on Lists is replaceAll. Java 8 lets you pass a lambda
expression and have it applied to each element in the list. The result replaces the current
value of that element.
The method signature looks like:
void replaceAll(UnaryOperator<E> o)
It uses a UnaryOperator, which takes one parameter and returns a value of the same
type. Let’s take a look at an example:
List<Integer> list = Arrays.asList(1, 2, 3);
list.replaceAll(x -> x*2);
System.out.println(list); // [2, 4, 6]
The lambda uses deferred execution to increase the value of each element in the list.
Looping through a Collection
Looping though a Collection is very common. For example, we often want to print out the
values one per line. There are a few ways to do this. We could use an iterator, the enhanced
for loop, or a number of other approaches—or we could use a Java 8 lambda.
Cats like to explore, so let’s join two of them as we learn a shorter way to loop through
a Collection. We start with the traditional way:
List<String> cats = Arrays.asList("Annie", "Ripley");
for(String cat: cats)
System.out.println(cat);
This works. We can do the same thing with lambdas in one line:
cats.forEach(c -> System.out.println(c));
This time, we’ve used a Consumer, which takes a single parameter and doesn’t return
anything. You won’t see this approach used too often because it is common to use a method
reference instead:
cats.forEach(System.out::println);
The cats have now discovered a more efficient way of printing their names. Now they
have more time to play (as do we)! In the next chapter, you will learn about using the
stream() method to do much more powerful things with lambdas.
Using New Java 8 Map APIs
Java 8 added a number of new methods on the Map interface. Only merge() is listed in the
OCP objectives. Two others, computeIfPresent() and computeIfAbsent(), are added in
the upgrade exam objectives. We recommend checking http://www.selikoff.net/ocp to
make sure that this is still the case before you take the exam.
156 Chapter 3 ■ Generics and Collections
Sometimes you need to update the value for a specific key in the map. There are a few
ways that you can do this. The first is to replace the existing value unconditionally:
Map<String, String> favorites = new HashMap<>();
favorites.put("Jenny", "Bus Tour");
favorites.put("Jenny", "Tram");
System.out.println(favorites); // {Jenny=Tram}
There’s another method, called putIfAbsent(), that you can call if you want to set a
value in the map, but this method skips it if the value is already set to a non-null value:
Map<String, String> favorites = new HashMap<>();
favorites.put("Jenny", "Bus Tour");
favorites.put("Tom", null);
favorites.putIfAbsent("Jenny", "Tram");
favorites.putIfAbsent("Sam", "Tram");
favorites.putIfAbsent("Tom", "Tram");
System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
As you can see, Jenny’s value is not updated because one was already present. Sam
wasn’t there at all, so he was added. Tom was present as a key but had a null value.
Therefore, he was added as well. These two methods handle simple replacements.
Sometimes, you need more logic to determine which value should be used. The following
sections show three approaches.
merge
The merge() method allows adding logic to the problem of what to choose. Suppose that
our guests are indecisive and can’t pick a favorite. They agree that the ride that has the longest name must be the most fun. We can write code to express this by passing a mapping
function to the merge() method:
11: BiFunction<String, String, String> mapper = (v1, v2)
12: -> v1.length() > v2.length() ? v1: v2;
13:
14: Map<String, String> favorites = new HashMap<>();
15: favorites.put("Jenny", "Bus Tour");
16: favorites.put("Tom", "Tram");
17:
18: String jenny = favorites.merge("Jenny", "Skyride", mapper);
19: String tom = favorites.merge("Tom", "Skyride", mapper);
20:
21: System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
22: System.out.println(jenny); // Bus Tour
23: System.out.println(tom); // Skyride
Additions in Java 8 157
Line 11 uses a functional interface called a BiFunction. In this case, it takes two parameters of the same type and returns a value of that type. Our implementation returns the one
with the longest name. Line 18 calls this mapping function, and it sees that “Bus Tour”
is longer than “Skyride,” so it leaves the value as “Bus Tour.” Line 19 calls this mapping
function again. This time “Tram” is not longer than “Skyride,” so the map is updated. Line
21 prints out the new map contents. Lines 22 and 23 show that the result gets returned
from merge().
The merge() method also has logic for what happens if nulls or missing keys are
involved. In this case, it doesn’t call the BiFunction at all, and it simply uses the new
value:
BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() >
v2.length() ? v1 : v2;
Map<String, String> favorites = new HashMap<>();
favorites.put("Sam", null);
favorites.merge("Tom", "Skyride", mapper);
favorites.merge("Sam", "Skyride", mapper);
System.out.println(favorites); // {Tom=Skyride, Sam=Skyride}
Notice that the mapping function isn’t called. If it were, we’d have a
NullPointerException. The mapping function is used only when there are two actual values to decide between.
The final thing to know about merge() is what happens when the mapping function is
called and returns null. The key is removed from the map when this happens:
BiFunction<String, String, String> mapper = (v1, v2) -> null;
Map<String, String> favorites = new HashMap<>();
favorites.put("Jenny", "Bus Tour");
favorites.put("Tom", "Bus Tour");
favorites.merge("Jenny", "Skyride", mapper);
favorites.merge("Sam", "Skyride", mapper);
System.out.println(favorites); // {Tom=Bus Tour, Sam=Skyride}
Tom was left alone since there was no merge() call for that key. Sam was added since
that key was not in the original list. Jenny was removed because the mapping function
returned null. You’ll see merge again in the next chapter.
computeIfPresent and computeIfAbsent
These two methods are on the upgrade exam but not on the OCP exam. In a nutshell,
computeIfPresent() calls the BiFunction if the requested key is found.
158 Chapter 3 ■ Generics and Collections
Map<String, Integer> counts = new HashMap<>();
counts.put("Jenny", 1);
BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
Integer jenny = counts.computeIfPresent("Jenny", mapper);
Integer sam = counts.computeIfPresent("Sam", mapper);
System.out.println(counts); // {Jenny=2}
System.out.println(jenny); // 2
System.out.println(sam); // null
The function interface is a BiFunction again. However, this time the key and value are
passed rather than two values. Just like with merge(), the return value is the result of what
changed in the map or null if that doesn’t apply.
For computeIfAbsent(), the functional interface runs only when the key isn’t present or
is null:
Map<String, Integer> counts = new HashMap<>();
counts.put("Jenny", 15);
counts.put("Tom", null);
Function<String, Integer> mapper = (k) -> 1;
Integer jenny = counts.computeIfAbsent("Jenny", mapper); // 15
Integer sam = counts.computeIfAbsent("Sam", mapper); // 1
Integer tom = counts.computeIfAbsent("Tom", mapper); // 1
System.out.println(counts); // {Tom=1, Jenny=15, Sam=1}
Since there is no value already in the map, a Function is used instead of a
BiFunction. Only the key is passed as input. As you can see, Jenny isn’t changed
because that key is already in the map. Tom is updated because null is treated like not
being there.
If the mapping function is called and returns null, the key is removed from the map for
computeIfPresent(). For computeIfAbsent(), the key is never added to the map in the
first place, for example:
Map<String, Integer> counts = new HashMap<>();
counts.put("Jenny", 1);
counts.computeIfPresent("Jenny", (k, v) -> null);
counts.computeIfAbsent("Sam", k -> null);
System.out.println(counts); // {}
After running this code, the map is empty. The call to computeIfPresent() removes the
key from the map. The call to computeIfAbsent() doesn’t add a key.
Table 3.11 and Table 3.12 show all of these scenarios as a reference.
Summary 159
Ta b le 3 .11 The basics of the merge and compute methods
Scenario merge computeIfAbsent computeIfPresent
Key already in map Result of function No action Result of function
Key not already in map Add new value to map Result of function No action
Functional Interface
used
BiFunction (Takes existing value and new value.
Returns new value.)
BiFunction(Takes
key and existing
value. Returns
new value.)
Function (Takes
key and returns
new value.)
Ta b le 3 .12 Merge and compute methods when nulls are involved
Key has
Mapping
functions returns merge computeIfAbsent computeIfPresent
null value in
map
null Remove key
from map.
Do not change
map.
Do not change
map.
null value in
map
Not null Set key to
mapping
function
result.
Add key to map
with mapping
function result as
value.
Do not change
map.
Non-null
value in map
null Remove key
from map.
Do not change
map.
Remove key from
map.
Non-null
value in map
Not null Set key to
mapping
function
result.
Do not change
map.
Set key to
mapping function
result.
Key not in map null Add key to
map.
Do not change
map.
Do not change
map.
Key not in map Not null Add key to
map.
Add key to map
with mapping
function result as
value.
Do not change
map.
Summary
Generics are type parameters for code. To create a class with a generic parameter, add <T>
after the class name. You can use any name you want for the type parameter. Single uppercase letters are common choices.
160 Chapter 3 ■ Generics and Collections
The diamond operator (<>) is used to tell Java that the generic type matches the declaration without specifying it again. The diamond operator can be used for local variables or
instance variables as well as one-line declarations.
Generics allow you to specify wildcards. <?> is an unbounded wildcard that means any
type. <? extends Object> is an upper bound that means any type that is Object or extends
it. <? extends MyInterface> means any type that implements MyInterface. <? super
Number> is a lower bound that means any type that is Number or a superclass. A compiler
error results from code that attempts to add or remove an item in a list with an unbounded
or upper-bounded wildcard.
When working with code that doesn’t use generics (also known as legacy code or raw types),
Java gives a compiler warning. A compiler warning is different than a compiler error in that the
compiler still produces a class file. If you ignore the compiler warning, the code might throw a
ClassCastException at runtime. Unboxing gives a compiler error when generics are not used.
Each primitive class has a corresponding wrapper class. For example, long’s wrapper
class is Long. Java can automatically convert between primitive and wrapper classes when
needed. This is called autoboxing and unboxing. Java will only use autoboxing if it doesn’t
find a matching method signature with the primitive. For example, remove(int n) will be
called rather than remove(Object o) when called with an int.
The Java Collections Framework includes four main types of data structures: lists, sets,
queues, and maps. The Collection interface is the parent interface of List, Set, and Queue.
The Map interface does not extend Collection. You need to recognize the following:
■ List—An ordered collection of elements that allows duplicate entries
■ ArrayList—Standard resizable list.
■ LinkedList—Can easily add/remove from beginning or end.
■ Vector—Older thread-safe version of ArrayList.
■ Stack—Older last-in, first-out class.
■ Set—Does not allow duplicates
■ HashSet—Uses hashcode() to find unordered elements.
■ TreeSet—Sorted and navigable. Does not allow null values.
■ Queue—Orders elements for processing
■ LinkedList—Can easily add/remove from beginning or end.
■ ArrayDeque—First-in, first-out or last-in, first-out. Does not allow null values.
■ Map—Maps unique keys to values
■ HashMap—Uses hashcode() to find keys.
■ TreeMap—Sorted map. Does not allow null keys.
■ Hashtable—Older version of hashmap. Does not allow null keys or values.
The Comparable interface declares the compareTo() method. This method returns
a negative number if the object is smaller than its argument, zero if the two objects
are equal, and a positive number otherwise. compareTo() is declared on the object
Exam Essentials 161
that is being compared, and it takes one parameter. The Comparator interface defines
the compare() method. A negative number is returned if the first argument is smaller,
zero if they are equal, and a positive number otherwise. compare() can be declared
in any code, and it takes two parameters. Comparator is often implemented using a
lambda.
The Arrays and Collections classes have methods for sort() and binarySearch().
Both take an optional Comparator parameter. It is necessary to use the same sort order for
both sorting and searching, so the result is not undefined. Collection has a few methods
that take lambdas, including removeIf(), forEach(), and merge().
A method reference is a compact syntax for writing lambdas that refer to methods. There are four types: static methods, instance methods referring to a specific
instance, instance methods with the instance supplied at runtime, and constructor
references.
Exam Essentials
Pick the correct type of collection from a description. A List allows duplicates and orders
the elements. A Set does not allow duplicates. A Queue orders its elements to allow retrievals from one or both ends. A Map maps keys to values. Be familiar with the differences of
implementations of these interfaces.
Identify valid and invalid uses of generics. <T> represents a type parameter. Any name
can be used, but a single uppercase letter is the convention. <?> is an unbounded wildcard.
<? extends X> is an upper-bounded wildcard and applies to both classes and interfaces. <?
super X> is a lower-bounded wildcard.
Recognize the difference between compiler warnings and errors when dealing with
legacy code. A compiler warning occurs when using non-generic types, and a
ClassCastException might occur at runtime. A compiler error occurs when trying to
unbox from a legacy collection.
Differentiate between Comparable and Comparator. Classes that implement Comparable
are said to have a natural ordering and implement the compareTo() method. A class is
allowed to have only one natural ordering. A Comparator takes two objects in the compare() method. Different Comparators can have different sort orders. A Comparator is
often implemented using a lambda such as (a, b) -> a.num – b.num.
Understand the behavior and usage of the sort and binary search methods. The
Collections and Arrays classes provide overloaded sort() and binarySearch() methods.
They take an optional Comparator parameter. The list or array must be sorted before it is
searched using the same definition of order for both.
Map method references to the “long form” lambda. Be able to convert method references
into regular lambda expressions and vice versa. For example, System.out::print and x ->
System.out.print(x) are equivalent.
 * 
 */

}

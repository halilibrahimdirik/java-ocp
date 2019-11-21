package chapter5;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberInstanceTest {
	public static void main(String[] args) throws Exception {

		double num = 1323.526;

		NumberFormat numberInstance = NumberFormat.getNumberInstance();
		System.out.println("US: " + numberInstance.format(num));
		
		
		NumberFormat percentInstance = NumberFormat.getPercentInstance();
		System.out.println("US: " + percentInstance.format(num));
		
		NumberFormat integerInstance = NumberFormat.getIntegerInstance();
		System.out.println("US: " + integerInstance.format(num));
		
		
		NumberFormat defaultFormat = NumberFormat.getInstance();
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		String s = "40.45mm";
		System.out.println(defaultFormat.parse(s)); // 40.45
		System.out.println(en.parse(s)); // 40.45
		System.out.println(fr.parse(s)); // 40
		System.out.println(numberInstance.parse(s)); // 40
		System.out.println(percentInstance.parse(s)); // 40
		
		
//		NumberFormat.getPercentInstance()
//		NumberFormat.getPercentInstance(locale)
//		Rounds decimal values before
//		displaying (not on the exam)
		/*
		 
The parse method is also used for parsing currency. For example, we can read in the
zoo’s monthly income from ticket sales:
String amt = "$92,807.99";
NumberFormat cf = NumberFormat.getCurrencyInstance();
double value = (Double) cf.parse(amt);
System.out.println(value); // 92807.99
The currency string "$92,807.99" contains a dollar sign and a comma. The parse
method strips out the characters and converts the value to a number. The return value of
parse is a Number object. Number is the parent class of all the java.lang wrapper classes, so
the return value can be cast to its appropriate data type. The Number is cast to a Double and
then automatically unboxed into a double.
The NumberFormat classes have other features and capabilities, but the topics covered in
this section address the content that you need to know for the OCP exam.
		  
		  
		 * */
		 
		
		
//		NumberFormat.getIntegerInstance()
//		NumberFormat.getIntegerInstance(locale)

	}
}

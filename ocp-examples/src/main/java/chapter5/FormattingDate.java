package chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDate {

	public static void main(String[] args) {
		
//		The date and time classes support many methods to get data out of them:
			LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
			System.out.println(date.getDayOfWeek()); // MONDAY
			System.out.println(date.getMonth()); // JANUARY
			System.out.println(date.getYear()); // 2020
			System.out.println(date.getDayOfYear()); // 20
			
//			We could use this information to display information about the date. However, it would
//			be more work than necessary. Java provides a class called DateTimeFormatter to help us
//			out. Unlike the LocalDateTime class, DateTimeFormatter can be used to format any type of
//			date and/or time object. What changes is the format. DateTimeFormatter is in the package
//			java.time.format.
			LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
			LocalTime time = LocalTime.of(11, 12, 34);
			LocalDateTime dateTime = LocalDateTime.of(date1, time);
			System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
			System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
			System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
			System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
			System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
//			ISO is a standard for dates. The output of the previous code looks like this:
//			2020–01–20
//			11:12:34
//			2020–01–20T11:12:34
			
			
//			This is a reasonable way for computers to communicate, but it is probably not how
//			you want to output the date and time in your program. Luckily, there are some predefined
//			formats that are more useful:
			DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
			System.out.println(shortDateTime.format(dateTime)); // 1/20/20
			System.out.println(shortDateTime.format(date)); // 1/20/20
			//System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
			
			
//			Here we say that we want a localized formatter in the predefined short format. The
//			last line throws an exception because a time cannot be formatted as a date. The format()
//			method is declared on both the formatter objects and the date/time objects, allowing you to
//			reference the objects in either order. The following statements print exactly the same thing
//			as the previous code:
			DateTimeFormatter shortDateTime1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
			System.out.println(dateTime.format(shortDateTime1));
			System.out.println(date.format(shortDateTime1));
			//System.out.println(time.format(shortDateTime1));
			
		// In this book, we’ll change around the orders to get you used to seeing it
		// both ways.
		// Table 5.10 shows the legal and illegal localized formatting methods.
		
	}

}

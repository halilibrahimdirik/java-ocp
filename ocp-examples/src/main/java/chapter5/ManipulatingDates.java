package chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDates {

	public static void main(String[] args) {

		// 1) date and time classes are immutable
		LocalDate date1 = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date1); // 2014–01–20
		date1 = date1.plusDays(2);
		System.out.println(date1); // 2014–01–22
		date1 = date1.plusWeeks(1);
		System.out.println(date1); // 2014–01–29
		date1 = date1.plusMonths(1);
		System.out.println(date1); // 2014–02–28
		date1 = date1.plusYears(5);
		System.out.println(date1); // 2019–02–28

		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date2, time);
		System.out.println(dateTime); // 2020–01–20T05:15
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020–01–19T05:15
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020–01–18T19:15
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020–01–18T19:14:30

		// 2)Chaining
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time3 = LocalTime.of(5, 15);
		LocalDateTime dateTime3 = LocalDateTime.of(date3, time).minusDays(1).minusHours(10).minusSeconds(30);
	}
}

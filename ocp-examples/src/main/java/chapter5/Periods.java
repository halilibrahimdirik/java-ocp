package chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Periods {

	public static void main(String[] args) {

		// 1)Epoch - number of days since January 1, 1970
		System.out.println(LocalDate.of(2012, 2, 2).toEpochDay());

		// 2)Period
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		performAnimalEnrichment(start, end, period);

		// 3)Create Period
		Period annually = Period.ofYears(1); // every 1 year
		System.out.println(annually);
		Period quarterly = Period.ofMonths(3); // every 3 months
		System.out.println(quarterly);
		Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		System.out.println(everyThreeWeeks);
		Period everyOtherDay = Period.ofDays(2); // every 2 days
		System.out.println(everyOtherDay);
		Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
		System.out.println(everyYearAndAWeek);

		// 4)You cannot chain methods when creating a Period.Period of methods are
		// static methods
		Period wrong = Period.ofYears(1).ofWeeks(1); // every week

		// 5)OK to have more days than are in a month.
		System.out.println(Period.of(0, 20, 47));

		// 6)The last thing to know about Period is what objects it can be used with
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period1 = Period.ofMonths(1);
		System.out.println(date.plus(period1)); // 2015–02–20
		System.out.println(dateTime.plus(period1)); // 2015–02–20T06:15
		System.out.println(time.plus(period1)); // UnsupportedTemporalTypeException
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { // uses the generic
																									// period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period); // adds the period
		}
	}
}

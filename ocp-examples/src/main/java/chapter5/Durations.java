package chapter5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Durations {

	public static void main(String[] args) {

		// 1)Create Duration
		Duration daily = Duration.ofDays(1); // PT24H
		Duration hourly = Duration.ofHours(1); // PT1H
		Duration everyMinute = Duration.ofMinutes(1); // PT1M
		Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
		Duration everyMilli = Duration.ofMillis(1); // PT0.001S
		Duration everyNano = Duration.ofNanos(1); // PT0.000000001S

		Duration daily1 = Duration.of(1, ChronoUnit.DAYS);
		Duration hourly1 = Duration.of(1, ChronoUnit.HOURS);
		Duration everyMinute1 = Duration.of(1, ChronoUnit.MINUTES);
		Duration everyTenSeconds1 = Duration.of(10, ChronoUnit.SECONDS);
		Duration everyMilli1 = Duration.of(1, ChronoUnit.MILLIS);
		Duration everyNano1 = Duration.of(1, ChronoUnit.NANOS);

		// 2)ChronoUnit for Differences
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		LocalDate date = LocalDate.of(2016, 1, 20);
		System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
		System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
//		System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException

		// 3)
		LocalDate date1 = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date1, time);
		Duration duration = Duration.ofHours(6);
		System.out.println(dateTime.plus(duration)); // 2015–01–20T12:15
		System.out.println(time.plus(duration)); // 12:15
//		System.out.println(date1.plus(duration)); // UnsupportedTemporalException

		// 4)
		LocalDate date2 = LocalDate.of(2015, 5, 25);
		Period period = Period.ofDays(1);
		Duration days = Duration.ofDays(1);
		System.out.println(date2.plus(period)); // 2015–05–26
//		System.out.println(date2.plus(days)); // Unsupported unit: Seconds
		
		
		Period period1 = Period.of(1,2,7);
		
		System.out.println("per::"+period1);
		
		System.out.println(Period.ofMonths(3));
		
		System.out.println(Period.of(1,13,0));
		
		System.out.println(Period.ofWeeks(3));
		
		
		Duration daily11 = Duration.ofDays(2); // PT24H
		System.out.println(daily11);
		
		
		Duration hourly11 = Duration.ofHours(1); // PT1H
		Duration everyMinute11 = Duration.ofMinutes(1); // PT1M
		Duration everyTenSeconds11 = Duration.ofSeconds(10); // PT10S
		Duration everyMilli11 = Duration.ofMillis(1); // PT0.001S
		Duration everyNano11 = Duration.ofNanos(1); // PT0.000000001S

	}

}

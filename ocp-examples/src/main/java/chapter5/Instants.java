package chapter5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Instants {

	public static void main(String[] args) {
		Instant now = Instant.now();
		float x=0;
		while(x<400000f)
		{
			x=x+1;
		}
		Instant later = Instant.now();
		
		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis());
		
		
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
		System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
		System.out.println(instant); // 2015–05–25T15:55:00Z
		
		
		Instant instant1 = Instant.ofEpochSecond(10000000);
		System.out.println(instant1); // 2015–05–25T15:55:00Z
		
		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay); // 2015–05–26T15:55:00Z
		Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
		System.out.println(nextHour); // 2015–05–25T16:55:00Z
		Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS); // exception
		
		
	}

}

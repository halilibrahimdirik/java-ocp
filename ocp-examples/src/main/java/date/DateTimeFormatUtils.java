package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatUtils {

	private static final String PATTERN = "dd.MM.yyyy";

	private static final SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);

	public static void main(String[] args) {
		Date dateTime;
		try {
			dateTime = sdf.parse("18.10.2018");
			System.out.println("dateTime:" + dateTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

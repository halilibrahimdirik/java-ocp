package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatUtils {

	private static final String PATTERN = "dd.MM.yyyy";
	private static final SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
	
	private static final String PATTERN2 = "yyyy-MM-dd'T'HH:mm";
	private static final SimpleDateFormat sdf2 = new SimpleDateFormat(PATTERN2);

	public static void main(String[] args) {
		Date dateTime;
		try {
//			dateTime = sdf.parse("18.10.2018");
			
			Date parse = sdf2.parse("2019-09-18T14:00:00");
			System.out.println("dateTime:" + parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

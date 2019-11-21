package chapter5;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatTest {
	public static void main(String[] args) throws Exception {

		double num = 1323.526;

		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		System.out.println("US: " + defaultFormat.format(num));

		Locale swedish = new Locale("sv", "SE");
		NumberFormat swedishFormat = NumberFormat.getCurrencyInstance(swedish);
		System.out.println("Swedish: " + swedishFormat.format(num));
		
		Locale turkish = new Locale("tr", "TR");
		NumberFormat turkishFormat = NumberFormat.getCurrencyInstance(turkish);
		System.out.println("turkishFormat: " + turkishFormat.format(num));
		
		NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("chinaFormat: " + chinaFormat.format(num));
		
		
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		double value = (Double) cf.parse(amt);
		System.out.println(value); // 92807.99
		
		
		String tlString = "1.323,53 TL";
		double value2 = (Double) turkishFormat.parse(tlString);
		System.out.println(value2); // 92807.99

	}
}

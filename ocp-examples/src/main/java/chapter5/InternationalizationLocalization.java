package chapter5;

import java.util.Locale;

public class InternationalizationLocalization {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);// en_US First comes the lowercase language code. Then comes an underscore
									// followed by the uppercase country code

		System.out.println(Locale.GERMAN); // de
		System.out.println(Locale.GERMANY); // de_DE

		System.out.println(new Locale("fr")); // fr
		System.out.println(new Locale("hi", "IN")); // hi_IN

		Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale l2 = new Locale.Builder().setRegion("US").setLanguage("en").build();

		System.out.println(Locale.getDefault()); // en_US
		Locale locale1 = new Locale("fr");
		Locale.setDefault(locale1); // change the default
		System.out.println(Locale.getDefault()); // fr
	}

}

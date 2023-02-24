package number.format;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		double value = 123456789123456789123456789d;
		System.out.println("value : " + value);
		
		//locale : depend country
		Locale locale = new Locale("ja", "JP");
		NumberFormat nf1 = NumberFormat.getInstance(locale);
		System.out.println("value1 : " + nf1.format(value));

		//get current locale
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		System.out.println("value2 : " + nf2.format(value));
	}
}

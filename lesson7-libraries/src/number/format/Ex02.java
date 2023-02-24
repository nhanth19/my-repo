package number.format;

import java.text.DecimalFormat;

public class Ex02 {
	private static final String pattern = "#,###.00";

	public static void main(String[] args) {
		double num = 56.7890;
		DecimalFormat df = new DecimalFormat(pattern);
		
		System.out.println("num: " + df.format(num));
		
	}
}

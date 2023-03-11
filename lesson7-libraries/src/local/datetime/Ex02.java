package local.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
	private static String localizedKey = "dd.MM.yyyy KK:mm:ss a";
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern(localizedKey);
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("ldt : " + dtf.format(ldt));
		
		LocalDateTime anotherLdt = LocalDateTime.now();
		System.out.println("anotherLdt : " + anotherLdt);
		
	}
}

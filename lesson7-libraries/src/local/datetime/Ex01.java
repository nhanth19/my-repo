package local.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	
	public static void main(String[] args) {
		//LocalDate : use Builder pattern
		
		LocalDate date = LocalDate.now().withMonth(3).withYear(2023);
		System.out.println("date : " + date);
		
		LocalDate anotherDate = LocalDate.of(2023, 3, 7).plusWeeks(2);
		System.out.println("anotherDate : " + anotherDate);
		
		Period period = Period.between(date, anotherDate);
		System.out.println("period : " + period);
		System.out.println("period toString : "+ period.getYears() + "Y"
				 							   + period.getMonths() + "M"
				 							   + period.getDays() + "D");
	
		//format 
		DateTimeFormatter  dtf1 = DateTimeFormatter.ofPattern("dd.MM.YYYY");
		System.out.println("datetimeformatter : " + dtf1.format(date));
		
		System.out.println("======================");
		//LocalTime : use Builder pattern
		
		LocalTime time = LocalTime.now().withHour(23).withMinute(55);
		System.out.println("time : " + time);
		
		LocalTime anotherTime = LocalTime.of(23, 57, 20);
		System.out.println("anotherTime : " + anotherDate);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("KK:mm:ss a");
		System.out.println("format : " + dtf2.format(time));
		
		Duration duration = Duration.between(time, anotherTime);
		System.out.println("duration : " + duration);
		

	}
}

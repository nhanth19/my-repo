package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import utils.DateUtils;

public class Ex01 {
	private static String[] months = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
	
	private static final String PATTERN = "dd/MM/yyyy EEEE";
	private static DateFormat df = new SimpleDateFormat(PATTERN);
	
	public static void main(String[] args) {
		
		//timezone : depend locale
		//Date = new Date() : khai bao nhieu lan,ton memory
		//Calendar.getIntance(): singleton pattern
		//ICT : indochina time
		//epoch time: 1/1/1970 : moc thoi gian dc set tren thiet bi dien tu, de tinh milis
		
		Date date = new Date();
		System.out.println("date : " + date);
		
//		Locale.setDefault(Locale.GERMANY);
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		
		//set time
//		c.set(Calendar.MONTH, 0);
		System.out.println("calendar :" + c);

		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println("d/m/y : " + day + "/" + months[month] + "/" + year);
		
		int hour = c.get(Calendar.HOUR);         //hour12
		int tag = c.get(Calendar.AM_PM);
		int hour2 = c.get(Calendar.HOUR_OF_DAY); //hour24
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("h:m:s : " + hour + ":" + minute + ":"+ second);
		
		//number of days in month, year
		int daysOfMonthActual = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysOfMonthAlway = c.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("daysOfMonthActual : " + daysOfMonthActual);
		System.out.println("daysOfMonthAlway : " + daysOfMonthAlway);
		
		int daysOfYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("daysOfYear : " + daysOfYear);
		
		//first day of week : depend locale
		// FRANCE : 2 : MONDAY
		// US : 1 : SUNDAY
		System.out.println("Locale : " + Locale.getDefault());
		int fdow = c.getFirstDayOfWeek();
		System.out.println("firstDayOfWeek : " + fdow);
		
		c.add(Calendar.DAY_OF_MONTH, fdow - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("c : " + c);
		
		System.out.println("=============");
		int dayOfIndex = 1;
		while(dayOfIndex <= 7 ) {
			System.out.println(df.format(c.getTime()));
			c.add(Calendar.DAY_OF_MONTH, 1);
			dayOfIndex++;
		}
		
		//leap year
		c.set(Calendar.YEAR, 2000);
		System.out.println("isLeapYear : " + DateUtils.isLeapYear(c.get(Calendar.YEAR)));
	}
}

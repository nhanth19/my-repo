package conditions;

public class Ex01 {
	public static void main(String[] args) {
		int month = 32;
		getDaysOfMonth(month);
	}
	
	private static void getDaysOfMonth(int month) {
		int dayInMonth = 0;
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 : 
		case 10: 
		case 12: {
			dayInMonth = 31;
			break;
		}
		case 4 , 6 , 9, 11 : {
			dayInMonth = 30;
			break;
		}
		case 2 : {
			dayInMonth = 28;
		}
		default:
			System.out.println("Invalid month.");
			return; //used in void method , ignore below code and stop method
		}
		System.out.println("Month " + month +" has " + dayInMonth + " days.");
	}
}

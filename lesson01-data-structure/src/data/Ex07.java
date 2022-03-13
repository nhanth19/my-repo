package data;

public class Ex07 {
	public static void main(String[] args) {
		
		char a = 'x';
		char b = '6';
		System.out.println("a : " + isDigit(a));
		System.out.println("b : " + isDigit(b));
	}
	
	private static boolean isDigit(int tmp) {
		return tmp >= '0' && tmp <= '9';
	}
}

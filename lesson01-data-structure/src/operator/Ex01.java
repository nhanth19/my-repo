package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a = 20;
		System.out.println(isEven(a));
	}
	
	public static boolean isEven (int num) {
		return num % 2 == 0;
	}
}

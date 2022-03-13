package ex;

public class Ex01 {
	public static void main(String[] args) {
		int a = 7;
		int b = 10;
		int c = 3;
		
		System.out.println("max : " + max(a, b, c));
	}
	
	private static int max(int a, int b, int c) {
		int max = a > b ? a : b;
		if(max < c) {
			max = c;
		}
		return max;
	}
}

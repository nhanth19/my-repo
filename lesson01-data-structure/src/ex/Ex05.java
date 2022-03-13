package ex;

public class Ex05 {
	//luy thua cua 2
	public static void main(String[] args) {
		System.out.println("4 isPowerOfTwo : " + isPowerOfTwo(4) );
		System.out.println("8 isPowerOfTwo : " + isPowerOfTwo(8) );
		System.out.println("6 isPowerOfTwo : " + isPowerOfTwo(6) );
		System.out.println("12 isPowerOfTwo : " + isPowerOfTwo(12) );
	}

	private static boolean isPowerOfTwo(int n) {
		while (n % 2 == 0) {
			n = n / 2;
		}
		
		if (n == 1) {
			return true;
		}
		
		return false;
	}
}

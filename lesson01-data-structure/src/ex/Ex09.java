package ex;

public class Ex09 {
	// so nguyen to
	public static void main(String[] args) {
		int n = 200;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if(isPrime(i)) {
				if(i == n) {
					System.out.println(i);
				}
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n <= 2) {
			return false;
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

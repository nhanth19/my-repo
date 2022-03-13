package ex;

public class Ex06 {
	// cal S = 4! + 7! + 12! + 18!
	public static void main(String[] args) {
		System.out
				.println("S = 4! + 7! + 12! + 18! = " + (factorial(4) + factorial(7) + factorial(12) + factorial(18)));
	}

	private static int factorial(int n) {
		if (n <= 2) {
			return n;
		}
		return n * factorial(n - 1);
	}
}

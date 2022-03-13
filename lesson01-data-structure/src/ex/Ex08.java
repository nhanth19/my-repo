package ex;

public class Ex08 {
	public static void main(String[] args) {
		int[] n = {5, 1, 19, 11, 20, 17, 21, 30};
		max(n);
	}
	
	private static void max(int[] n) {
		int length = n.length;
		for(int i = 0; i < length - 1; i++) {
			for(int j = 1; j < length - i - 1; i++) {
				if(n[i] > n[j]) {
					if(n[i] % 2 != 0) {
						System.out.println(n[i]);
					}
				}
			}
		}
	}
}

package input;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = 20;
		int b = 10;
		System.out.println(b + rd.nextInt(a - b - 1));
	}
}

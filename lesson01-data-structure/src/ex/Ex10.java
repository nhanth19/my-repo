package ex;

import java.util.Random;

public class Ex10 {
	//random 5 so ko trung nhau
	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		Random rd = new Random();
		
		int i = 0;
		do {
			int n = b + rd.nextInt(a - b - 1);
			System.out.print(n + " ");
			i++;
		} while (i > 5);
		
	}
}

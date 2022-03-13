package ex;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//enter a valid number
		
		Scanner sc = new Scanner(System.in);
		
		String text = null;
		int count = 0;
		do {
			System.out.print("Enter valid number : ");
			text = sc.nextLine();
			if(text.matches("[0-9]+")) {
				break;
			}
			
			count++;
			if(count == 3) {
				System.out.println("Entered invalid number exceeds 3 times.");
				return;
			}
		} while(true);
		int number = Integer.parseInt(text); 
		System.out.println("Value : " + number);
	}
}

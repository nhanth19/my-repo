package input;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//trôi lệnh :
		//khi nhập input là kiểu khác String thừa Enter
		//các lệnh input kiểu String phía sau sẽ bị trôi.
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = ip.nextLine();
		
		System.out.print("Enter age : ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter hobbies : ");
		String hobbies = ip.nextLine();
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("hobbies : " + hobbies);
	}
}

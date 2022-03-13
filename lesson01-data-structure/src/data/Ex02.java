package data;

public class Ex02 {

	/**
	 * Java pass by value : 
	 *    > the value of the variable on STACK is copied into a new variable inside the method.
	 *    > actual value of any variables on the STACK is actual value for primitive type or the reference for reference type.
	 * 
	 */
	public static void main(String[] args) {
		int age = 25;
		int salary = 20;

//		System.out.println("age    : " + age);
		System.out.println("salary : " + salary);

		// change value
		increase(salary);
//		System.out.println("salary increased : " + salary);

		// swap value
		swap(age, salary);
		System.out.println("swap age :" + age);
		System.out.println("swap salary :" + salary);
	}

	private static void swap(int age, int salary) {
		int temp = age;
		age = salary;
		salary = temp;
	}

	private static void increase(int salary) {
		salary = 35;
	}
}

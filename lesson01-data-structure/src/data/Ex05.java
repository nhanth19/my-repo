package data;

public class Ex05 {
	public static void main(String[] args) {
		Integer a = 20;
		Integer b = 30;
		
		swap(a, b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	private static void swap(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}
}

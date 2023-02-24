package string.immutable;

public class Ex02 {
	public static void main(String[] args) {
		String s1 = "Re2cy5cle Vi7ew";
		
		//String's method
		System.out.println("length : " + s1.length());
		System.out.println("charAt(3) : " + s1.charAt(2));
		
		//loop
		for(int i = 0; i < s1.length(); i++) {
			char s = s1.charAt(i);
			if(Character.isDigit(s)) {
				System.out.print(s + " ");
			}
		}
	}
}

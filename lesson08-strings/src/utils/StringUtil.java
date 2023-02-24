package utils;

public class StringUtil {
	private StringUtil() {}
	
	public static void hashcode(String text) {
		System.out.println("hash of " + text + " : " + System.identityHashCode(text));
	}
}

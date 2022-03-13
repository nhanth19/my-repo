package ex;

public class Ex02 {
	public static void main(String[] args) {
		float avg = 5.5f;
		System.out.println("level : " + getLevel(avg));
	}
	
	private static Level getLevel(float point) {
		Level result = null;
		if(point < 5) {
			result = Level.BAD;
		} else if (point >= 5 && point < 6.5) {
			result = Level.MEDIUM;
		} else if(point >= 6.5 && point < 8) {
			result = Level.PRETTY_GOOD;
		} else {
			result = Level.GOOD;
		}
		
		return result;
	}
}	


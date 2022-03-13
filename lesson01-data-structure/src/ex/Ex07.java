package ex;

public class Ex07 {
	//So doi xung
	// 121 , 13331
	public static void main(String[] args) {
		System.out.println("121 : " + isSymetric(121));
		System.out.println("13331 : " + isSymetric(13331));
		System.out.println("13334 : " + isSymetric(13334));
	}
	
	private static boolean isSymetric(int num) { 
		if(num == revert(num)) {
			return true;
		}
		return false;
	}
	
	private static int revert(int num) {
		int revertNum = 0;
		while(num > 0) {
			revertNum = revertNum * 10 + num % 10;
			num = num / 10;
		}
		return revertNum;
	}
}

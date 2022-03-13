package conditions;

public class Ex02 {
	public static void main(String[] args) {
		int n = 8;
//		print(n);
		demoBreakContinue(n);
	}
	
	private static void print(int n) {
		int i = 0;
//		for(; i < n ;) {
//			System.out.print(i + " ");
//			 i++;
//		}
 		
		//while	
//		while (i < n) {
//			System.out.print(i + " ");
//			i++;
//		}
		
		//while...true
//		while(true) {
//			System.out.print(i + " ");
//			i++;
//			if (i > n) { 
//				break;
//			}
//		}
		//do...while
		do {
			System.out.print(i + " ");
			i++;
		}
		while( i <= n );
	}
	
	private static void demoBreakContinue(int n) {
		for (int i = 1; i <= n; i++ ) {
			System.out.print(i + " ");
			if(i == 4) {
				break;
			}
			
		}
		
		System.out.println();
		
		for (int i = 1; i <= n; i++ ) {
			System.out.print(i + " ");
			if(i == 4) {
				continue;
			}
			
		}
	}
}

package number.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
	public static void main(String[] args) {
		
		BigDecimal b1 = BigDecimal.valueOf(123456789.12456);
		BigDecimal b2 = BigDecimal.valueOf(456.1234);
		
		BigDecimal result = b1.multiply(b2).setScale(4, RoundingMode.HALF_UP);
		System.out.println("result : " + result);
	}
}

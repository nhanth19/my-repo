package utils;

import java.util.Arrays;
import java.util.List;

import bean.Apple;

public class AppleUtils {
	private AppleUtils() {
	}
	
	public static List<Apple> getAll() {
		return Arrays.asList(
				new Apple(1, "green", 200, "VN"),
				new Apple(2, "white", 300, "VN"),
				new Apple(3, "red", 200, "VN"),
				new Apple(4, "yellow", 200, "VN"),
				new Apple(5, "green", 200, "VN")
		);
	}
}

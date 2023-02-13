package utils;

import java.util.List;
import java.util.Set;

public class ListUtils {
	private ListUtils() {
	}
	
	public static <E> void printf(List<E> lists) {
		for(E e : lists) {
			System.out.println(e);
		}
	}
	
	public static <E> void printf(Set<E> lists) {
		for(E e : lists) {
			System.out.println(e);
		}
	}
}

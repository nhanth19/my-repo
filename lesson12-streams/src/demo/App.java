package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Apple;
import pattern.Strategy;
import utils.AppleUtils;
import utils.ListUtils;

public class App {
	public static void main(String[] args) {
		List<Apple> inventory = AppleUtils.getAll();

		// anonymous class
		List<Apple> greenApples1 = filterApples(inventory, new Strategy<Apple>() {
			@Override
			public boolean behavior(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});
		ListUtils.printf(greenApples1);
		System.out.println("============");
		
		// lambda : a instance of functional interface
		Strategy<Apple> greenApple = a -> "green".equals(a.getColor());
		List<Apple> greenApples2 = filterApples(inventory, greenApple);
		ListUtils.printf(greenApples2);
		System.out.println("============");
		
		Set<String> colors = map(inventory, a -> a.getColor());
		ListUtils.printf(colors);
	}

	private static List<Apple> filterApples(List<Apple> apples, Strategy<Apple> condition) {
		List<Apple> results = new ArrayList<>();

		for (Apple apple : apples) {
			if (condition.behavior(apple)) {
				results.add(apple);
			}
		}
		return results;
	}
	
	private static <T, R> Set<R> map(List<T> ts , Function<T, R> function) {
		
		Set<R> results = new HashSet<>();
		for(T t : ts) {
			results.add(function.apply(t));
		}
		return results;
	}
}

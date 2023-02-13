package demo;

import bean.Apple;

public class Ex02 {
	public static void main(String[] args) {
		// local variable

	}

	private static Runnable run(int time) {
		String jobName = "Queue Job";
		Apple jobDetail = new Apple(1, "black", 100, "Lao") ;

		return new Runnable() {
			public void run() {
				
			}
		};
	}
}

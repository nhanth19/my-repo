package data;

import utils.PrintUtils;

public class Ex03 {
	public static void main(String[] args) {
		
		// reference type : stored in HEAD
		//constant pool
		Integer age = 20;
		Integer hage = 30;  
		PrintUtils.hash("age", age);
		PrintUtils.hash("hage", age);
		
		//normal heap
		Integer salary = new Integer(10);
		Integer year = new Integer(2022);
		PrintUtils.hash("salary", salary);
		PrintUtils.hash("year", year);
	}
}

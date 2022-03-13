package data;

import utils.PrintUtils;

public class Ex01 {
	/**
	 *  Primitive type > stored in STACK memory
	 *  Reference type > the value on the stack is the address on the heap at which the real object resides(cư trú).
	 *                 > support methods 
	 * 	HEAP memory: constant pool is a special area in heap memory allocated for storing String literals.
     *     String literals with same content will be pointing the already existing literal(same address in constant pool) 
	 * 	   String object will be created in the heap every time.
	 * 
	 * Immutable class is class cannot be changed once its instance has been created.
	 * Final variables can update value in HEAP , cann't update in STACK (cann't assign value).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int age = 20;
		boolean gender = false;
		float avg = 8.7f;
		double price = 9.8;
		char letter = 'A';
		String name1 = "Nguyen";
		String name3 = "Nguyen";
		String name2 = new String("Join");
		
		PrintUtils.hash("name1 ", name1);
		PrintUtils.hash("name3", name3);
		PrintUtils.hash("name2 ", name2);
	}
}

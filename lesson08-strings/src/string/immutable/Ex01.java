package string.immutable;

import utils.StringUtil;

public class Ex01 {
	public static void main(String[] args) {
		// immutable : ko phải bất biến về giá trị, bất biến ở vùng nhớ HEAP
		String l1 = new String("Welcome");
		StringUtil.hashcode(l1);
		System.out.println("l1 : " + l1);

		l1 = "Hello";
		StringUtil.hashcode(l1);
		System.out.println("l1 : " + l1);

		System.out.println("============");

		String o1 = "literal";
		String o2 = "literal";
		StringUtil.hashcode(o1);
		StringUtil.hashcode(o2);

		String o3 = new String("literal");
		String o4 = new String("literal");
		String o5 = new String("nguu");
		StringUtil.hashcode(o3);
		StringUtil.hashcode(o4);
		
		// so sanh
		//==
		System.out.println("o1==o2 : " + (o1 == o2)); //T
		System.out.println("o1==o3 : " + (o1 == o3)); //F
		System.out.println("o3==o4 : " + (o3 == o4)); //F
		
		//equals
		System.out.println("o1 eq o2 : " + o1.equals(o2)); //T
		System.out.println("o1 eq o3 : " + o1.equals(o3)); //T 
		System.out.println("o3 eq o4 : " + o3.equals(o4)); //T
		
		//compareTo : compare từng kí tự với giá trị trong mã ASCII
		System.out.println("o1 compareTo o2 :" + o1.compareTo(o2)); //0
		System.out.println("o1 compareTo o3 :" + o1.compareTo(o3)); //0
		System.out.println("o3 compareTo o4 :" + o3.compareTo(o4)); //0
		System.out.println("o5 compareTo o3 :" + o5.compareTo(o3)); //2
		System.out.println("o3 compareTo o5 :" + o3.compareTo(o5)); //-2
	}
}

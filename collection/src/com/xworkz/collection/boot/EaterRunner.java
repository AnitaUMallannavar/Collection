package com.xworkz.collection.boot;

public class EaterRunner {

	public static void main(String[] args) {
		Eater eater = (ref1, ref2) -> {
			System.out.println("item is :" + ref1);
			System.out.println("item in lowerCase :" + ref1.toLowerCase());
			System.out.println("item in upperCase :" + ref1.toUpperCase());
			System.out.println("item is :" + ref1 + "]   [Quantity is :" + ref2);
			return null;
		};
		EaterUtil.test(eater);
	}
}


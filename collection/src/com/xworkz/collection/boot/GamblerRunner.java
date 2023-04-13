package com.xworkz.collection.boot;

public class GamblerRunner {

	public static void main(String[] args) {
		Gambler gambler = (ref) -> {
			System.out.println("Gambler is :" + ref);
			if (ref < 500) {
				System.out.println("Gambler is 0");
			}
			if (ref > 1000) {
				System.out.println("Gambler is 100");
			}
			return ref;
		};
		GamblerUtil.test(gambler);
	}
}
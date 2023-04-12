package com.xworkz.collection.boot;

public class RunningRunner {

	public static void main(String[] args) {
		Runner runner = (ref) -> {
			System.out.println("Distance is :" + ref);
			return 0D;
		};
		RunnerUtil.test(runner);
	}

}

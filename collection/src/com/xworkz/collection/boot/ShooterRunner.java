package com.xworkz.collection.boot;

public interface ShooterRunner {
     public static void main(String[] args) {
		Shooter shooter=(ref)->{
			System.out.println("Shooter type :"+ref);
			return false;
			
		};
		ShooterUtil.test(shooter);
	}
}

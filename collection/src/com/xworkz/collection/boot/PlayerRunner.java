package com.xworkz.collection.boot;

public class PlayerRunner {

	public static void main(String[] args) {
		Player player = (name, state) -> {
			System.out.println("name is in uppercase :" + name.toUpperCase());
			System.out.println("name is in lowercase :" + name.toLowerCase());
			System.out.println("Name :" + name + "]  [State :" + state);
			return null;
		};
		PlayerUtil.test(player);
	}

}

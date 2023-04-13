package com.xworkz.collection.boot;

public class PlayerRunner {

	public static void main(String[] args) {
		Player player = (name, state) -> {

			return name;
		};

		Player player1 = (name, state) -> {

			return name.toLowerCase();
		};

		Player player2 = (name, state) -> {

			return name.toUpperCase();
		};
	
		
		PlayerUtil.test(player);
		PlayerUtil.test(player1);
		PlayerUtil.test(player2);
	}
}

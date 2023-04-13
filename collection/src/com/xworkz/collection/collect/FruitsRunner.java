package com.xworkz.collection.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import javax.swing.plaf.FontUIResource;

public class FruitsRunner {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Pomogranet");
		fruits.add("WaterMelan");
		fruits.add("Chikku");
		fruits.add("Mustord Apple");
		fruits.add("Amla");
		fruits.add("Grapes");
		fruits.add("Mango");
		fruits.add("Cherry");
		fruits.add("Pappaya");
		fruits.add("Lemon");
		fruits.add("Mulberry");
		fruits.add("Strabbery");
		fruits.add("DryFruites");
		fruits.add("Dates");
		fruits.add("Anjur");
		fruits.add("pineapple");
		fruits.add("Peach");
		fruits.add("Plum");
		fruits.add("Kiwi");
		fruits.add("CustardApple");
		fruits.add("Coconut");
		fruits.add("Apple");
		fruits.add("Banana");

		System.out.println("Printing total     ===");
		System.out.println("total elements are :" + fruits.size());
		System.out.println("Printing in upperCase     ========");
		fruits.stream().map(ele -> ele.toUpperCase()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("Fruites length < 5 .....");
		fruits.stream().filter(ele -> ele.length() < 5).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("Fruits length >5  ......");
		fruits.stream().filter(ele -> ele.length() > 5).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("Collecting Fruits length >10 & <15...");
		fruits.stream().filter(e -> e.length() > 10 && e.length() < 15).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

	}

}

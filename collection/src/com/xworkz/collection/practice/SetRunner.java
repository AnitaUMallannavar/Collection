package com.xworkz.collection.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

public class SetRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("aaaaa");
		names.add("aaaaa");
		names.add("bbbbb");
		names.add("Shubhangi");
		names.add("Akahata");
		names.add("Pallavi");
		names.add("Rajeshwari");
		names.add("Yellu");

		System.out.println("total names in list:" + names.size());
		names.stream().collect(Collectors.toList()).forEach(e -> System.out.println(e));

		Set<String> name = names.stream().collect(Collectors.toSet());
		System.out.println("total names in set" + name.size());
		name.forEach(e -> System.out.println(e));
		System.out.println("3rd index................");
		String ref=names.get(3);
		System.out.println(ref);
		
		System.out.println("addAll...............");
		
		ListIterator<String> listnames=names.listIterator(3);
		while (listnames.hasNext()) {
		listnames.hasPrevious();
			
			
		}
	}

}

package com.xworkz.collection.thing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class PoliticalParty {

	public static void main(String[] args) {

		Collection<String> party = new ArrayList<String>();

		party.add("Bjp");
		party.add("Congres");
		party.add("Jds");
		party.add("Aap");
		party.add("Upp");

		party.forEach(e -> System.out.println(e));
		System.out.println("=====================");
		party.stream().map(ref -> ref.toUpperCase()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

		party.stream().filter(ref -> ref.length() < 2 && !ref.isBlank()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

		Collection<String> parties = new ArrayList<String>();
		for (String loc : parties) {
			System.out.println(loc.toUpperCase());
		}
		System.out.println("it is other collection =========");

		Collection<Double> percentage = new ArrayList<Double>();
		percentage.add(56.32);
		percentage.add(66.32);
		percentage.add(36.32);
		percentage.add(76.32);
		percentage.add(86.32);
		percentage.add(96.32);

		System.out.println(percentage);
		percentage.stream().filter(ref -> ref < 70).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
		System.out.println("only filter=====");
		System.out.println("percentage <70");
		percentage.stream().filter(ref -> ref < 70).forEach(ele -> System.out.println(ele));
		System.out.println("percentage >70");
		percentage.stream().filter(ele -> ele > 70).collect(Collectors.toList()).forEach(e -> System.out.println(e));
	}

}

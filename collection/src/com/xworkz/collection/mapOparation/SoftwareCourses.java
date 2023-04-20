package com.xworkz.collection.mapOparation;

import java.util.HashMap;
import java.util.Map;

public class SoftwareCourses {

	public static void main(String[] args) {

		Map map = new HashMap<>();
		map.put(1.1, "Software Engineer");
		map.put(2.2, "Computer Programing");
		map.put(3.3D, "ComputerScience");
		map.put(4.4, "Computer security");
		map.put(5.5, "Web design");
		map.put(6.6, "Artificial Intelligence");
		map.put(7.7, "Software Testing");
		map.put(8.8, "Web development");
		map.put(9.9, "Mobile Application development");
		map.put(10.0, "Machine Learning");
		System.out.println(map);
		System.out.println("1>remove method........");
		map.remove(3.3);
		System.out.println(map);
		map.remove(10.0, "Machine Learning");
		System.out.println(map);
		System.out.println("2>replace method......");
		map.replace(8.8, "ComputerScience");
		System.out.println(map);
		map.replace(5.5, "Web design", "Computer security");
		System.out.println(map);
		System.out.println("3>keySet method......");
		System.out.println(map.keySet());
		System.out.println("4>values method.....");
		System.out.println(map.values());
		System.out.println("5>clear method");
		map.clear();
		System.out.println(map);
	}

}

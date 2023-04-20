package com.xworkz.collection.mapOparation;

import java.util.HashMap;
import java.util.Map;

public class ProductDetails {

	public static void main(String[] args) {
		Map map=new HashMap<>();
		System.out.println("Camera details.....");
		map.put(1,"Canon");
		map.put(2, "Lens Mount");
		map.put(3, "Remote Control senser");
		map.put(4, "Shutter Button");
		map.put(5, "Lens Mount");
		map.put(6, "Clear Pictur");
		map.put(null, "Flash-sync Contacts");
		map.put(7, "Self-time Lamp");
		map.put(8, "Flash-sync Contacts");
		map.put(8, "EF lens Mount index");
		map.put(9, "Built-in-Flash");
		map.put(10, "Good Brand");
		System.out.println(map);
		System.out.println("remove method......");
		map.remove(8);
		System.out.println(map);
		map.remove(5, "Lens Mount");
		System.out.println(map);
		System.out.println("keySet Method.....");
		
		System.out.println(map.keySet());
		System.out.println("value Method.....");
		System.out.println(map.values());
		System.out.println("replace method...........");
		map.replace(7,"Lens Mount");
		System.out.println(map);
		map.replace(1, "Canon", "Sony");
		System.out.println(map);

	}

}

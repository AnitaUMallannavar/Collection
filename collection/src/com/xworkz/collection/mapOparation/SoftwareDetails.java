package com.xworkz.collection.mapOparation;

import java.util.HashMap;
import java.util.Map;

public class SoftwareDetails {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		System.out.println("Types of Softwares");
		map.put(1, "Application Stwr");
		map.put(2, "System Stwr");
		map.put(3, "Programing Stwr");
		map.put(4, "Middleware");
		map.put(5, "Driver Stwr");
		map.put(6, "Freeware");
		map.put(7, "Open Source Stwr");
		map.put(8, "Shareware");
		map.put(9, "Utility Stwr");
		map.put(10, "System Stwr");
		System.out.println(map);
		System.out.println("remove Method");
		map.remove(10);//
		System.out.println(map);
		// System.out.println(map.remove(10));
		System.out.println("keyset  Method.....");
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println("replace method....");
		map.replace(4, "Freeware");
		System.out.println(map);
		map.replace(9, "Utility Stwr", "\"Utility Stwr\"");
		System.out.println(map);
		map.clear();
		System.out.println(map);

	}

}

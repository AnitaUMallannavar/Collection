package com.xworkz.collection.mapOparation;

import java.util.HashMap;
import java.util.Map;

public class Company {

	public static void main(String[] args) {
      System.out.println("Company names....");
      Map map=new HashMap<>();
      map.put(1, "Wipro");
      map.put(2, "Infosys");
      map.put(3, "TCS");
      map.put(4, "Capgemini");
      map.put(5, "Nextbrain");
      map.put(6, "Sentient Gaming");
      map.put(7, "Perint");
      map.put(8, "MINNIONS TECH");
      map.put(9, "Friendzion Technologies");
      map.put(10, "Hudson Agile Ventures Pvt Ltd");
      System.out.println(map);
      System.out.println("remove methods....");
      map.remove(9);
      System.out.println(map);
      map.remove(6, "Sentient Gaming");
      System.out.println(map);
      System.out.println("replace methods........");
      map.replace(8, "Perint");
      System.out.println(map);
      map.replace(3, "TCS","Infosys");
      System.out.println(map);
      System.out.println("Keyset method........");
      System.out.println(map.keySet());
      System.out.println("values method........");
      System.out.println(map.values());
      System.out.println("clear method........");
      map.clear();
      System.out.println(map);
      
      
      
      
	}

}

package com.xworkz.collection.mapOparation;

import java.util.HashMap;
import java.util.Map;

public class Malls {

	public static void main(String[] args) {
      Map map=new HashMap<>();
      map.put(1, "GT World Mall");
      map.put(2, "Mantri Square Mall");
      map.put(3, "ETA Namma Mall");
      map.put(4, "Orion Mall");
      map.put(5, "Golden Heights");
      map.put(6, "Mantri");
      map.put(7, "Bangalore Central");
      map.put(8, "Sangam Mall");
      map.put(9, "Lulu Mall Bengaluru");
      map.put(10, "SJR Kalpana Mall ");
      map.put(11, "UB City");
      System.out.println(map);
      System.out.println("remove Methods.....");
      map.remove(4);
      System.out.println(map);
      map.remove(7, "Bangalore Central");
      System.out.println(map);
      System.out.println("replace methods......");
      map.replace(3, "Mantri");
      System.out.println(map);
      map.replace(5, "Golden Heights","Orion Mall");
      System.out.println(map);
      System.out.println("keySet method");
      System.out.println(map.keySet());
      System.out.println("values methods.....");
      System.out.println(map.values());
      System.out.println("clear method....");
      map.clear();
      System.out.println(map);
	}

}

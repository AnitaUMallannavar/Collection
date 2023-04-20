package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.GroceryDTO;

public class GroceryRunner {

	public static void main(String[] args) {
		Set<GroceryDTO> groceries = new HashSet<GroceryDTO>();
		groceries.add(new GroceryDTO(111, "Tomato", 45.45D, 12.8F));
		groceries.add(new GroceryDTO(222, "Potato", 31.32D, 12.21F));
		groceries.add(new GroceryDTO(333, "Potato", 32.32D, 12.21F));
		groceries.add(new GroceryDTO(444, "Onion", 33.32D, 12.21F));
		groceries.add(new GroceryDTO(222, "Coriyandar", 32.32D, 12.21F));
		groceries.add(new GroceryDTO(222, "Cucumber", 32.32D, 12.21F));
		groceries.add(new GroceryDTO(222, "Capsicum", 32.32D, 12.21F));
		groceries.add(new GroceryDTO(222, "Brinjal", 32.32D, 12.21F));
		groceries.add(new GroceryDTO(222, "Brinjal", 32.32D, 12.21F));
		groceries.add(new GroceryDTO(222, "Tomato", 45.45D, 12.8F));
		groceries.add(new GroceryDTO(222, "Tomato", 45.45D, 12.8F));
		groceries.add(new GroceryDTO(222, "Tomato", 45.45D, 12.8F));
        
		
		System.out.println(groceries.size()); //09
		groceries.forEach(r -> System.out.println(r));
		System.out.println("Converting set to List....===============================");
		
		
		List<GroceryDTO> listGroceries = groceries.stream().collect(Collectors.toList());
		System.out.println("                      ");
		System.out.println(" Foreach for list..=========== ");
		listGroceries.forEach(e -> System.out.println(e));
		System.out.println("                 ");
		System.out.println(" getting 6th index.....======");
		GroceryDTO getindex6 = listGroceries.get(6);
		System.out.println(getindex6);

		System.out.println("                    ");
		System.out.println("remove method.........");
		listGroceries.remove(2);
		listGroceries.forEach(e -> System.out.println(e));
		System.out.println("                  ");
		System.out.println(" set method ..===============");
		listGroceries.set(6, new GroceryDTO(312, "Onion", 32D, 20F));
		listGroceries.forEach(e -> System.out.println(e));

		System.out.println("                  ");
		System.out.println("iterator from reverse direction...=====");

		ListIterator<GroceryDTO> listIterator = listGroceries.listIterator(7);
		while (listIterator.hasPrevious()) {
			GroceryDTO bToT = listIterator.previous();
			System.out.println(bToT);

		}

		System.out.println("                  ");
		System.out.println("addAll by index..............=================");
		List<GroceryDTO> listGroceries2 = new ArrayList<GroceryDTO>();
		listGroceries2.add(new GroceryDTO(666, "Karilieves", 2d, 3f));
		listGroceries2.add(new GroceryDTO(55, "Ginger", 2d, 3f));
		listGroceries2.add(new GroceryDTO(44, "Radish", 2d, 3f));
		listGroceries2.add(new GroceryDTO(33, "Pumkin", 2d, 3f));
		listGroceries2.add(new GroceryDTO(22, "Capsikum", 2d, 3f));
		listGroceries2.add(new GroceryDTO(11, "Chilli", 2d, 3f));
		listGroceries2.add(new GroceryDTO(000, "Carret", 2d, 3f));

		listGroceries.addAll(5, listGroceries2);
		listGroceries.forEach(e -> System.out.println(e));

		/*
		 * List<GroceryDTO> listGroceries3 = new ArrayList<GroceryDTO>();
		 * listGroceries3.addAll(0, listGroceries2); listGroceries3.addAll(1,
		 * listGroceries);
		 */
		//listGroceries3.forEach(e -> System.out.println(e));
	}

}

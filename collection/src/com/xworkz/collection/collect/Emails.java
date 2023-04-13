package com.xworkz.collection.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Emails {

	public static void main(String[] args) {
		Collection<String> emails = new ArrayList<String>();
		emails.add("akshata@gmail.com");
		emails.add("anita@gmail.com");
		emails.add("shubhangi@gmail.com");
		emails.add("asha@gmail.com");
		emails.add("ashwini@gmail.com");
		emails.add("ambarishKhan@gmail.com");
		emails.add("akash@outlook.com");
		emails.add("ambika@outlook.com");
		emails.add("arushii@outlook.com");
		emails.add("aryan@outlook.com");
		emails.add("arpita@outlook.com");
		emails.add("ashwita@outlook.com");
		emails.add("anitashetty@yahoo.com");
		emails.add("arushii@yahoo.com");
		emails.add("arvind@yahoo.com");
		emails.add("avinash@yahoo.com");
		emails.add("aruna@xworkz.com");
		emails.add("arun@xworkz.com");
		emails.add("abhishekKhan@xworkz.com");
		emails.add("amrutashetty@xworkz.com");
		emails.add("anilshetty@xworkz.com");
		emails.add("ankita@xworkz.com");
		emails.add("anjali@xworkz.com");
		emails.add("abhinav@xworkz.com");
		emails.add("abhay@xworkz.com");
		emails.add("adharsh@xworkz.com");
		emails.add("ashwinishetty@xworkz.com");
		emails.add("abhishekKhan@xworkz.com");
		emails.add("abhishekKhan@xworkz.com");

		System.out.println("total :" + emails.size());
		System.out.println("All emails in upperCase...........");
		emails.stream().map(ele -> ele.toUpperCase()).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("emails ends with xworkz........");
		emails.stream().filter(ele -> ele.endsWith("xworkz.com")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("Emails with gmails............");
		emails.stream().filter(ele -> ele.endsWith("gmail.com")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
        
		System.out.println("printing emails which is not gmail & xworkz.........");
		emails.stream().filter(ele -> !ele.endsWith("xworkz.com") && !ele.endsWith("gmail.com"))
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));
	}

}

package com.xworkz.collection.practice;

public class FinallyBlockException {

	public static void main(String[] args) {
      int s[]= new int[2];
      try {
		System.out.println("access 3rd index values :"+s[3]);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
      finally {
		s[2]=4;
		System.out.println("accessing 4th index element:"+s[2]);
		System.out.println("Finally block is executed");
	}
	}

}

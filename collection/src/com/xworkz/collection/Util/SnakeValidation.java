package com.xworkz.collection.Util;

public class SnakeValidation {
	
	private SnakeValidation() {
		
	}
      public static boolean validString(String value) {
    	  if(value!=null &&!value.isEmpty()&&value.length()>2&&value.length()<30) {
    		  return true;
    	  } 
    	  return false;
      }
      
      
      public static boolean validId(double id) {
    	  if(id>0&& id<100000) {
    		  return true;
    	  }
    	  return false;
      }
      
      public static boolean validFlag(boolean... flags) {
    	  for(int index=0;index<flags.length;index++) {
    		  boolean element=flags[index];
    		  if(!element) {
    			  System.out.println("invalid element at index"+index);
    			  return false;
    		  }
    	  }
		return true;  
      }
     
}

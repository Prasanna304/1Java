/*
  
 * Array is a fixed length data structure whereas ArrayList is a variable length Collection class. 
 * We cannot change length of array once created in Java but ArrayList can be changed.
 * We cannot store primitives in ArrayList, it can only store objects. 
 * But array can contain both primitives and objects in Java.
 
 */


package b_List_Array;

import java.util.ArrayList;

public class A_ArrayListTest {

	public static void main(String[] args) {
		
		// Generic 
		// Can allow all datatype
		ArrayList a= new ArrayList();
		
		// Specific
		// Specific string only used
		ArrayList<String> b = new ArrayList<String>();
	}

}

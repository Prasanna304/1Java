package b_List_Array;

import java.util.ArrayList;

public class C_ArrayListCapacityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("aa");
		a.add("ab");
		a.add("ac");
		a.add("ad");
		int i = a.size();
		System.out.println("Capacity is "+i);
	}

}
package b_List_Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class J_ArrayListSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("ad");
		a.add("aa");
		a.add("ac");
		a.add("ab");
		for(int i=0;i<a.size();i++)
			System.out.println("Before Sort "+a.get(i));
		Collections.sort(a);
		for(int i=0;i<a.size();i++)
			System.out.println("After Sort "+a.get(i));
	}

}
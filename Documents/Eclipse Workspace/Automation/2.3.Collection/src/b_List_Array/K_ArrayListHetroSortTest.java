package b_List_Array;

import java.util.ArrayList;
import java.util.Collections;

public class K_ArrayListHetroSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("Prasanna");
		a.add(1);
		a.add('a');
		a.add(true);
		a.add(1.5);
		for(int i=0;i<a.size();i++)
			System.out.println("Before Sort "+a.get(i));
		Collections.sort(a);	//Shows exception
		for(int i=0;i<a.size();i++)
			System.out.println("After Sort "+a.get(i));
	}

}

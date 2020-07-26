package b_List_Array;

import java.util.ArrayList;

public class I_ArrayListAddAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("aa");
		a.add("ab");
		a.add("ac");
		a.add("ad");
		for (int i = 0; i < a.size(); i++)
			System.out.println("Before A " + a.get(i));
		ArrayList b = new ArrayList();
		b.add("ba");
		b.add("bb");
		b.add("bc");
		b.add("bd");
		for (int i = 0; i < a.size(); i++)
			System.out.println("Before B " + b.get(i));
		a.addAll(b);
		for (int i = 0; i < a.size(); i++)
			System.out.println("After A " + a.get(i));
			
		System.out.println("After A " + a); // prints entire arraylist
	}

}

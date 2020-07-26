package b_List_Array;

import java.util.ArrayList;

public class H_ArrayListReverseIndexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("aa");
		a.add("ab");
		a.add(3,"ac");	//shows exception because of index3 not fount
		a.add(2, "ad");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}

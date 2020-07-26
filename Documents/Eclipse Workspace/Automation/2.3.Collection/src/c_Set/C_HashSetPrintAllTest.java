package c_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C_HashSetPrintAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		//HashSet s= new HashSet(); //both can be used
		s.add("d");
		s.add("b");
		s.add("c");
		s.add("a");
		Iterator it=s.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}

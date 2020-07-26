package c_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class B_HashSetExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		//HashSet s= new HashSet(); //both can be used
		s.add("d");
		s.add("b");
		s.add("c");
		s.add("a");
		Iterator it=s.iterator(); //to place the pointer in the set
		System.out.println(it.hasNext()); // to checks for value i.e true or false
		System.out.println(it.hasNext());
		System.out.println(it.hasNext());
		System.out.println(it.hasNext());
		System.out.println(it.hasNext()); // Doesnot ove stay in same place so no exception
		
		System.out.println(it.next());	// to shows the value
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next()); // Exceptions
	}

}

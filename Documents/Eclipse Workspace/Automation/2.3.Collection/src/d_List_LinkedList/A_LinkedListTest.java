package d_List_LinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class A_LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList s = new LinkedList();
		s.add("d");
		s.add("b");
		s.add("c");
		s.add("a");
		Iterator it=s.iterator(); //to place the pointer in the set
		System.out.println(it.hasNext()); // to checks for value i.e true or false
		System.out.println(it.next());	// to shows the value
	}

}

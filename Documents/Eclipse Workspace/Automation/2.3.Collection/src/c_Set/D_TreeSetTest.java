package c_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class D_TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Set s = new HashSet();
				//HashSet s= new HashSet(); //both can be used
				TreeSet s = new TreeSet();
				s.add("d");
				s.add("b");
				s.add("c");
				s.add("a");
				Iterator it=s.iterator(); //to place the pointer in the set
				//System.out.println(it.hasNext()); // to checks for value i.e true or false
				//System.out.println(it.next());	// to shows the value
				while(it.hasNext())
					System.out.println(it.next());
	}

}

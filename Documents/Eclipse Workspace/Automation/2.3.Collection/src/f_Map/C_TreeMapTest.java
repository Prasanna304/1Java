package f_Map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class C_TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap map = new TreeMap();
		map.put("username", "abc");
		map.put("password", "123");
		map.put("domain", "testing");
		map.put("company", "xyz");
		//map.put(null, "xyz"); // null key is not allowed
		map.put("email",null);
		// System.out.println(map.get("username"));

		Set s = map.keySet();
		Iterator it = s.iterator();
		// Iterator it = map.keySet().iterator(); // this can also be used
		while (it.hasNext() == true) {
			// System.out.println(it.next());
			String key = (String) it.next();
			System.out.println(key + "---" + map.get(key));
		}
	}

}
package f_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class A_HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("username", "abc");
		map.put("password", "123");
		map.put("domain", "testing");
		map.put("company", "xyz");
		map.put(null, "xyz");
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

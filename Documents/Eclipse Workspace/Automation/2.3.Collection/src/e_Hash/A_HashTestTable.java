package e_Hash;

import java.util.Enumeration;
import java.util.Hashtable;

public class A_HashTestTable {

	public static void main(String[] args) {
		
		Hashtable table =new Hashtable();
		// ("key","value") 
		table.put("username", "abc");
		table.put("password", "123");
		table.put("domain", "testing");
		table.put("company", "abc");
		//System.out.println(table.get("username")); => shows abc
		
		// Enumurator to store the key
		Enumeration e = table.keys();
		//System.out.println(e.hasMoreElements());	//True
		//System.out.println(e.nextElement());	//Any key can shown because of hash
		/* Comment because to show casting
		 while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		*/
		//e.nextElement();	//returns object
		//string key=e.nextElement(); //shows error because try to store obj in string
		// casting
		String key =(String) e.nextElement();
		System.out.println(key); //prints random keys
		System.out.println(key+"---"+table.get(key));
	}

}
package a_StringLiterals;

public class A_StringLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String literals
		String a = "abc";
		String b = "abc";
		//String Objects
		String c = new String ("abc");
		String d = new String ("abc");
		System.out.println(a==b);	//	Compare literals memory so true
		System.out.println(b==c);	//  compare litrals and obj memory so false
		System.out.println(c==d);	//	compare obj memory so false
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(c));
		System.out.println(c.compareTo(d));
	}

}

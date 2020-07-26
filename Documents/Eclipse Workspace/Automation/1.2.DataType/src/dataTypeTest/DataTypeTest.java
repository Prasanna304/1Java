/*
 * DataTypes are two types
 * 		1. Primitive data type 
 * 				1. Key level (int, char, boolean, float, double)
 * 				2. class level (Integer, Character, String, Boolean, Float, Double)
 * 		2. Reference data type
 * 				1. object reference
 * 				2. collection reference
 * 				3. array reference
 */		

package dataTypeTest;

public class DataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int j=2;
		// int k=a; shows error
		int k='a'; //ascii value i.e,97
		//int l="a"; shows error
		char a=1; //non readable
		char b='1';
		char c='2';
		String s="abc";
		boolean t=true;
		double u=2.345;
		
		int d=b+c;
		//char e=b+c; shows error
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		
		System.out.println();
		System.out.println(1+1);
		System.out.println(1+"1");
		System.out.println(1+1+"1");
		System.out.println(1+"1"+1);
		System.out.println(1+"1"+1+1);
		System.out.println(1+"1"+(1+1)); //BODMAS
		
	}

}

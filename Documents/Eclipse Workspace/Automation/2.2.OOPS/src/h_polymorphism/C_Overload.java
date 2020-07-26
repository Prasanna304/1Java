/*
 
 * Different between parameter and argument
 			* parameter add(int 1 , int j) -> passing declaration
 			* argument add(1,1) -> Passing value
  
 */

package h_polymorphism;

public class C_Overload {

	public static void main(String[] args) {
		
		add(1,2);
		add(1,2,3);

	}
	
	public static void add(int i, int j) {	
		int k = i+j;
		System.out.println(k);
	}
	
	public static void add(int i, int j, int k) {
		int l = i+j+k;
		System.out.println(l);
	}
}

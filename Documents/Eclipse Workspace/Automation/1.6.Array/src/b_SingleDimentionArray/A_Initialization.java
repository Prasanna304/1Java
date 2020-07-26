/*
 * Syntax to Declare an Array in Java
 * 		dataType[] arr; (or)  
 * 		dataType []arr; (or)  
 * 		dataType arr[];  
 * 
 * Instantiation of an Array in Java
 * 		arrayRefVar=new datatype[size];  
 */

package b_SingleDimentionArray;

public class A_Initialization {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}

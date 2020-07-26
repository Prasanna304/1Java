/*
 * In fibonacci series, next number is the sum of previous two numbers 
 * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
 * The first two numbers of fibonacci series are 0 and 1.
 */

package basicJavaPrograms;

public class A_FibonacciSeries {

	public static void main(String[] args) 
	{
		int i=0;
		int j=1;
		int k;
		System.out.println(i);
		System.out.println(j);
		for(int l=0;l<10;l++)
		{
			k=i+j;
			System.out.println(k);
			i=j;
			j=k;		
		}
	}
}
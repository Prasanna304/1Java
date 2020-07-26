/*
 * If you don't use any modifier, it is treated as default by default. 
 * The default modifier is accessible only within package. 
 * It cannot be accessed from outside the package. 
 * It provides more accessibility than private. 
 * But, it is more restrictive than protected, and public.
 */

package c_AccessModifier_Default;

class test
{  
	int data=40;  
	void msg()
	{
		System.out.println("Hello java");
		System.out.println(data);
	}  
}  

public class DefaultClassTest {
	static int data1=40;  
	static void main(String[] args) 
	{
		test obj=new test();  
		System.out.println(obj.data); 
		obj.msg();
		
		msg1();
		System.out.println(data1);
	}
	static void msg1()
	{
		System.out.println("Hello java");
		System.out.println(data1);
	} 
}
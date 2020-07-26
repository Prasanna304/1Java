/*
 * The access level of a protected modifier is within the package and outside the package through child class. 
 * If you do not make the child class, it cannot be accessed from outside the package.
 * The protected access modifier is accessible within package and outside the package but through inheritance only.
 * The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
 * It provides more accessibility than the default modifer.
 */

package d_AccessModifier_Protected;

class test
{  
	protected int data=40;  
	protected void msg()
	{
		System.out.println("Hello java");
		System.out.println(data);
	}  
}  

public class ProtectedClassTest {
	protected static int data1=40;  
	protected static void main(String[] args) 
	{
		test obj=new test();  
		System.out.println(obj.data); 
		obj.msg();
		
		msg1();
		System.out.println(data1);
	}
	protected static void msg1()
	{
		System.out.println("Hello java");
		System.out.println(data1);
	} 
}
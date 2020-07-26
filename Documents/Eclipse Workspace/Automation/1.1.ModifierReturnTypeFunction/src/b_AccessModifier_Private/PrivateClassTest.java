//The private access modifier is accessible only within the class.

package b_AccessModifier_Private;

class test
{  
	private int data=40;  
	private void msg()
	{
		System.out.println("Hello java");
		System.out.println(data);
	}  
}  

public class PrivateClassTest {
	private static int data1=40;  
	public static void main(String[] args) 
	{
		test obj=new test();  
		//Compile Time Error can't access private access modifier in another class
		//System.out.println(obj.data); 
		//obj.msg();
		
		// Shows output because private access modifier can use inside the class
		msg1();
		// Shows output because private access modifier can use inside the class
		System.out.println(data1);
	}
	private static void msg1()
	{
		System.out.println("Hello java");
		// Shows output because private access modifier can use inside the class
		System.out.println(data1);
	} 
}
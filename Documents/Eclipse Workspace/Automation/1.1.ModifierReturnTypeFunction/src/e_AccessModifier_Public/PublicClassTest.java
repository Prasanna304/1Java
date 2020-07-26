/*
 * The public access modifier is accessible everywhere.
 * It has the widest scope among all other modifiers.
 */



package e_AccessModifier_Public;


/* If .java file contains top level (not nested) public class, 
it have same name as that public class. 
So if you have class like public class A{...} it needs to be placed in A.java file. 
Because of that we can't have two public classes in one .java file.
*/

/*
public class test
{  
	public int data=40;  
	public void msg()
	{
		System.out.println("Hello java");
		System.out.println(data);
	}  
}  
*/
class test
{  
	public int data=40;  
	public void msg()
	{
		System.out.println("Hello java");
		System.out.println(data);
	}  
}  

public class PublicClassTest {
	public static int data1=40;  
	public static void main(String[] args) 
	{
		test obj=new test();  
		System.out.println(obj.data); 
		obj.msg();
		
		msg1();
		System.out.println(data1);
	}
	public static void msg1()
	{
		System.out.println("Hello java");
		System.out.println(data1);
	} 
}
/*
 * A variable is a container which holds the value while the Java program is executed.
 * A variable is assigned with a data type.
 * Variable is a name of memory location. 
 * There are three types of variables in java: local, instance and static.
 * There are two types of data types in Java: primitive and non-primitive.
 * There are three types of variables in Java:
 			* local variable
 			* instance variable
 			* static variable
 * Local Variable: 
 		* A variable declared inside the body of the method is called local variable.
 		* You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
 		* A local variable cannot be defined with "static" keyword.
 * Instance Variable
 		* A variable declared inside the class but outside the body of the method, is called instance variable.
 		* It is not declared as static.
 		* It is called instance variable because its value is instance specific and is not shared among instances.
 * Static variable
 		* A variable which is declared as static is called static variable.
 		* It cannot be local.
 		* You can create a single copy of static variable and share among all the instances of the class.
 		* Memory allocation for static variable happens only once when the class is loaded in the memory.
 */
package variableTest;

public class VariableTest 
{
	int instance_variable=50;//instance variable  
	static int static_variable=100;//static variable  
	public void method() 
	{
		int local_variable=90;//local variable  
		System.out.println(local_variable);
		System.out.println(static_variable);
		System.out.println(instance_variable);
	}
	public static void methodToMain() 
	{
		int local_variable=900;//local variable  
		System.out.println(local_variable);
		System.out.println(static_variable);
	}
	public static void main(String[] args) 
	{
		//method() => Non static mathod can't able to call inside static method
		methodToMain();
		int local_variable_1=90;//local variable  
		System.out.println(local_variable_1);
		System.out.println(static_variable);
		//System.out.println(local_variable); => local_variable cannot be resolved to a variable
		//System.out.println(instance_variable); => Cannot make a static reference to the non-static field instance_variable
	}
}
package c_AccessModifier_Default;
import c_AccessModifier_Default.DefaultClassTest;

public class DefaultClassTest1 {
	public static void main(String[] args) 
	{
		test obj = new test();
		//Compile Time Error
		//is Default access modifier we can't access it in another java file inside the package
		//msg();
		obj.msg();  
	}
}

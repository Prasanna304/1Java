package b_AccessModifier_Private;
import b_AccessModifier_Private.PrivateClassTest;

public class PrivateClassTest1 {
	public static void main(String[] args) 
	{
		test obj = new test();
		//Compile Time Error
		//msg() is private access modifier we can't access it in another java file inside the package
		//obj.msg();  
	}
}

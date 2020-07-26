package d_AccessModifier_Protected;
import c_AccessModifier_Default.DefaultClassTest;

public class ProtectedClassTest1 {
	protected static void main(String[] args) 
	{
		test obj = new test();
		//Compile Time Error
		//is Default access modifier we can't access it in another java file inside the package
		//msg();
		obj.msg();  
	}
}

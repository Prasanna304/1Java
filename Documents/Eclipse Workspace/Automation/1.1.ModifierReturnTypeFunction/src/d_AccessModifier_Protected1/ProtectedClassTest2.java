package d_AccessModifier_Protected1;

import d_AccessModifier_Protected.*;

public class ProtectedClassTest2 extends ProtectedClassTest{

	protected static void main(String[] args) {
		ProtectedClassTest obj = new ProtectedClassTest();
		//Compile Time Error
		//msg() is Default access modifier we can't access it in another java file inside the package
		obj.msg1(); 
	}
}
package c_AccessModifier_Default1;

import c_AccessModifier_Default.*;

public class DefaultClassTest2 extends DefaultClassTest{

	public static void main(String[] args) {
		//test obj = new test();
		//Compile Time Error
		//msg() is Default access modifier we can't access it in another java file inside the package
		//obj.msg(); 
	}
}
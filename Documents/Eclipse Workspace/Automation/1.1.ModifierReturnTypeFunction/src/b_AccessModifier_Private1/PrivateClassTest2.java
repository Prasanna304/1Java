package b_AccessModifier_Private1;

import c_AccessModifier_Default.DefaultClassTest;

//test() is private we can't import
//import b_AccessModifier_Default.test;

public class PrivateClassTest2 extends DefaultClassTest{

	public static void main(String[] args) {
		//test obj = new test();
		//Compile Time Error
		//is private access modifier we can't access it in another java file inside the package
		//msg();
		//obj.msg(); 
	}
}
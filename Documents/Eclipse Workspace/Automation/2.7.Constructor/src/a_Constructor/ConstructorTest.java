package a_Constructor;

public class ConstructorTest {
public static int i=1;
public static int j=2;
public static int a=3;
public static int b=4;

/*
 public static void add(){}//no error
 static void add(){}//no error
 void add(){}//no error
 add(){}//shows error to change it as constructor*/

// Constructor initialise the local variable assign the value for global value
ConstructorTest(){}//add changed into class name


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = i+j;//colour changed because its a global variable
		System.out.println(k);
		int a=5;
		int b=6;
		int c=a+b; // colour is black because it point local variable
		System.out.println(c);
	}

}

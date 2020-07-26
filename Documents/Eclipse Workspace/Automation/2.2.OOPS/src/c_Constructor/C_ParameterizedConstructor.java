package c_Constructor;

public class C_ParameterizedConstructor {

	 int id;  
	 String name;  
	 //creating a parameterised constructor  
	 C_ParameterizedConstructor(int i,String n){  
		 id = i;  
		 name = n;  
	 }
	 
	 //method to display the values  
	 void display(){
		 System.out.println(id+" "+name);
	 }
	 
	public static void main(String[] args) {
		//creating objects and passing values  
		C_ParameterizedConstructor s1 = new C_ParameterizedConstructor(111,"Karan");  
		C_ParameterizedConstructor s2 = new C_ParameterizedConstructor(222,"Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	}

}

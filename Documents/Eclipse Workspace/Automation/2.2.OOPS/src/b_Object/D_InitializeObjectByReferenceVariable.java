package b_Object;

class Std{  
	 int id;  
	 String name;  
}  

public class D_InitializeObjectByReferenceVariable {

	public static void main(String[] args) {
		//Creating objects  
		Std s1=new Std();  
		Std s2=new Std();  
		//Initialising objects  
		s1.id=101;  
		s1.name="Sonoo";  
		s2.id=102;  
		s2.name="Amit";  
		//Printing data  
		System.out.println(s1.id+" "+s1.name); //printing members with a white space 
		System.out.println(s2.id+" "+s2.name);  	
	}

}

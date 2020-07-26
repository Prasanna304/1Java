package c_Constructor;

public class E_CopyConstructor {
	
	 int id;  
	 String name;  
	 //constructor to initialize integer and string  
	 E_CopyConstructor(int i,String n){  
		 id = i;  
		 name = n;  
	 }  
	 //constructor to initialize another object  
	 E_CopyConstructor(E_CopyConstructor s){  
		 id = s.id;  
		 name =s.name;  
	 }  
	 void display(){
		 System.out.println(id+" "+name);
	 }  

	public static void main(String[] args) {
		
		E_CopyConstructor s1 = new E_CopyConstructor(111,"Karan");  
		E_CopyConstructor s2 = new E_CopyConstructor(s1);  
	    s1.display();  
	    s2.display();  
	}

}

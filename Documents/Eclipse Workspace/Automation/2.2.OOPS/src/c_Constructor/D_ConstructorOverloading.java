package c_Constructor;

public class D_ConstructorOverloading {
	
	int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    D_ConstructorOverloading(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    D_ConstructorOverloading(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){
    	System.out.println(id+" "+name+" "+age);
    }   

	public static void main(String[] args) {
		
		D_ConstructorOverloading s1 = new D_ConstructorOverloading(111,"Karan");  
		D_ConstructorOverloading s2 = new D_ConstructorOverloading(222,"Aryan",25);  
	    s1.display();  
	    s2.display();  

	}

}

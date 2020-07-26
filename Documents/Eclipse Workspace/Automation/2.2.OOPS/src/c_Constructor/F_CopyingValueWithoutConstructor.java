package c_Constructor;

public class F_CopyingValueWithoutConstructor {
	
	int id;  
    String name;  
    
    F_CopyingValueWithoutConstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    F_CopyingValueWithoutConstructor(){}  
    
    void display(){
    	System.out.println(id+" "+name);
    }

	public static void main(String[] args) {
		
		F_CopyingValueWithoutConstructor s1 = new F_CopyingValueWithoutConstructor(111,"Karan");  
		F_CopyingValueWithoutConstructor s2 = new F_CopyingValueWithoutConstructor();  
	    s2.id=s1.id;  
	    s2.name=s1.name;  
	    s1.display();  
	    s2.display();  
	}

}

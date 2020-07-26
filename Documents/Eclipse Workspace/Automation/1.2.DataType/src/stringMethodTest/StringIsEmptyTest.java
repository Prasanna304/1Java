package stringMethodTest;

public class StringIsEmptyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3="";  
		String s4="javatpoint";  
		  
		System.out.println(s3.isEmpty());  
		System.out.println(s4.isEmpty());  
		
		String s1="";    
        String s2="Javatpoint";             
        // Either length is zero or isEmpty is true  
        if(s1.length()==0 || s1.isEmpty())  
            System.out.println("String s1 is empty");  
        else System.out.println("s1");        
        if(s2.length()==0 || s2.isEmpty())  
            System.out.println("String s2 is empty");  
        else System.out.println(s2);  
	}

}

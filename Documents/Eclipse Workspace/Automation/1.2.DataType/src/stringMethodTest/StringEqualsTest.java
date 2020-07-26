package stringMethodTest;

public class StringEqualsTest {
	public static void main(String[] args) {
		String input="Vcentry";
		String output="vcentry";
		System.out.println(input.equals(output));
		 
		
		if (input.equals(output)) {  
	            System.out.println("both strings are equal");  
	        }
		else 
			 System.out.println("both strings are unequal");  
		 
		input = "abcabcftagh";
		int count = 0;  
	    
		for (int i=0; i<=input.length()-1; i++) {  
			if(input.charAt(i) == 'a') {  
				count++;  
	        }  
	    }  
	    System.out.println("Frequency of a is: "+count); 
	}

}

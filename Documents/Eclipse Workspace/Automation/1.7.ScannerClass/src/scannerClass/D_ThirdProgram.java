package scannerClass;

import java.util.Scanner;

public class D_ThirdProgram {

	public static void main(String[] args) {
		String str = "Hello/This is scannerclass/To check delimiter";  
        //Create scanner with the specified String Object  
        Scanner scanner = new Scanner(str);  
        System.out.println("Boolean Result: "+scanner.hasNextBoolean());   
        System.out.println("hasNext Result: "+scanner.hasNext());
        System.out.println("hasNext Result: "+scanner.hasNext());
        //Change the delimiter of this scanner  
        scanner.useDelimiter("/");  
        //Printing the tokenized Strings  
        System.out.println("---Tokenizes String---");   
        while(scanner.hasNext())
        {  
        	System.out.println(scanner.next());  
        }  
        //Display the new delimiter  
        System.out.println("Delimiter used: " +scanner.delimiter());            
        scanner.close();  
    }    
}
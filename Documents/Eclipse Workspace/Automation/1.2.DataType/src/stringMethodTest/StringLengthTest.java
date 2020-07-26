package stringMethodTest;

public class StringLengthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Vcentry";
		System.out.println(input.length());
		String str = "Javatpoint";  
        if(str.length()>0) {  
            System.out.println("String is not empty and length is: "+str.length());  
        }  
        str = "";  
        if(str.length()==0) {  
            System.out.println("String is empty now: "+str.length());  
        }  
	}

}

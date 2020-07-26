package stringMethodTest;

public class StringReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Vmetry";
		System.out.println(input.replace("me", "cen"));
		
		String str = "oooooo-hhhh-oooooo";  
	    String rs = str.replace("h","s"); // Replace 'h' with 's'  
	    System.out.println(rs);  
	    rs = rs.replace("s","h"); // Replace 's' with 'h'  
        System.out.println(rs);
        
        String sent="My name is Khan. My name is isin. My name is Sonoo.";
		System.out.println(sent.replace("is", "was"));
		
	}

}

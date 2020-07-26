package stringMethodTest;

public class StringCharAtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Vcentry";
		//charAt(int index) index = 0 t0 n number if index = 2 print e
		System.out.println(input.charAt(2));
		System.out.println(input.charAt(7)); //shows exception because out of range
		
		int inputLength = input.length();
		System.out.println(input.charAt(inputLength-1));
	}
}

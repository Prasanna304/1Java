package stringMethodTest;

public class StringSubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Vcentry";
		System.out.println(input.substring(2));
		System.out.println(input.substring(1, 3)); //print only c and e does not include end
		System.out.println(input.substring(1, 10)); //Shows exception for index out of bound
	}

}

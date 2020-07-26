package stringMethodTest;

public class StringReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Vcentry";
		String output = "";
		String a;
		//for (int i=0;i<input.length();i++)
		//System.out.println(input.charAt(i));
		//for (int i=input.length();i>=0;i--) this shows error because input.length is 7 exists the index
		//	System.out.println(input.charAt(i));
		for (int i=input.length()-1;i>=0;i--) {
			//output=output.concat(input.charAt(i));
			a=input.charAt(i)+"";
			output=output.concat(a);
		}		
		System.out.println(output);
		System.out.println(input.equals(output));
	}

}

package stringMethodTest;

public class StringCompareTo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="avcentry";
		String output="vcentry";
		String output1="Avcentry";
		System.out.println(input.compareTo(output));
		System.out.println(input.compareToIgnoreCase(output1));
		System.out.println(output.compareTo(input));
	}

}

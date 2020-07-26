// It will just show true or false

package stringMethodTest;

public class StringContainsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Vcentry";
		System.out.println(input.contains("cen"));
		System.out.println(input.contains("cne"));//checks only sequence is present
		System.out.println(input.startsWith("Vce"));
		System.out.println(input.startsWith("ce"));//checks for starting
		System.out.println(input.startsWith("vce"));//case sensitive
		System.out.println(input.endsWith("try"));
		System.out.println(input.endsWith("tr"));//checks for ending so false		
	}

}

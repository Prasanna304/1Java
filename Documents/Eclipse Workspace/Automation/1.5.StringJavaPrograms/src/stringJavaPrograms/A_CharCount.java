// we need to count the number of characters present in the string

package stringJavaPrograms;

public class A_CharCount {

	public static void main(String[] args) {
		
		String a = "string to test";
		int count = 0;
		for(int i = 0; i<a.length(); i++)
		{
			if(a.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
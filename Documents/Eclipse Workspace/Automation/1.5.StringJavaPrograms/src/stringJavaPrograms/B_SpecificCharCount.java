package stringJavaPrograms;

public class B_SpecificCharCount {

	public static void main(String[] args) 
	{
		String a = "string! to! test!";
		int count = 0;
		for(int i = 0; i<a.length(); i++)
		{
			if(a.charAt(i) == '!')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

package a_ExceptionHandling;

public class G_TryCatchFinally {

	public static void main(String[] args) {
		
		try
		{
			int i=1/0; // Change 1/1 and run will only show logout
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Logout");
		}
	}

}

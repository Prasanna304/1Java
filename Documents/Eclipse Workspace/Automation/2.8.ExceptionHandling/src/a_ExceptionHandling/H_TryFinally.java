package a_ExceptionHandling;

public class H_TryFinally {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i=1/0;
		}
		finally
		{
			System.out.println("Logout");
		}
	}
}
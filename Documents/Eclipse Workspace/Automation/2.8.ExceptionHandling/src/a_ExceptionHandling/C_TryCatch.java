package a_ExceptionHandling;

public class C_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 1 / 0;
			System.out.println(i);
		} catch (ArithmeticException e)// e is a abj catch create it automatically
		{
			System.out.println("Alert: invaid input" + e.getMessage());
		}
		System.out.println("completed");
	}

}

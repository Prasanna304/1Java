package a_ExceptionHandling;

import java.util.Hashtable;

public class E_MultipleTryCatchWithDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Hashtable table =new Hashtable();
			table.put(null, null);
			int[] a = new int[2];
			a[0] = 10;
			a[1] = 10;
			a[2] = 10;
			a[3] = 10;
			int i = 1/0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println("alert"+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("alert"+e.getMessage());
		}
		catch(Exception e) {	//If i give general this exception in the first it shows error
								//Priority is first individual then generic
			System.out.println("Something Went Wrong");
		}
	}
}

package g_Abstract;

public abstract class B_RbiTest {
	
	/*
	public static void credit() {
		System.out.println("credit");
	}
	*/
	/*
	 * if i remove static and add abstract shows error in credit()
	 * Error shows remove abstract or method body
	 * So it becomes looks like interface
	 */
	
	// Looks like interface
	public abstract void credit();
	public abstract void debit();
	
	//Looks like Inheritance
	public static void loan() {
		System.out.println("loan");
	}
	public static void document() {
		System.out.println("document");
	}
}
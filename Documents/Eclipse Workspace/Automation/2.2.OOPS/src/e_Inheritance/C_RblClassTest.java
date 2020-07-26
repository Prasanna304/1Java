/*
 * World Bank test 	-> Remove static in debit
 * 					-> Shows error in RBI Test
 * 					-> Static calls static
 * 					-> To resolve crate object
 * 					-> So static is preferable
 */


package e_Inheritance;

public class C_RblClassTest extends B_WorldBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		credit();
		debit();
		eduloan();
	}
	public static void eduloan()
	{
		System.out.println("Eduloan");
	}

}

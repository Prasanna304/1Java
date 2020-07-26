/*
 * public class HdfcTest extends RblClassTest,Worldbanktest
 * 			 Shows error because multiple inheritance wont support
 * If i give Worldbanktest extends HdfcTest
 * 			Shows error because reverse hierarchy wont support 
 */

package e_Inheritance;

public class D_HdfcTest extends C_RblClassTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		credit();
		debit();
		eduloan();
		personalLoan();
	}
	public static void personalLoan()
	{
		System.out.println("Personal Loan");
	}

}

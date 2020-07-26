package i_Encapsulation;

public class B_EncapTest {

	// If you don't use private then no need of get function here you can comment it and test
	private int accno;
	private int amount;

	public void setaccno(int acc) {
		accno = acc; 
		// accno=acc;//local variable
	    // this.accno=acc;=>shows class's variable
		// super=>parrent class variable
	}

	public int getaccno() throws InterruptedException { // getaccno shows error if i did not add return stmt
		System.out.println("validating...");
		Thread.sleep(3000); // shows error =>to add => throws InterruptedException
		return accno;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		System.out.println("Validating");
		return amount;

	}

}
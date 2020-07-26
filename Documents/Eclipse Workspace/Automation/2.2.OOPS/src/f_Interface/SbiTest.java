package f_Interface;

public class SbiTest implements RbiTest{
	
	//SbiTest shows error -> cursor over -> Add unimplemented function -> Create functions automatically with @Override

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rbitest r=new Rbitest();
		//Shows error -> we didn't allow because it has only function name
		SbiTest s= new SbiTest();
		RbiTest r= new SbiTest();
		
		// All the functions are visible to this object
		s.credit();
		s.debit();
		s.loan();
		s.eduloan();
		
		// Mapped functions are only visible
		r.credit();
		r.debit();
		r.loan();
		//r.eduloan(); -> shows error
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan");
	}
	public void eduloan() {
		System.out.println("Eduloan");
	}
}


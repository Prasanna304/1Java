package g_Abstract;

public class C_IciciTest extends B_RbiTest{

	//Shows error on C_IciciTest to add unimplemented method
	
	public static void main(String[] args) {
		loan(); //Inheritance
	}
	
	//Interface
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}
	
	C_IciciTest i = new C_IciciTest();
	//B_RbiTest r = new B_RbiTest(); //Not possible
	B_RbiTest r = new C_IciciTest();
}
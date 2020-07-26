package i_Encapsulation;

public class C_GpayTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		B_EncapTest e= new B_EncapTest();
		e.setaccno(123);
		System.out.println(e.getaccno());
		e.setAmount(1234);
		System.out.println(e.getAmount());
	}

}

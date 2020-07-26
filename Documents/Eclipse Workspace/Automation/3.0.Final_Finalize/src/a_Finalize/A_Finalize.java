package a_Finalize;

public class A_Finalize {
	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_Finalize f1 = new A_Finalize();
		f1 = null;
		System.gc();// To call grabage collector
					//if i didn't give default gc
					//default finalize() call because its a predefined function
					//if i give gc
					//user defined finalize() will call
		
	}

}

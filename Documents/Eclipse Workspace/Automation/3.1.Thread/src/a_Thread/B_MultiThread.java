package a_Thread;

public class B_MultiThread {
	public void run() { // change it as green because its a pre defined func in thread
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_Thread t1 = new A_Thread();
		A_Thread t2 = new A_Thread();
		A_Thread t3 = new A_Thread();
		t1.start();
		t2.start();
		t3.start();
		t1.stop();//strickout depricated func
					//used in older ver java change it but we can use
		//t1.start(); Throws exception
	}

}

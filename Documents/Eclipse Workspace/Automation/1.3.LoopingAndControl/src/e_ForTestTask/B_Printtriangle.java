package e_ForTestTask;

public class B_Printtriangle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				Thread.sleep(500);
				System.out.print("* ");
			}	
			Thread.sleep(500);
			System.out.println();
		}
	}
}

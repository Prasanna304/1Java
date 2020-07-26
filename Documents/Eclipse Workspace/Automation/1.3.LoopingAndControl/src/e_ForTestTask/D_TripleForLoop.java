package e_ForTestTask;

public class D_TripleForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int k=5;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int l=0;l<5;l++) {
			for(int m=0;m<l;m++) {
				System.out.print(" ");
			}
			for(int n=5;n>l;n--) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}

}

package a_SingleDimentionArray;

public class E_OddAndEvenPosition {

	public static void main(String[] args) {
		
		int a[] = {1,5,4,7,2,6,8};
		System.out.println("odd position");
		for(int i=0;i<a.length;i=i+2) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Even position");
		for(int i=1;i<a.length;i=i+2) {
			System.out.print(a[i]+" ");
		}

	}

}

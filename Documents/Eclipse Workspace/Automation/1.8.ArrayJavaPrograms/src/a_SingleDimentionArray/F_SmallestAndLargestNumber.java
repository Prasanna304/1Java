package a_SingleDimentionArray;

public class F_SmallestAndLargestNumber {

	public static void main(String[] args) {
		int a[] = {5,8,3,6,9,2};
		int small=a[0];
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(small>a[i]) {
				small=a[i];
			}
			if(large<a[i]) {
				large=a[i];
			}
		}
		System.out.println("Large is "+large);
		System.out.println("Small is "+small);
	}
}
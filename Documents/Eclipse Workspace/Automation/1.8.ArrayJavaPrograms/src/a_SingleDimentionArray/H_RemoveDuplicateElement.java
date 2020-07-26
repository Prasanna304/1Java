package a_SingleDimentionArray;

import java.util.Arrays;

public class H_RemoveDuplicateElement {

	public static int removeDuplicateElements(int arr[], int n){
		int temp[] = new int[n]; 
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
				//j=j+1;
			}
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		} 
		return j;
	}
	
	public static void main(String[] args) {
		int a[] = {1,3,6,4,6,5,8,3,6,4};
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		if(a.length==0 || a.length==1) {
			System.out.println("For removel of duplicate we need atleast 2 number");
		}
		else {
			Arrays.sort(a);
			System.out.println();
			System.out.println("Sorted Array");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			System.out.println("After Removed duplicate array");
			int afterRemoveSize=removeDuplicateElements(a,a.length);
			for(int i=0;i<afterRemoveSize;i++) {
				System.out.print(a[i]+" ");
			} 
		}
	}
}

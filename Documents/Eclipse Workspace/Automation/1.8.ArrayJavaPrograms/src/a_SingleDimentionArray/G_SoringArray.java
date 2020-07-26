package a_SingleDimentionArray;

public class G_SoringArray {

	public static void main(String[] args) {
		
		int a[] = {1,5,3,6,8,-8};
		int temp = 0;
		String sort = "ascending";
		int flag=0;
		
		//This can be used directly for sorting the array in ascending order
		//Arrays.sort(array);
		if (sort=="ascending") {
			flag=1;
			for (int i=0; i<a.length-1;i++) {
				for(int j=i+1; j<a.length;j++) {
					if(a[i]>a[j]) {
						temp = a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}	
			}
		}
		
		else if (sort=="descending") {
			flag=1;
			for (int i=0; i<a.length-1;i++) {
				for(int j=i+1; j<a.length;j++) {
					if(a[i]<a[j]) {
						temp = a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}	
			}
		}
		
		else {
			System.out.println("sort must be one of ascending or descending");
		}
		if(flag==1) {
			for (int i=0; i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}
	}

}

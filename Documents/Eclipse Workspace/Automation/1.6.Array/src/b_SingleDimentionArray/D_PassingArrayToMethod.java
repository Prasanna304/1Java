package b_SingleDimentionArray;

public class D_PassingArrayToMethod {

	static void min(int arr[])
	{
		int min=arr[0];  
		for(int i=1;i<arr.length;i++) 
		{	
		 if(min>arr[i])  
		 {
			 min=arr[i];
		 }
		}
		System.out.println("min is "+min);
	}
	public static void main(String[] args) 
	{
		int a[]= {20,10,5,40};
		min(a);	//passing array to method  
	}

}

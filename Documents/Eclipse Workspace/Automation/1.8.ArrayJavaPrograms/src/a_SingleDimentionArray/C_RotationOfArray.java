package a_SingleDimentionArray;

public class C_RotationOfArray {

	public static void main(String[] args) {
		//Initialise array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        //n determine the number of times an array should be rotated  
        int n = 3;  
        String direction_rotate = "right";
        int flag=0;
        //Displays original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println(); 
        System.out.println(); 
        System.out.println("Processing array");
        
        //Rotate the given array by n times toward left  
        if(direction_rotate=="left") {
        	flag=1;
	        for(int i = 0; i < n; i++){  
	            int j, first;  
	            //Stores the first element of the array  
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++){  
	                //Shift element of array by one  
	                arr[j] = arr[j+1];  
	                System.out.print(arr[j] + " ");  
	            }  
	            //First element of array will be added to the end  
	            arr[j] = first;  
	            System.out.print(arr[j] + " ");
	            System.out.println();  
	        }
        }
        
        //Rotate the given array by n times toward right
        else if(direction_rotate=="right") {
        	flag=1;
        	for(int i = 0; i < n; i++){  
	            int j, last;  
	            //Stores the first element of the array  
	            last = arr[arr.length-1];     
	            for(j = arr.length-1; j >0 ; j--){  
	                //Shift element of array by one  
	                arr[j] = arr[j-1];  
	                System.out.print(arr[j] + " ");  
	            }  
	            //First element of array will be added to the end  
	            arr[0] = last;  
	            System.out.print(arr[j] + " ");
	            System.out.println();  
	        }
        }
        
        else{
        	System.out.println("enter direction_rotate as left or right");
        }
        if(flag==1) {
        	System.out.println();  
            //Displays resulting array after rotation  
            System.out.println("Array after left rotation: ");  
            for(int i = 0; i< arr.length; i++){  
            	System.out.print(arr[i] + " ");  
            }
        }
	}
}
/*
 * Syntax to Declare Multidimensional Array in Java
 * 		dataType[][] arrayRefVar; (or)  
 * 		dataType [][]arrayRefVar; (or)  
 * 		dataType arrayRefVar[][]; (or)  
 * 		dataType []arrayRefVar[];   
 * Example to instantiate Multidimensional Array in Java
 * 		int[][] arr=new int[3][3];//3 row and 3 column  
 */


package c_MultiDimentionArray;

public class A_initialization {
	public static void main(String[] args){  
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		//printing 2D array  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
	}
}

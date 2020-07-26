package b_MultiDimentionArray;

public class B_MatrixIsSquare {
	 public static void main(String []args){
		 
       //Initialise matrix a    
       int a[][] = {       
                       {1, 2, 3},    
                       {8, 4, 6, 4},    
                       {4, 5, 7, 5, 6}    
                   };    
             
         //Initialise matrix b    
       int b[][] = {       
                       {1, 2, 3},    
                       {8, 4, 6},    
                       {4, 5, 7}    
           };    
           
       int row = a.length;    
       int col1 = a[0].length; 
       int col2 = a[1].length;
       int col3 = a[2].length;
       System.out.println(row+" "+col1+" "+col2+" "+col3);
       
       int row_a = a.length;
       int flag_a=0;
       for(int i=0; i<row_a-1; i++){
           for (int j=1; j<row_a; j++){
               if(a[i].length!=a[j].length){
                   flag_a=1;
                   break;
               }
           }
       }
       if (flag_a==0)
        System.out.println("A is square matric");
       else
        System.out.println("A is not a square matrix");
       
       int row_b = a.length;
       int flag_b =0;
       for(int i=0; i<row_b-1; i++){
           for (int j=1; j<row_b; j++){
               if(b[i].length!=b[j].length){
                   flag_b=1;
                   break;
               }
           }
       }
       if (flag_b==0)
        System.out.println("B is square matric");
       else
        System.out.println("B is not a square matrix");
    }
}

package a_Variable;

public class A_Variable {
public static int i=5;// if i change it as private shows error in all VT2 VT3
public static int j=5;// if i remove static need to add obj
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=1;
		int k=i+j;
		System.out.println(k);
		add();
	}
	public static void add() {
		int k =i+j;//using global because no local variable
		System.out.println(k);
		
		/* if remove static
		 VariableTest v= new VariableTest(); 
		 int l=v.i+v.j;
		 */
		
	}

}

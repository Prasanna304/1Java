package a_Variable;

public class C_Variable3 extends B_Variable2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=i+j;
		System.out.println(k);
	}
}

/*
 * Once all pass check
 * Delete public in initialisation in A_Variable
 		* Shows error in V_Variable3 (Static/Class level variable)
 * Delete static in initialisation in A_Variable
 		* Shows error in All (Instance variable)
 		* So create object
 		* p.s.v. add() {
 		* 	A_Variable v = new A_Variable();
 		* 	int k = v.i + v.j;
 		* }
 */
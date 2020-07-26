/*
	 * 1st add() => shows error => so add extents
	 * 1st check child (current class), if there is no add() in current then goto parrent
	 * If run program by commenting add() {} shows parent 
	 * If run program by without commenting these lines shows child 
*/

package h_polymorphism;

public class F_ChildOverrideTest extends E_ParrentOverrideTest {

	public static void main(String[] args) {
		add();
	}
	
	public static void add() {
		System.out.println("Child Test");
	}
}

/*
  
 * Super keyword is used to call parent function
 * Super is not working in static memory
 * add() -> Static say 10 MB
 * exe() -> Dynamic say 100 MB
 * We can't call exe in add because of memory
  
 */

package h_polymorphism;

public class G_ChildOverrideWithSuperClass extends E_ParrentOverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G_ChildOverrideWithSuperClass c = new G_ChildOverrideWithSuperClass();
		E_ParrentOverrideTest d= new G_ChildOverrideWithSuperClass();
		//d.exe();
		c.exe();
	}
	public static void add() {
		System.out.println("child add");
	}
	public void exe() {
		add();
		super.add();
	}
}

// The Java if statement tests the condition. It executes the if block if condition is true.

package a_ConditionTest;

public class A_IfTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=19;
		//IF Statement Passed
		if(age>=18) {
			System.out.println("Allow to vote");
		}
		
		
		age=17;
		//IF Statement Failed but no error we can use this but if we need to show if statement failed we need else
		if(age>=18) {
			System.out.println("Allow to vote");
		}
	}
}

/*
 * If can allow duplicate statement
 * Switch will not allow
 * 
 * if(a==10){
 * 		else if (a==10){
 * 		
 * 		}
 * }
 * 
 * switch(a==10):
 * switch(a==10): //shows error
 * 
 * If statement runs one by one
 * Switch statement runs parallel
 */



package a_ConditionTest;

public class H_DifferneceBetweenSwitchAndIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=30;
		if(age == 10) {
			System.out.println("Age is 10");
		}
		else if(age == 20) {
			System.out.println("Age is 20");
		}
		else if(age == 30) {
			System.out.println("Age is 30");
		}
		else if(age == 40) {
			System.out.println("Age is 40");
		}
		else if(age == 50) {
			System.out.println("Age is 50");
		}
		else if(age == 60) {
			System.out.println("Age is 60");
		}
		else {
			System.out.println("Above 60");
		}
		
		
		int age1=30;
		switch (age1) {
		case 10:
			System.out.println("Age is 10");
			break;
		case 20:
			System.out.println("Age is 20");
			break;
		case 30:
			System.out.println("Age is 30");
			break;	
		case 40:
			System.out.println("Age is 40");
			break;
		default:
			break;
		}
	}

}

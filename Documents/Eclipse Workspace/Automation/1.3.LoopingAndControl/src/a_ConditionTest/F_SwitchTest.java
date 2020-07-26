package a_ConditionTest;

public class F_SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=30;
		switch (age) {
		case 10:
			System.out.println("Age is 10");
			break;
		case 20:
			System.out.println("Age is 20");
			break;
		case 30:
			System.out.println("Age is 30");
			System.out.println("Switch");
			break;	
		case 40:
			System.out.println("Age is 40");
			break;
		default:
			break;
		}
		
		
		//without break
		System.out.println();
		switch (age) {
		case 10:
			System.out.println("Age is 10");
			break;
		case 20:
			System.out.println("Age is 20");
			break;
		case 30:
			System.out.println("Age is 30");
			System.out.println("Switch");	
		case 40:
			System.out.println("Age is 40");
			break;
		default:
			break;
		}
		
		
		//default
		System.out.println();
		age = 100;
		switch (age) {
		case 10:
			System.out.println("Age is 10");
			break;
		case 20:
			System.out.println("Age is 20");
			break;
		case 30:
			System.out.println("Age is 30");
			System.out.println("Switch");
			break;	
		case 40:
			System.out.println("Age is 40");
			break;
		default:
			System.out.println("Not in range");
			break;
		}
	}

}

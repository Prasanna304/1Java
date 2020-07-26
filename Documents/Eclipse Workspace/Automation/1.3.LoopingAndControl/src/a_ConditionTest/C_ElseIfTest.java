package a_ConditionTest;

public class C_ElseIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		String country="AUS";
		if(age>=18) {
			System.out.println("Allow to vote");
		}
		else if(country.equals("AUS")){
			System.out.println("AUS Allow to vote");
		}
		else {
			System.out.println("Dont allow to vote");
		}
		
		
		//IF passes doesn't goto elseif or else if paases break there itself
		System.out.println();
		age=19;
		if(age>=18) {
			System.out.println("Allow to vote");
		}
		else if(country.equals("AUS")){
			System.out.println("AUS Allow to vote");
		}	
		else {
			System.out.println("Dont allow to vote");
		}
		
		
		//IF we need to check multiple condition and print all possible output
		System.out.println();
		age=19;
		if(age>=18) {
			System.out.println("Allow to vote");
		}
		if(country.equals("AUS")){
			System.out.println("AUS Allow to vote");
		}
			
		else {
			System.out.println("Dont allow to vote");
		}
	}
}

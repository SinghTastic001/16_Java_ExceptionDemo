package ExceptionHandling1;
import java.util.Scanner;

class Voter1{
	int age;
	void vote() {
		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			throw new AgeInvalidException("Age is below 18");
		}
	}
}
public class VoterSystem {
	
	public static void main(String[] args) {
		
		Voter1 voter = new Voter1();
		System.out.println("Enter age: ");
		
		Scanner sc = new Scanner(System.in);
		voter.age = sc.nextInt();
		voter.vote();
		System.out.println("Voting done");
	}

}

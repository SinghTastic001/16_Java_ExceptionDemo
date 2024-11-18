package ExceptionHandling1;

import java.util.Scanner;

class Voter{
	
	int age;
	void vote() {
		if(age>18) {
			System.out.println("Eligible to vote");
		}else {
			throw new RuntimeException("age is below 18");
		}
		
	}
}
public class VotingSystemCustomError {

	public static void main(String[] args) {
		
		Voter voter = new Voter();
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		voter.age = sc.nextInt();
		
		try {
			voter.vote();
		}catch(RuntimeException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally voting completed");
		}
		System.out.println("Voting done");
	}
}

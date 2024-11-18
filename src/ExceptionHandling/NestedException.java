package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NestedException {

	public static void main(String[] args) {
		try {
			System.out.println("TRY");
			try {
				System.out.println(3/0);
				
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
			
		String name=null;
		System.out.println(name.toUpperCase());
		} catch(Exception e) {
			System.out.println(e);
			
			try {
				FileReader fr = new FileReader(new File("data"));
			} catch(FileNotFoundException e1) {
				e1.printStackTrace();
			}
			System.out.println("Catch");
		}
	}
}

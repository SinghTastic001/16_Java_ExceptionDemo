package ExceptionHandling1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchDemo {
	
	public static void main(String[] args) {
		
//		int a=10;
//		int b=2;
//		
//		try {
//			System.out.println(a/b);
//		}catch (Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("No exception");
		
		
		int a1 = 10;
		int b1 = 0;
//		runtime exception
		try {
			System.out.println("try");
			System.out.println(a1/b1);
		}catch(Exception f) {
			
			System.out.println(f);
		}
		System.out.println("Error occur");
		
		try {
			FileReader file = new FileReader("C:\\Users\\shubu\\OneDrive\\Desktop\\Demo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ALl dones");
		
	}

}

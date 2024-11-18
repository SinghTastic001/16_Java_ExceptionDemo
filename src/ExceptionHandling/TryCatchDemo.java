package ExceptionHandling;
import java.io.FileReader;
//import java.io.file;

//Exception are of two  type :- 1.Complie time or checked exception    2.Runtime or unchecked exception
//Exception handling :-   try and catch
public class TryCatchDemo {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			
			System.out.println(a/b);
			System.out.println("try");
		}catch (Exception e) {
			System.out.println(e);
		}
		
//		try {
////			compile time exception
//			FileReader file = new FileReader("C:\\Users\\dell\Documents\\demo.text");
//		}catch (Exception e) {
//			System.out.println(e);
//		}
		
		System.out.println("Hello");
		
		
	}

}

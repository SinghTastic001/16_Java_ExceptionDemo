package ExceptionHandling;

public class ExceptionDemomulCatch {
	
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b =0;
			
			System.out.println(a/b);
			
			String name = null;
			System.out.println(name.toUpperCase());
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(NullPointerException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("END");
	}
	
//	default exception comes in a last order
//	interview question
//	compile time error

}

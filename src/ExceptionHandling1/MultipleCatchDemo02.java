package ExceptionHandling1;

public class MultipleCatchDemo02 {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		String name="Shubhi";
		
		int[] arr = new int[2];
		
		try {
			System.out.println(a/b);
			System.out.println(name.toUpperCase());
			System.out.println(arr[4]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("First End");
		
		try {
			
			System.out.println(name.toUpperCase());
			System.out.println(a/b);
			System.out.println(arr[4]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Second End");
		
		try {
			System.out.println(arr[4]);
			System.out.println(name.toUpperCase());
			System.out.println(a/b);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Third End");
		
//        try {
//			
//			System.out.println(name.toUpperCase());
//			System.out.println(a/b);
//			System.out.println(arr[4]);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		}catch(NullPointerException e) {
//			System.out.println(e);
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		
		System.out.println("fourth End");
//		why parent exception put in last.
	}

}

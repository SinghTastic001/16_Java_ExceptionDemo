package ExceptionPractice;

public class NullPointer {
	
	public static void main(String[] args) {
		
		try {
			
			String name = null;
			int a = 10;
			int b = 20;
			System.out.println(a/b);
			System.out.println(name.toUpperCase());
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("null pointers example");
		}
	}

}

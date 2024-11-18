package ExceptionHandling1;

import java.io.FileReader;

public class NestedTryCatchDemo {
	public static void main(String[] args) {
		
		try {
			System.out.println("Outer Try");
			try {
				System.out.println("Inner Try");
				int a=10;
				int b=0;
				System.out.println(a/b);
			}catch(Exception e) {
				System.out.println(e);
			}
			String name=null;
			System.out.println(name.toUpperCase());
		}catch(Exception e) {
			System.out.println(e);
			try {
				FileReader fr = new FileReader(new String("data"));
			}catch(Exception e1) {
				System.out.println(e1);
			}
		}
		System.out.println("All Done");
	}

}

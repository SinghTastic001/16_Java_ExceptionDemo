package ExceptionHandling1;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Demo{
	
	void readFile(String path) throws FileNotFoundException {
		FileReader fr  = new FileReader(path);
		
	}
}
public class ThrowsDemo {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		try {
			d.readFile("data.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("yes do");
	}
}

package berger;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class InputTest {

	public static void main(String[]args){
		int c;
		try {
			InputStream in = 
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("test.txt")));
					
		} catch (Exception e){
			System.err.println("ERROR");
		}
	}
	
}

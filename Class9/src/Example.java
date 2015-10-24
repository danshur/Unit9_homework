import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Example {

	public static void main(String[] args) {
		try {
			convert(args[0]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void convert(String arg) throws FileNotFoundException {
		FileInputStream stream = new FileInputStream( arg );
	}
	
}

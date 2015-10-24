import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Exceptions {
	
	public static void handleException() {
	    File infile = new File( "SomeFile.txt" );
	    try {
	    	FileInputStream stream = new FileInputStream( infile );
	    	// do something with stream
	    } catch (FileNotFoundException e) {
	    	System.out.println("The file does not exist");
	    }
	}
	
	public static void forwardException() throws FileNotFoundException {
	    File infile = new File( "SomeFile.txt" );
	    FileInputStream stream = new FileInputStream( infile );
	    // do something with stream
	}
	
	public double divide(double dividend, double divisor) {
		if (divisor == 0) {
			throw new IllegalArgumentException("Divisor is equal to 0");
		}
		return dividend / divisor;
	}


}

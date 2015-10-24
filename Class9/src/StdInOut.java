import java.io.IOException;


public class StdInOut {
	
	// Run this using the debugger console
	public static void main(String[] args) throws IOException {
		while (true) {
			byte[] buffer = new byte[1024];
			System.in.read(buffer);
			String input = new String(buffer);
			System.out.println(input);
		}
	}

}

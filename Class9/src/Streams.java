import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Streams {

	public static void main(String[] args) {
		write();
		read();
	}
	
	public static void write() {
		try {
			FileWriter stream = new FileWriter("SomeFile.txt");
			BufferedWriter writer = new BufferedWriter(stream);
			for (int inx = 0; inx < 10; ++inx) {
				writer.write("Record #" + (inx + 1) + "\n");
			}
			writer.close();
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage());
		}
	}
	
	public static void read() {
		try {
			FileReader stream = new FileReader("SomeFile.txt");
			BufferedReader reader = new BufferedReader(stream);
			String line = reader.readLine();
		    while ( line != null ) {
		        System.out.println( line );
		        line = reader.readLine();
		    }
			reader.close();
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage());
		}
	}
}

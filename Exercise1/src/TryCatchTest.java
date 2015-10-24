import javax.swing.JOptionPane;

public class TryCatchTest {

	public static void main(String[] args) {
		String error = "That wasn't a number! ";
		String prompt = "Please enter a number";
		String reply = JOptionPane.showInputDialog(null, prompt);
		int num = 0;

		if (reply == null) {
			throw new IllegalArgumentException("Invalid operation; no data entered.");
		}
		
		try {
			num = Integer.parseInt(reply);
			JOptionPane.showMessageDialog(null, "The number was " + num);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, error + e.getMessage());
		}
	}
}

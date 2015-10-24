import java.util.Scanner;

public class Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object num = askforNum();
		//System.out.println("You entered " + askforNum()); 
	}

	private static void askforNum() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number ");

		try {
			
			Double.parseDouble(in.next());
			//double num = in.nextInt();
			
			
		} catch (NumberFormatException e) {
			System.out.println("Input is not a double " + e);
		}
	}

}

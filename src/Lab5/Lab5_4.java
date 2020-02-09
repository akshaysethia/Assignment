package Lab5;
import java.util.*;
@SuppressWarnings("serial")
class Error extends Exception {
	public void empt() {
		System.out.println("Either One Or Both Fields Are Blank !");
	}
}

public class Lab5_4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("FirstName: ");
		String arr = in.nextLine();
		System.out.println();
		System.out.print("LastName: ");
		String brr = in.nextLine();
		try {
			if (arr.isEmpty() || brr.isEmpty()) {
				throw new Error();
			} else {
				System.out.println();
				System.out.println("FirstName: " + arr + " " + "LastName: " + brr);
			}
		} catch (Error e) {
			e.empt();
		}
		in.close();
	}

}

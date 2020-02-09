package Lab5;
import java.util.*;
@SuppressWarnings("serial")
class Invalid extends Exception {
	public void invalid1() {
		System.out.println("Age Is Less !");
	}
}

public class Lab5_5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Age: ");
		int arr = in.nextInt();
		
		try {
			if (arr<=15) {
				throw new Invalid();
			} else {
				System.out.println();
				System.out.println("Age: " + arr);
			}
		} catch (Invalid e) {
			e.invalid1();
		}
		in.close();
	}

}

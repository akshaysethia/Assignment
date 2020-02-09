package Lab5;
import java.util.Scanner;
import com.cg.eis.exception.*;

public class Lab5_6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Your Salary: ");
		int a = in.nextInt();
		try {
			if (a <= 3000) {
				throw new EmployeeException();
			} else {
				System.out.println();
				System.out.println("You Have A Good Salary !");
			}
		} catch (EmployeeException e) {
			e.choose();
		}
		in.close();
	}

}

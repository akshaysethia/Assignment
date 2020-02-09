package Lab1;
import java.util.*;

public class Fibo {
	
	public static int sumfib(int a) {
		int f1 = 0, f2 = 1, f3, i;
		System.out.print("The FiboNacci Series to N terms Is: "); 
		if (a == 0) {
			System.out.println("None");
		} else if (a == 1) {
			System.out.println(f1);
		} else if (a == 2) {
			System.out.println(f1 + " " + f2);
		} else {
			System.out.print(f1 + " " + f2);
			for (i=2; i<a; i++) {
				f3 = f1 + f2;
				System.out.print(" " + f3);
				f1 = f2;
				f2 = f3;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int a = in.nextInt();
		sumfib(a);
		in.close();
	}

}

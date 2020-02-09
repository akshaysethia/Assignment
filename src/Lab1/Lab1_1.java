package Lab1;
import java.util.*;

public class Lab1_1 {

	public static int calculateSum(int a) {
		int sum = 0;
		for(int i=0; i<=a; i++) {
			if (i%3 == 0 || i%5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int a = in.nextInt();
		in.close();
		a = calculateSum(a);
		System.out.println("The Sum To N Number is: " + a);
	}

}

package Lab1;
import java.util.*;

public class Lab1_2 {
	
	public static int calcuateDifference(int a) {
		int sqsum = 0, sum = 0;
		for (int i=0; i<=a; i++) {
			sqsum += i*i;
			sum += i;
		}
		return sqsum - (sum*sum);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int a = in.nextInt();
		in.close();
		System.out.println("The Difference is: " + calcuateDifference(a));
	}

}

package Lab4;
import java.util.*;

public class Lab4_1 {

	public static void cubeCalc(int n) {
		int r, sum = 0;
		while(n!=0) {
			r = n%10;
			sum += r*r*r;
			n /= 10;
		}
		System.out.println("The Sum Of Cubes: " + sum);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n = in.nextInt();
		cubeCalc(n);
		in.close();
	}

}

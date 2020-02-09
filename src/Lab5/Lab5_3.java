package Lab5;
import java.util.*;

public class Lab5_3 {

	public static void priming(int n) {
		int count;
		if (n < 2) {
			System.out.println("No Prime Numbers !");
		} else if (n == 2) {
			System.out.println("2");
		} else {
			for (int i=2; i<=n; i++) {
				count = 0;
				for (int x=1; x<i; x++) {
					if (i%x == 0) {
						count++;
					}
				}
				if (count == 1) {
					System.out.print(i + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n = in.nextInt();
		priming(n);
		in.close();
	}

}

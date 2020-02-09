package Lab5;

import java.util.*;

public class Lab5_2 {

	public static void fibo(int n) {
		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	public static int recurfibo(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			return recurfibo(n - 2) + recurfibo(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n = in.nextInt();
		System.out.print("Fibonacci Series Using Recursion: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(recurfibo(i) + " ");
		}
		System.out.println();
		System.out.print("Fibonacci Series using Function : ");
		fibo(n);
		in.close();
	}

}

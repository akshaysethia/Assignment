package Lab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab6_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		System.out.println("Caution: Space is the delimiter !");
		System.out.println("Enter The Number, space seperated !");
		String inp = in.nextLine();
		StringTokenizer str = new StringTokenizer(inp, " ");
		while (str.hasMoreTokens()) {
			sum += Integer.parseInt(str.nextToken());
		}
		System.out.println("The Sum is: " + sum);
		in.close();
	}

}

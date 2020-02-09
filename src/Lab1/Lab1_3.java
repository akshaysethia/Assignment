package Lab1;

import java.util.Scanner;

public class Lab1_3 {
	
	public static boolean checkNumber(int a) {
		int r, flag = 0, temp = 9;
		while(a!=0) {
			r = a%10;
			if (r<=temp) {
				temp = r;
				flag = 1;
			} else {
				flag = 0;
				break;
			}
			a /= 10;
		}
		if (flag == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int a = in.nextInt();
		System.out.println("The Number Is: " + checkNumber(a));
		in.close();
	}

}

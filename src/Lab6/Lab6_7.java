package Lab6;

import java.util.Scanner;

public class Lab6_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Job Name: ");
		String str = in.next();
		String extension = "";
		int flag = 0;
		int i = str.lastIndexOf('_');
		if (i >= 0) {
			extension = str.substring(i).toLowerCase();
		}
		if (extension.compareTo("_job") == 0) {
			if (str.length() >= 8) {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		in.close();
	}
}

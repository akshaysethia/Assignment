package Lab1;
import java.util.*;

public class Lab1_4 {
	
	public static boolean checkNumber(int a) {
		int i = 1, flag = 0;
		while(i < a) {
			i *= 2;
			if (i == a) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int a = in.nextInt();
		System.out.println("The Number is a Power of 2: " + checkNumber(a));
		in.close();
	}

}

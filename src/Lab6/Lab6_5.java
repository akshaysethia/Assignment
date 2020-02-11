package Lab6;
import java.util.*;

public class Lab6_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The String: ");
		String str = in.next().toUpperCase();
		int min = (int)str.charAt(0), flag = 0;
		for (int i=1; i<str.length(); i++) {
			if (min < (int)str.charAt(i)) {
				min = (int)str.charAt(i);
				flag = 1;
			} else {
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Positive String");
		} else {
			System.out.println("Negative String");
		}
		in.close();
	}

}

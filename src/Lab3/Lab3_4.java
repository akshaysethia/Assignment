package Lab3;
import java.util.*;

public class Lab3_4 {

	public static void counter(String brr) {
		int[] counter = new int[26];
		for (int i=0; i<26; i++) {
			counter[i] = 0;
		}
		String arr = brr.toLowerCase();
		int x = 65;
		for (int i=0; i<arr.length(); i++) {
			counter[arr.charAt(i) - 'a']++;
		}
		for (int i=0; i<counter.length; i++) {
			if (counter[i] > 0) {
				System.out.println((char)(x+i) + " : " + counter[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Character: ");
		String arr = in.next();
		counter(arr);
		in.close();
	}

}

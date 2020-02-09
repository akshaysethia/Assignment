package Lab3;

import java.util.*;

public class Lab3_2 {

	public static void sorter(String[] arr, int n) {
		Arrays.sort(arr);
		if (arr.length % 2 == 0) {
			for (int i = 0; i < (arr.length / 2); i++) {
				arr[i] = arr[i].toUpperCase();
			}
			for (int i = (arr.length / 2) + 1; i < arr.length; i++) {
				arr[i] = arr[i].toLowerCase();
			}
		} else {
			for (int i = 0; i < (arr.length / 2) + 1; i++) {
				arr[i] = arr[i].toUpperCase();
			}
			for (int i = (arr.length / 2) + 2; i < arr.length; i++) {
				arr[i] = arr[i].toLowerCase();
			}
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.next();
		}
		sorter(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		in.close();
	}

}

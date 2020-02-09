package Lab3;
import java.util.*;

public class Lab3_3 {

	public static void getSorted(int[] arr, int n) {
		String a;
		String y;
		for (int i=0; i<n; i++) {
			y = "";
			a = Integer.toString(arr[i]);
			for (int x=a.length()-1; x>=0; x--) {
				y += a.charAt(x);
			}
			arr[i] = Integer.parseInt(y);
		}
		Arrays.sort(arr);
		for (int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		getSorted(arr, n);
		in.close();
	}

}

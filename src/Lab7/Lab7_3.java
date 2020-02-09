package Lab7;
import java.util.*;

public class Lab7_3 {

	public static HashMap<Integer, Integer> getSquares(int[] arr) {
		HashMap<Integer, Integer> mat = new HashMap<>();
		for (int i=0; i<arr.length; i++) {
			mat.put(arr[i], arr[i]*arr[i]);
		}
		return mat;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Size: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter The Numbers: ");
		for (int i=0; i<n; i++) {
			System.out.print((i+1) + " : ");
			arr[i] = in.nextInt();
		}
		System.out.println(getSquares(arr));
		in.close();
	}

}

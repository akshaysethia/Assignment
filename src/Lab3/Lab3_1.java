package Lab3;
import java.util.*;

public class Lab3_1 {
	
	public static void getSecondSmallest(int[] a) {
        Arrays.sort(a);
        System.out.println("The Second Least element is: " + a[1]);
    }

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("Enter the " + (i+1) + " Element: ");
            a[i] = in.nextInt();
        }
        getSecondSmallest(a);
        in.close();
    }

}

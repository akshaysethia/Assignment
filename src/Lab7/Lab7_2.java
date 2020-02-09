package Lab7;
import java.util.*;

public class Lab7_2 {

	public static Map<Character, Integer> countCharacter(String str) {
		HashMap<Character, Integer> mat = new HashMap<>();
		for (int i=0; i<str.length(); i++) {
			mat.put(str.charAt(i), 0);
		}
		for (int i=0; i<str.length(); i++) {
			mat.put(str.charAt(i), mat.get(str.charAt(i)) + 1);
		}
		return mat;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Characters: ");
		String str = in.next().toLowerCase();
		System.out.println(countCharacter(str));
		in.close();
	}

}

package Lab7;
import java.util.*;

public class Lab7_1 {

	public static List<Integer> getValues(HashMap<Integer, Integer> mat) {
		List<Integer> fat = new LinkedList<>();
		for(Map.Entry<Integer, Integer> entr : mat.entrySet()) {
			fat.add((int)entr.getValue());
		}
		Collections.sort(fat);
		return fat;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> mat = new HashMap<>();
		mat.put(1, 10);
		mat.put(3, 30);
		mat.put(2, 20);
		mat.put(5, 50);
		mat.put(4, 40);
		System.out.println(getValues(mat));
	}

}

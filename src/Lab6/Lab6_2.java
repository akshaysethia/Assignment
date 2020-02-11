package Lab6;

import java.io.*;
import java.util.*;

public class Lab6_2 {

	public static void main(String[] args) throws IOException {
		try {
			File fil = new File("data.txt");
			Scanner in = new Scanner(fil);
			int i = 1;
			while (in.hasNextLine()) {
				String data = in.nextLine();
				System.out.println(i + " " + data);
				i++;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

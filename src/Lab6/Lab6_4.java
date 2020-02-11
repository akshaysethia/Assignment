package Lab6;

import java.io.*;
import java.util.*;

public class Lab6_4 {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter The FileName: ");
			String filename = in.next();
			File fil = new File(filename);
			if (fil.exists()) {
				System.out.println("File Exists !");
			} else {
				System.out.println("File Does Not Exist !");
			}

			if (fil.canRead()) {
				System.out.println("File Is ReadAble");
			} else {
				System.out.println("File is Not ReadAble");
			}

			if (fil.canWrite()) {
				System.out.println("File Has Write Permissions");
			} else {
				System.out.println("File Does Not Have Write Permissions");
			}

			if (fil.exists()) {
				String extension = "";
				int i = filename.lastIndexOf('.');
				if (i >= 0) {
					extension = filename.substring(i + 1);
				}
				System.out.println("The File Type is: ." + extension);
				System.out.println("The File Length is: " + fil.length() + " bytes");
			} else {
				System.out.println("The File Length or the file type Cannot Be Determined !");
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

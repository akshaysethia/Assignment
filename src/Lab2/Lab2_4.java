package Lab2;

import java.util.*;

abstract class MediaItem extends Item {
	private int runtime;

	public int getruntime() {
		return runtime;
	}

	public void setruntime(int runtime) {
		this.runtime = runtime;
	}

}

public class Lab2_4 extends MediaItem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MediaItem obj = new Lab2_4();
		System.out.print("Enter The Id No: ");
		int b = in.nextInt();
		obj.setIdentification_number(b);
		System.out.print("Enter The Title :");
		String a = in.next();
		obj.setTitle(a);
		System.out.print("Enter The Number Of Copies: ");
		b = in.nextInt();
		obj.setNo_of_copies(b);
		System.out.println("Id No: " + obj.getIdentification_number());
		System.out.println("Name: " + obj.getTitle());
		System.out.println("No Of Copies: " + obj.getNo_of_copies());
		in.close();
	}

}

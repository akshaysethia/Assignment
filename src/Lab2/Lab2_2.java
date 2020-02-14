package Lab2;

import java.util.*;

abstract class WrittenItem extends Item {
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

public class Lab2_2 extends WrittenItem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		WrittenItem obj = new Lab2_2();
		System.out.print("Enter The Id No: ");
		int b = in.nextInt();
		obj.setIdentification_number(b);
		System.out.print("Enter The Title :");
		String a = in.next();
		obj.setTitle(a);
		System.out.print("Enter The Number Of Copies: ");
		b = in.nextInt();
		obj.setNo_of_copies(b);
		System.out.print("Enter The Author Name: ");
		a = in.next();
		obj.setAuthor(a);
		System.out.println("Id No: " + obj.getIdentification_number());
		System.out.println("Name: " + obj.getTitle());
		System.out.println("No Of Copies: " + obj.getNo_of_copies());
		System.out.println("Author: " + obj.getAuthor());
		in.close();
	}
}

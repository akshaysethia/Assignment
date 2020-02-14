package Lab2;

import java.util.*;

class Video extends WrittenItem {
	private String director;
	private String genre;
	private int year;

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

class CD extends WrittenItem {
	private String artist;
	private String genre;

	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}

public class Lab2_5 {

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

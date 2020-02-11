package Lab6;
import java.util.*;
import java.time.*;

public class Lab6_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Year: ");
		int year = in.nextInt();
		System.out.print("Enter The Month: ");
		int month = in.nextInt();
		System.out.print("Enter The day: ");
		int day = in.nextInt();
		LocalDate user = LocalDate.of(year, month, day);
		LocalDate curr = LocalDate.now();
		Period diff = Period.between(user, curr);
		System.out.println("Difference -");
		System.out.println("Days: " + diff.getDays());
		System.out.println("Months: " + diff.getMonths());
		System.out.println("Years: " + diff.getYears());
		in.close();	
	}

}

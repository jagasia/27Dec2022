import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FindAge {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your date of birth (dd-MMM-yyyy):");
		String input=sc.nextLine();
		Date dob=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		dob=sdf.parse(input);
		
		//find age
		java.sql.Date d1=new java.sql.Date(dob.getTime());
		LocalDate dateOfBirth=d1.toLocalDate();
		
		LocalDate today=LocalDate.now();
		
		Period p = Period.between(dateOfBirth, today);
		System.out.println(p);
		System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months, "+p.getDays()+" days old");


		
		
	}

}

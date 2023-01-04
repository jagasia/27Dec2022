import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SDFDemo1 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the DOB(dd-MM-yyyy):");
		String input=sc.nextLine();
//		System.out.println(input);'
		//to convert String input into Date
		Date dateOfBirth=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		dateOfBirth=sdf.parse(input);
		SimpleDateFormat sdf2=new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(dateOfBirth));
	}

}

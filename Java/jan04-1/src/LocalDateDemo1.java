import java.util.Date;
import java.time.LocalDate;

public class LocalDateDemo1 {

	public static void main(String[] args) {
		Date dob=new Date();
		LocalDate ld1 = LocalDate.of(dob.getYear()+1900, dob.getMonth()+1, dob.getDay()+1);
		System.out.println(ld1);
		
	}

}

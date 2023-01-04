import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LeapYear {

	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar();
		Date dt=new Date();
		System.out.println(dt.getYear());
		gc.setTime(new Date());
		System.out.println(gc.get(Calendar.YEAR));
		gc.add(Calendar.MONTH, 12);
		System.out.println(gc.get(Calendar.MONTH));
		
//		System.out.println(gc.isLeapYear(2004));
//		
		System.out.println(gc.getTime());
	}

}

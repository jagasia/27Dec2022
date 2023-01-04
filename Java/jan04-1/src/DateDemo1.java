import java.util.Date;
import java.util.Scanner;

public class DateDemo1 {

	public static void main(String[] args) {
//		String input=new Scanner(System.in).nextLine();
//		System.out.println(input);
		long result = Date.parse("2023/01/01");
		Date dt=new Date(result);
		System.out.println(dt);
	}

}

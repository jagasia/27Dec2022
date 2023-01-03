import java.util.Scanner;

public class RegExMatchingOrNot {

	public static void main(String[] args) {
//		([A-Za-z_]+)([@]{1})([.]{1})([a-z]+)
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(input.matches("([A-Za-z_]+)([@]{1})([a-z]+)([.]{1})([a-z]+)"))
			System.out.println("Valid email");
		else
			System.out.println("Invalid email");
	}

}

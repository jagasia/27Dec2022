import java.util.Scanner;

public class MainPalindrome2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		StringBuilder sb=new StringBuilder(input);
		sb.reverse();
		String reverse=sb.toString();
		if(input.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		sc.close();
	}

}

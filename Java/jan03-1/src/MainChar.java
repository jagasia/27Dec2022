import java.util.Scanner;

public class MainChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		char c=sc.next().charAt(0);
		char c='\0';
		String input=sc.next();
		c=input.toLowerCase().charAt(0);
//		System.out.println(c);
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(input+" is Vowel");
			break;
		default:
			System.out.println(input+"is not vowel");
			break;
		}
		sc.close();
//		System.out.println(input);
	}

}

import java.util.Scanner;

public class StringVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		//how to access every character in a String?
		//1) charAt(index) start from index 0 to length -1
		//2) toCharArray() and then loop every char
		
//		char[] arr = input.toCharArray();
		for(char c : input.toCharArray())
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print(c);	
				break;
			}
		}
	}
}


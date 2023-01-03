import java.util.Scanner;

public class MainCharWrapper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		boolean isFirstDigit=false;
		for(char c:input.toCharArray())
		{
			//check if it is a number or not
			if(Character.isDigit(c))
			{
				if(!isFirstDigit)
					System.out.println();
				isFirstDigit=true;
				System.out.print(c);				
				
			}else
				isFirstDigit=false;
		}
		sc.close();
	}

}

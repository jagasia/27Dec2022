import java.util.Arrays;
import java.util.Scanner;

public class AnagramDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		String input2=sc.next();
		//to convert String into char arr
		char[] arr1 = input1.toLowerCase().toCharArray();
		char[] arr2 = input2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		
		int []arr3= {1,3,2,4,8,5,8,443};
		System.out.println(arr3);
		System.out.println("Array1: "+Arrays.toString(arr1));
		//to convert char arr into String
		String str1=new String(arr1);
		String str2=new String(arr2);
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Anagrams");
		else
			System.out.println("Not anagrams");
		
		sc.close();
	}

}

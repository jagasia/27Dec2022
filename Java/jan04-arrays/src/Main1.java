import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		Integer []arr= {1,3,4,6,2,8,100,11,15,25,12};
		Arrays.sort(arr, (a,b)->b-a);
//		for(int i=arr.length-1;i>=0;i--)
//			System.out.println(arr[i]);
		System.out.println(Arrays.toString(arr));
	}

}

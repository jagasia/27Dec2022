import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayListOps alo=new ArrayListOps();
//		ArrayList<Integer> result = alo.makeArrayListInt(4);
		ArrayList<Integer> input=new ArrayList<>();
		input.add(2);
		input.add(55);
		input.add(4);
		input.add(55);
		input.add(66);
		input.add(55);
		input.add(88);
		
//		ArrayList<Integer> result = alo.reverseList(input);
		ArrayList<Integer> result = alo.changeList(input, 55, 500);
		System.out.println(result);
	}

}

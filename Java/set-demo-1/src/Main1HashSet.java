import java.util.HashSet;

public class Main1HashSet {

	public static void main(String[] args) {
		HashSet<Integer> marks=new HashSet<>();
		marks.add(50);
		marks.add(150);
		marks.add(50);	//no effect
		marks.add(50);	//no effect
		marks.add(70);
		marks.add(50);	//no effect
		marks.add(70);	//no effect
		marks.add(50);	//no effect
		marks.add(80);
		
		System.out.println(marks.size());
		System.out.println(marks);
	}

}

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
//		ArrayList<Integer> marks=new ArrayList<>();		//no need to know the size
		ArrayList<Integer> marks=new ArrayList<>(100);
		marks.add(20);
		marks.add(90);
		marks.add(120);
		marks.add(210);
		marks.add(201);
		marks.add(320);
		marks.add(240);
		marks.add(0, 11);

		System.out.println(marks.size());
		marks.trimToSize();
		
		
		
//		System.out.println(marks.size());
		
//		for(int i=0;i<marks.size();i++)
//		{
//			System.out.println(marks.get(i));
//		}
	}

}

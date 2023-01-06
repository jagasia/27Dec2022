import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//class Dummy implements Predicate<Integer>
//{
//
//	@Override
//	public boolean test(Integer t) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	
//}
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(60);
		marks.add(40);
		marks.add(50);
		marks.add(70);
		marks.add(65);
		marks.add(80);
		marks.add(70);
		marks.add(40);
		marks.add(50);
		marks.add(60);
		
//		Stream<Integer> s = marks.stream();
//		s=s.distinct();
//		s.forEach(System.out::println);
		List<Integer> result = marks.stream()
//		.distinct()
		.filter((a)->a>60)
		.sorted((a,b)->b-a)
		.collect(Collectors.toList());
//		.forEach(System.out::println);
		
		for(Integer x:result)
		{
			System.out.println(x);
		}
	}

}

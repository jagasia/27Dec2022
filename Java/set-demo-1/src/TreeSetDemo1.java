import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<String> countries=new TreeSet<>();
		countries.add("India");
		countries.add("Australia");
		countries.add("Zimbabwe");
		countries.add("China");
		countries.add("England");
		countries.add("England");
		countries.add("Nepal");
		countries.add("Sri lanka");
		countries.add("Japan");
		countries.add("China");
		
		for(String country:countries)
			System.out.println(country);
	}

}

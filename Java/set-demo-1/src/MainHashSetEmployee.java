import java.util.HashSet;

public class MainHashSetEmployee {

	public static void main(String[] args) {
		HashSet<Employee> empSet=new HashSet<>();
		empSet.add(new Employee(12, "Raja", "ECE", 1212.0));
		empSet.add(new Employee(2, "Abdul", "EEE", 1212.0));
		empSet.add(new Employee(13, "John", "ECE", 5212.0));
		empSet.add(new Employee(1, "Zaheer", "EEE", 1512.0));
		empSet.add(new Employee(11, "John", "ECE", 1215.0));
		empSet.add(new Employee(11, "Suresh", "EEE", 7212.0));
		empSet.add(new Employee(32, "Dinesh", "ECE", 1212.0));
		empSet.add(new Employee(11, "Raja", "ECE", 2212.0));
		
		for(Employee e:empSet)
			System.out.println(e);
	}

}

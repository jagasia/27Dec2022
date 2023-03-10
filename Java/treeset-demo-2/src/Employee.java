
public class Employee implements Comparable<Employee>
{
	Integer id;
	String name;
	String department;
	Double salary;
	
	public Employee() {}

	public Employee(Integer id, String name, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee arg0) {
//		return this.getDepartment().compareTo(arg0.getDepartment());
//		return this.getId().compareTo(arg0.getId());
		return this.id-arg0.id;
	}


}

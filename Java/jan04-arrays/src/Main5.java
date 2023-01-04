
public class Main5 {

	public static void main(String[] args) {
		Employee arr[]=new Employee[5];
//		int i;		//this is complete i is created	memory is allocated here itself in stack
//		Employee e;	//this is incomplete. only declared. e is null here 	e is created in stack	
//		e=new Employee();		//heap memory is allocated and its reference is kept in e (which is stack)

//		arr[0] is null
//		
//		arr[0]=new Employee();			//an element is created
//		arr[1]=new Employee();
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Employee();
		}
	}

}

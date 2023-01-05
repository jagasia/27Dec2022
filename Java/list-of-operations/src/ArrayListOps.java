import java.util.ArrayList;
import java.util.Collections;

class ArrayListOps {
	
	public ArrayList<Integer> makeArrayListInt(int n)
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			result.add(0);
		}
		return result;
	}
	
	public ArrayList<Integer> reverseList(ArrayList<Integer> list)
	{		
//		Collections.reverse(list);
//		return list;
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int i=list.size()-1;i>=0;i--)
		{
			result.add(list.get(i));
		}
		return result;
	}
	
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
	{
		Collections.replaceAll(list, m, n);
		return list;		
	}
}

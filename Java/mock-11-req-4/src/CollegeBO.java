import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollegeBO {
	public List<College> findCollege(List<College> collegeList,List<String> nameList)
	{
		return null;	//incomplete
	}
	public List<College> findCollege(List<College> collegeList,Date startingDate)
	{
		return null;	//incomplete
	}
	public List<College> findCollege(List<College> collegeList, String location)
	{
		//loop the collegeList elements
		List<College> result=new ArrayList<College>();
		for(int i=0;i<collegeList.size();i++)
		{
			College college = collegeList.get(i);
			if(college.getLocation().equals(location))
			{
				result.add(college);
			}
		}
		return result;	
	}

}

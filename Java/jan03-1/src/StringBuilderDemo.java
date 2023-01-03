
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("This is");
		sb.append(" ");
		sb.append("a text");
		
		
		sb.insert(5, "also ");
		System.out.println(sb.toString());
	}

}

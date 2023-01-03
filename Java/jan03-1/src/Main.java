class MyInteger
{
	int value;
}
public class Main {

	static void swap(MyInteger i, MyInteger j)
	{
		MyInteger temp=i;
		i=j;
		j=temp;
		System.out.printf("i=%d and j=%d\n",i.value,j.value);
	}

	public static void main(String[] args) {
		
		MyInteger a=new MyInteger();
		a.value=20;
		MyInteger b=new MyInteger();
		b.value=30;

		swap(a,b);
		System.out.printf("a=%d and b=%d",a.value,b.value);
	}

}

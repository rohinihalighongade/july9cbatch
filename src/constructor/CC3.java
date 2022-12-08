package constructor;

public class CC3 {
int a;
int b;
int c;

public CC3()
{
	a=20;
	b=13;
	c=45;
	
}
public static void main(String[] args)
{
	CC3 c= new CC3();
	c.sum();
}
public void sum()
{
	int sum =a+b+c;
	System.out.println(sum);
}

	
	
}

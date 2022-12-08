package mathwithmethods;

public class MathsUse {

	public static void main(String[] args) {
	add();//Static method from same class
	add();
	
	MathsUse math=new MathsUse();
	
		math.demo();	//non Static method from different class
		
		sum(1,1,1,1);//Static method from same class with parameters
		sum(1,1,1,1);
		math.sub(89, 23);//non Static method from different class with parameters
		math.sub(78, 65);
	math.sub(45, 6);
	}
	public static void add()
	{
		int a=25;
		int b=65;
		int multi=a*b;
	System.out.println(multi);
	}
	
	public void demo() 
	{
		System.out.println("hi im rohini");
	}
	public static void divi()
	{
		int a=65;
		int b=65;
		int divi=a/b;
	System.out.println(divi);
	}
	
	public static void sum(int a,int b,int c,int d)
	{
		int sum =a+b+c+d;
		System.out.println(sum);
	}
	public void sub(int e,int f)
	{ int sub=e-f;
	System.out.println(sub);
	
	}
	
	
}

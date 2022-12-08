package variabletype;

public class VariableTypes {
	int a=90;//non-static global variable
	static int b=50;//static global Variable

	public static void main(String[] args) 
	{test1();//calling static local variable method from same class
	VariableTypes glb=new VariableTypes();
	glb.test();//calling non-static local variabl method from same class
	System.out.println("---------------------------------------------");
	System.out.println("non-static global variable from same class"+glb.a);
	int sum=86+glb.a;
	System.out.println(sum);//calling non-static  global method from same class
	int multi=56*glb.a;
	System.out.println(multi);
	System.out.println("---------------------------------------------------");
	System.out.println("static global variable from same class"+b);
	int sub=78-b;
	System.out.println(sub);
	int divi=100/b;//calling static  global method from same class
	System.out.println(divi);
	System.out.println("---------------------------------------------------");	
	}
	public void test()
	{int a;
	System.out.println("hi i am non-ststic test menthod");
			}
	public static void test1()//static method
	{System.out.println("hi i am ststic test menthod");
		
	}
}


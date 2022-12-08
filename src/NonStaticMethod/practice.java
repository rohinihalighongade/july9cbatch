package NonStaticMethod;

import methods2.MethodStudyP;

public class practice {

	
	public static void main(String[] args)
	{/* to call non static method to main method create object
	to create object classname objectname=new classname() */
		practice rh=new practice();
		rh.test();
		practice mb=new practice();
		mb.sub();
		MethodStudyP pp=new MethodStudyP();
		pp.add1();
		// non static method from different class
		
	
	}
	//it is non static regular method which contain complete body
public void test()//Variable declaration
{
	System.out.println("hi i am rohini"); //variable intialization
	
}
	public void sub()
	{
		int a=23;
		int b=85;
		int sum=a+b;
		System.out.println(sum);	
	}
	
}

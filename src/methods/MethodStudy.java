package methods;

import methods2.MethodStudyP;

public class MethodStudy {

	public static void main(String[] args) {
		
 System.out.println("My name is Rohini");
add();// public static void from same class
wish();//public static void from same class
MethodStudy yup=new MethodStudy();
yup.sub();
System.out.println("im from Aurangabad");
	}
	
public static void add()
{
int a=85;
int b=85;
int sum=a+b;
System.out.println(sum);

}
public static void wish()
{System.out.println("hi");
System.out.println("good night");
		
	
}
	public void sub() 
	{
		int d=89;
				int e=63;
				int sub=d-e;
				System.out.println(sub);
	}
	
	
	
	
	
	
}

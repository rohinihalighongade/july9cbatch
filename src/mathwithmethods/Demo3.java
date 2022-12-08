package mathwithmethods;

public class Demo3 {

	public static void main(String[] args) {
		Demo3 d1=new Demo3();
		d1.assignment();
		d1.univercity("Rohini", 17371, 60.2, 'f', "Mechanical dept");

	}

public void assignment()
{
String name="Rohini Rajkumar Halighongde";
System.out.println("My name is "+name);
int PRN=17371;
System.out.println("My PRN Number is "+PRN);
float weight=60.2f;
System.out.println("My Weight is "+weight);
char gender='f';
System.out.println("My gender is "+gender );
String dept="Mechanical engg";
System.out.println("My Department is "+dept);

}	
	public void univercity(String name,int PRN,double d,char gender,String dept)
	{System.out.println(name);
	System.out.println(PRN);
	System.out.println(d);
	System.out.println(gender);
	System.out.println(dept);
		
				
	}
}

package methods2;

public class Assignment1 {

	public static void main(String[] args) {
	familyinfo("Rohini", 2, "Halighongde", 5.2f, 23, 'f');
	System.out.println("-----------------------");
familyinfo("pooja", 3, "Welekar", 5.1f, 28, 'f');
System.out.println("-----------------------");
Assignment1 fo=new Assignment1();
fo.familyinfo1("Mahesh", 4, "Patil", 5.4f, 24, 'M');
System.out.println("-----------------------");
familyinfo2();
System.out.println("-----------------------");
fo.familyinfo1();



	}

	public static void familyinfo(String Name,int members,String surname, float height, int age,char gender )
	{
		System.out.println("My name is "+Name);
		System.out.println("There are "+members+" members in my family");
		System.out.println("My Surname is "+surname);
		System.out.println("My height is "+height+"feet");
		System.out.println("i am "+age+"years old ");
		System.out.println("i am "+ gender);
		
	}
	public void familyinfo1(String Name,int members,String surname, float height, int age,char gender )
	{
		System.out.println("My name is "+Name);
		System.out.println("There are "+members+" members in my family");
		System.out.println("My Surname is "+surname);
		System.out.println("My height is "+height+"feet");
		System.out.println("i am "+age+"years old ");
		System.out.println("i am "+ gender);
	}
	public static void familyinfo2()
	{
		String Name="Vaibhav";
		int members=5;
		String surname="Tupe";
		float height=5.7f;
		int age=29;
		char gender='M';
		
				System.out.println("My name is "+Name);
		System.out.println("There are "+members+" members in my family");
		System.out.println("My Surname is "+surname);
		System.out.println("My height is "+height+"feet");
		System.out.println("i am "+age+"years old ");
		System.out.println("i am "+ gender);		
		
	}
	public void familyinfo1()
	{
		String Name="Akshay";
		int members=4;
		String surname="Patil";
		float height=5.6f;
		int age=25;
		char gender='M';
		
				System.out.println("My name is "+Name);
		System.out.println("There are "+members+" members in my family");
		System.out.println("My Surname is "+surname);
		System.out.println("My height is "+height+"feet");
		System.out.println("i am "+age+"years old ");
		System.out.println("i am "+ gender);
	}
	
	
	
}

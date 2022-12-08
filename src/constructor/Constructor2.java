package constructor;

public class Constructor2 {
	//step-1
int a;//Variable declaration
int b;//Variable declaration
int c;//Variable declaration
//step-2
public Constructor2()
{a=85;//assign value
b=89;
c=75;
	
}


	public static void main(String[] args) {
		Constructor2 cc2=new Constructor2();//create object
cc2.sum();//calling non static method of class
cc2.multi();//calling non static method of class
	}
	//step -3
public void sum()
{
	int sum=a+b+c;
			System.out.println(sum);
			
}
public void multi()
{ 
	int multi=a*b*c;
	System.out.println(multi);
}
}

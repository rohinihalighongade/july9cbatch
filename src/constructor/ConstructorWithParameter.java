package constructor;

public class ConstructorWithParameter {
	//Step-1
int a;
int b;//Variable declaration
int c;//Variable declaration
int d;//Variable declaration

	public static void main(String[] args) {
		//step-4
	ConstructorWithParameter cc=new ConstructorWithParameter(1, 2, 3, 4);
	cc.multi();
	ConstructorWithParameter cc1=new ConstructorWithParameter(1, 2, 3, 4);
	cc1.add();

	}
	//step-2 constructor with parameter
public ConstructorWithParameter(int num,int num1,int num2,int num3) 
{a=num;
b=num1;
c=num2;
d=num3;	
}
//step-3
public void multi()
{
	int multi=a*b*c*d;
	System.out.println("Multiplication is "+multi);
}
public void add()
{int add=a+b+c+d;
System.out.println("addition is "+add);
	
}


}


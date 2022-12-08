package constructor;

public class Cc2 {
	//step-1
	int a;
	int b;//Variable declaration
	int c;//Variable declaration
	int d;
	public static void main(String[] args) {
Cc2 c1=new Cc2(5);//step-4
c1.addition();
Cc2 c2=new Cc2(5, 10);
c2.addition();

	}
	//step-2
public Cc2(int num)//single parameter
{a=num;	
}
public Cc2(int num,int num1)
{a=num;
b=num1;
	}
//step-3
public void addition()
{int add=a+b+c+d;
System.out.println("addition is "+add);
	}
}

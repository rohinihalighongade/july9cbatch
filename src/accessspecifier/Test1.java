package accessspecifier;

public class Test1 {
private int a=60;
int b=10;
protected int c=20;
public int d=30;

  	public static void main(String[] args) {
		Test1 mb=new Test1();//creating object of a class 
		mb.demo1();//calling private method from same class
mb.demo2();//calling default method from same class
mb.demo3();//calling protected method from same class
mb.demo4();//calling public  method from same class
//variable calling
System.out.println("calling private method from same class "+mb.a);
System.out.println("calling default method from same class "+mb.b);
System.out.println("calling protected method from same class "+mb.c);
System.out.println("calling public  method from same class "+mb.d);
	}
private void demo1()
{
	System.out.println("i am private method");
}
void demo2() {
	System.out.println("hi i am default method");
}
protected void demo3()
{
	System.out.println("hi i am  protected method");
}
public void demo4()
{
	System.out.println("i am public method");
}
}

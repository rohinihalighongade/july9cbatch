package interfacestudy3;

public interface Interface1 {
void m1();
void m2();
default void test()
{
	System.out.println("test 1 method from interface 1");
}
static void demo()
{
	System.out.println("static method from interface1");	
}
}

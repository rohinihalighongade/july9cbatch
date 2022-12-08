package interfacestudy3;

public interface Interface2 {
void m3();
void m4();
default void test()
{
	System.out.println("test method from interface2");
}
static void demo() {
System.out.println("static method from interface2");	
}
}

package interfacestudy;

public class IC  implements testinterface{

	public static void main(String[] args) {
IC i=new IC();
i.test();
i.test1();
int c=a+85;
System.out.println(c);
	}

	@Override
	public void test() {
		System.out.println("hi im thest method completed in implementation class");
		
	}

	@Override
	public void test1() {
		System.out.println("hi im thest method completed in implementation class");
		
		
	}

	
}

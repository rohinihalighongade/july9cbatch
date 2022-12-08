 package interfacestudy3;

public class ICC implements Interface1,Interface2 
{

	public static void main(String[] args) {
		ICC II=new ICC();
		II.m1();
		II.m2();
		II.m3();
		II.m4();
II.test();
Interface1.demo();
Interface2.demo();
	}

	@Override
	public void m3() {
		System.out.println("method from interface1");
		
	}

	@Override
	public void m4() {
		System.out.println("method from interface1");
	}

	@Override
	public void m1() {
		System.out.println("method from interface2");
		
	}

	@Override
	public void m2() {
		System.out.println("method from interface2");
		
	}

	@Override
	public void test() 
	{
		Interface1.super.test();
		Interface2.super.test();
		
	}


	public void demo() {
		// TODO Auto-generated method stub
		
	}

}

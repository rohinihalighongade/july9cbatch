package castingstudy;

public class upcasting {

	public static void main(String[] args) {
		Father f=new Father();
		f.home();
		f.money();
		son s=new son();
		s.home();
		s.money();
		s.phone();
		
		Father f1=new son();
		f1.home();
		f1.money();

	}

}

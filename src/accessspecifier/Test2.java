package accessspecifier;

public class Test2 {

	public static void main(String[] args) {
		Test1 rh=new Test1();
		rh.demo2();//calling default method from another class
		rh.demo3();//calling protected method from another class
        rh.demo4();//calling public  method from another class
//variable declartion
       // System.out.println("calling private method from another class "+rh.a);
        System.out.println("calling default method from another class "+rh.b);
        System.out.println("calling protected method from another class "+rh.c);
        System.out.println("calling public  method from another class "+rh.d);
	}

}

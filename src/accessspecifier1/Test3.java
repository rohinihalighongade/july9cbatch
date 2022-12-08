package accessspecifier1;

import accessspecifier.Test1;

public class Test3 {

	public static void main(String[] args) {
		Test1 qa=new Test1();
		//qa.demo1();//calling private method from another Package
//qa.demo2();//calling default method from another Package
//qa.demo3();//calling protected method from another Package
qa.demo4();//calling public  method from another cPackage
//variable declartion
// System.out.println("calling private method from another Package "+qa.a);
//System.out.println("calling default method from another Package "+qa.b);
//System.out.println("calling protected method from another cPackage"+qa.c);
System.out.println("calling public  method from another class "+qa.d);
	}

}

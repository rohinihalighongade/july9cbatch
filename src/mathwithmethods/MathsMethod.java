package mathwithmethods;

public class MathsMethod {

	public static void main(String[] args) {
		MathsUse.add();//static method from different class
		MathsUse sum=new MathsUse();//non static method from different class
		sum.demo();
		
MathsUse.sum(75, 20, 45, 89);//static method from different class with parameters
sum.sub(75, 63);//non static method from different class with parameters
	}

}

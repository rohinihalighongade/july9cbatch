package conditionalstatements;

public class ElseIfUse {

	public static void main(String[] args) {
		int marks=65;
		if(marks>=75)
		{
			System.out.println( "I am in dist.");
		}
		else if(marks>=60)
			{
			System.out.println("I am in 1st class");
			}
		else if(marks>=45)
		{System.out.println("I am in 2nd class");}
		else if(marks>=40)
		{System.out.println("i am just pass");
		}
		else {
			System.out.println("I am fail");
		}
	
	
	
	}
	

}

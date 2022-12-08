package arraystudy;

public class Array1 {

	public static void main(String[] args) {
		//want to share multipal roll No
		int s=10;
		//use array to store multipal nformation homogeneous
//array declaration
		int rn[]=new int[5];
		//array usage
		rn[0]=10;
		
		rn[1]=11;
		rn[2]=12;
		rn[3]=13;
		rn[4]=14;
		//array usage
		System.out.println(rn[0]);
		System.out.println(rn[1]);
		System.out.println(rn[2]);
		System.out.println(rn[3]);
		System.out.println(rn[4]);
		//=============================================================================
		System.out.println("============================================================");
		//use of static for loopp to print array
		for(int p=0;p<=4;p++)
		{
			System.out.println(rn[p]);
		}
		System.out.println("========================================================");
		//dynamic for loop
		for(int i=0;i<=rn.length-1;i++)
			
		{
			System.out.println(rn[i]);
		}
		System.out.println("=======================================================");
		//dynamic for loop in reverse order
		for(int i=rn.length-1;i>=0;i--)
		{
			System.out.println(rn[i]);
		}
		System.out.println("=============================================================");
		
		
		
		
		
		
		
		
		

	}

}

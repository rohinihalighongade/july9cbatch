package arraystudy;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		char grade[]= {'a','b','c'};
		
		String Name[]= {"Rohini","Rohit","Rohan","Mahadev","Pooja","Rajkumar"};
		//use of dynamic for loop
		for(int y=0;y<=Name.length-1;y++)
		{
			System.out.println(Name[y]);
		}
		System.out.println("================================================================");
//using sort array
		Arrays.sort(Name);
		
				for(int y=0;y<=Name.length-1;y++)
				{
					System.out.println(Name[y]);
				}
		System.out.println("=====================================================================");		
				
				
				
				
				
				
				
				
				
	}
	

}

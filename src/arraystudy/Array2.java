package arraystudy;

public class Array2 {

	public static void main(String[] args) {
		String city[]=new String[6];
		city[0]="Mumbai";
				city[1]="Pune";
				city[2]="Nagpur";
				city[3]="Latur";
				city[4]="Udgir";
				city[5]="Akurdi";
				//dynamic printing using for loop
				for(int i=0;i<=city.length-1;i++)
				{
					System.out.println(city[i]);
				}
				System.out.println("======================================================");
				//dynamic printing in reverse order
for(int i=city.length-1;i>=0;i--)
{
	System.out.println(city[i]);
}
	}

}

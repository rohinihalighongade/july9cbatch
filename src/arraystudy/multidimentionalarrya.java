package arraystudy;

public class multidimentionalarrya {

	public static void main(String[] args) {
		int id [][]=new int[2][2];
		
id[0][0]=5;
id[0][1]=10;
id[1][0]=15;
id[1][1]=20;
for(int i=0;i<=id.length-1;i++)
{
	for(int j=0;j<=id.length-1;j++)
	{
		System.out.print(id[i][j]+" ");
	}
	System.out.println();
}
	}

}

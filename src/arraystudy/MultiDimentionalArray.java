package arraystudy;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		char grade[][]= {{'A','B','C'},{'D','E','F'}};
		for(int i=0;i<=grade.length-1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(grade[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}

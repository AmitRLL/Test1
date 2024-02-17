package ArrayTest;

public class twoDdimension {
	public static void main(String[] args)
	{
		//Type-->1(Matrix Array)
		int[][] a= {{1,2,3,4,5,6,7,8,9},{11,12,13,14},{21,22,23,24,25}};
		System.out.println(a);
		System.out.println(a[0][0]);
		for(int i=0;i<a.length;i++) //it give length of Row
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+",");
			}
		}
		System.out.println();
		
		//Type-->2
		int[][] b=new int[4][5];//4-rows,5-column
		b[0][0]=51;
		b[0][1]=52;
		b[0][2]=53;
		b[0][3]=54;
		b[0][4]=55;
		b[1][0]=61;
		b[1][1]=62;
	    b[1][2]=63;
		b[1][3]=64;
		b[1][4]=65;
		System.out.println(b);
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println(b[i][j]+",");
			}
		}
		
										
	}

}

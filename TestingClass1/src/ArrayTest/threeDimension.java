package ArrayTest;

public class threeDimension {
	public static void main(String[] args) {
		int[][][] a= {{{10,20,30,40,50,60,70,80,90},{11,12,13,14,15,16,17,18,19}},{{21,22,23,24,25,26,27,28,29,3},{31,32,33,34,35,36,37,38,39}}};
		System.out.println(a[0][0][0]);
		System.out.println(a[1][1][8]);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+",");
				}
			}
		}System.out.println();
		
		int[][][] b;
		b=new int[2][3][6];
		b[0][0][0]=1;
		b[0][0][1]=2;
		b[0][0][2]=3;
		b[0][0][3]=4;
		b[0][0][4]=5;
		b[0][0][5]=6;
		b[0][1][0]=11;
	}

}

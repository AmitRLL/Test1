package ArrayTest;

public class singledimensional {
	public static void main(String[] args) {
		
	//Type-->1	
	int[] a = new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
  //a[5]=60;
  //a[6]=70;
	System.out.println(a);
	System.out.println(a[0]);
	System.out.println(a[1]);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+",");
	}

	
System.out.println();
	
	for(int j:a) {
		System.out.print(j+","); //10,20,30,40,50,
	}
	System.out.println();
	
	
	//Type-->2
	int[] b= {11,12,13,14,15,16};
	System.out.println(b);
	System.out.println(b[0]);//11
	System.out.println(b[1]);//12
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+",");  //11,12,13,14,15,16,
	}
	System.out.println();
	
	//Type-->3
	int[] c=new int[] {21,22,23,24,25,26};
	System.out.println(c);
	System.out.println(c[0]); //21
	System.out.println(c[1]);
	System.out.println(c[2]);
	for(int k:c) {
		System.out.print(k+",");
	}
	System.out.println();
	
	//Type-->4(String)
	String[] e= {"amit","pawan","ujjawal","uday"};
	String[] f=new String[] {"java","c++","paython"};
	String[] g=new String[2];
	g[0]="tannu";
	g[1]="lilhare";
	
	String[] h;
	h=new String[5];
	
	char[] k;
	k=new char[2];
	k[0]='1';
	k[1]='2';
	System.out.println(k+",");
	System.out.println(k[0]);
	
	
	System.out.println(e);
	System.out.println(e[0]);
	
	
	
	
}
}


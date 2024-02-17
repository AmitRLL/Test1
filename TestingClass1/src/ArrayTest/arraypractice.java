package ArrayTest;

import java.util.ArrayList;
import java.util.Iterator;

public class arraypractice {
public static void main(String[] args) {
	int[] a = new int[6];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	a[5]=6;
//	a[6]=7;//It is not allow it show out of bound exception.
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}
	
	Object[] b= new Object[10];
	b[0]="amit";
	b[1]=1;
	System.out.println(b[0]);
	System.out.println(b[1]);
	
	int[] c= {11,12,13,14,15,16,17,18};
	for(int i =0;i<c.length;i++) 
	{
		System.out.println(c[i]);
	}
	
	ArrayList d = new ArrayList();
	d.add("hii");
	d.add("amit");
	d.add(101);
	d.add(102);
	System.out.println(d);
	d.add(1, "Mr");
	System.out.println(d);
	System.out.println(d.get(4));
	Iterator it = d.iterator();
	while(it.hasNext()) 
	{
		System.out.println(it.next());
		
	}
	
	for(Object f:d)
	{
		System.out.println(f+",");
	}
	d.remove(0);
	System.out.println(d);
	System.out.println(d.contains("amit"));//true
	System.out.println(d.contains("hii"));//false
	System.out.println(d.isEmpty());//false
	
	
	ArrayList al =new ArrayList();
	al.addAll(d);
	System.out.println(al);//[Mr, amit, 101, 102]
	//al.clear();
	al.removeAll(d);
	System.out.println(al);//[]
	System.out.println(d);//[Mr, amit, 101, 102]
	System.out.println(al.isEmpty());
	
	
}
//it will not run it is compile but not run.
//public static void main1(String[] args) {
//	int[] s= {1,2,3};
//	System.out.println(s[1]);
//	
//}
}

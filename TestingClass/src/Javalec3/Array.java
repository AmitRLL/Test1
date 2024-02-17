package Javalec3;

public class Array {
	//it is non primitive data type 
	//in it one time declare then never add 
	//it size is not fix
	//array always store homogeneous data
	//it is collection of separate character type entities. 
	public static void main(String[] args) {
		String[] a = {"Amit","pawan","uday","ujjawal"};//first type to declare to Array'[]'
		System.out.println(a[0]);
		String b[] = {"aman","suraj","akhiles","abhisek"};//second type
		String[] c = new String[15];//third type
		c[0] = "Harsal";
		c[1] = "Akash";
		System.out.println(b[1]);
		System.out.println(c[0]);
		
		int len = a.length;
		for(int d =0;d<=len-1;d++) {
			System.out.println(a[d]);
		}
		//System.out.println(len)
		Object h[] =new Object[10];
		h[0]=10;
		h[1]="amit";
		h[2]="lilhare"; 
		h[3]=20;
		System.out.println(h[2]);
	}

}

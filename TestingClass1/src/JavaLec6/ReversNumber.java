package JavaLec6;

public class ReversNumber {
	public static void main(String[] args) {
	int a = 54321;
	int rem;
	int rev =0;
	
	while(a!=0) {
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
	}
	System.out.print(rev);
	System.out.println();
	
	
	
	//Maximum and Minimum value in array
	//example:4,3,5,2,1,6
	int b[] = {4,3,5,2,1,6};
	//System.out.println(b.length);
	int max =b[0];
	for(int i=1;i<b.length;i++) {
		if(b[i]>max) {
			max= b[i];
		}
	}
	System.out.println("maximum is:"+max);
	
	int c[] = {4,3,5,2,1,6};
	int min =b[0];
	for(int j=1;j<c.length;j++) {
		if(c[j]<min) {
			min= c[j];
		}
		}
	System.out.println("minimum is:"+min);
	}	

}

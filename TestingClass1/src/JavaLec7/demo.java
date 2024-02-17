package JavaLec7;

public class demo {
	public static void main(String[] args) {
	int a= 0;
	int b= 0;
	String s1 = "qwertyuiopasdfghjklzxcvbnm";
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') 
		{
			a= a+1;
		}
		else
		{
			b = b+1;
		}
	}
	System.out.println(a);
	System.out.println(b);
	

	//find odd and even number
	 int g[] = {1,2,3,4,5,6,7,8,9};
	 int even = 0;
	 int odd = 0;
	 for(int i=0;i<=g.length-1;i++)
	 {
	    if(g[i]%2==0)
	    {
	     even = even + 1;
	     }
	     else
	     {
	      odd = odd + 1;
	     }
	 }System.out.println(even);
	  System.out.println(odd);
	  
}
}
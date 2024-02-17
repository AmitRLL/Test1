package JavaLec6;

public class ReversString {
	public static void main(String[] args) {
		
	
	String a= ("Amit Lilhare");
	int len = a.length();
	for(int i=len-1;i>=0;i--) {
		System.out.print(a.charAt(i));
		
		
	}
	System.out.println();
	String b = ("Hey iam selenium");
	int le = b.length();
	for(int j=le-1;j>=0;j--) {
		System.out.print(b.charAt(j));
	}
	}
}

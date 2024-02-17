package JavaLec1;

public class practic1 {
//	static int m=78;  //i am trying to write static value in non static method
//	public  void arl() {
	//	 int l =12;
//	}
	public static void main(String[] args) {
	
	for(int a=1;a<=5;a++) {
		for(int b=1;b<=a;b++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int a=1;a<=5;a++) {
		for(int b=4;b>=a;b--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int a=5;a>=1;a--) {
		for(int b=5;b>=a;b--) {
			System.out.print(b+" ");
			
		}
		System.out.println();
	}
	for(int a=5;a>=1;a--) {
		for(int b=5;b>=a;b--) {
			System.out.print(b+" ");
		}
		System.out.println();
	}
	
	
	//prime no
	int num = 7;
	int f =0;
	for(int a=2;a<=num-1;a++)
	{
		
		if(num%a==0) {
			f=f+1;
		}
		
	}
	if(f>0) {
		System.out.println(num +"it is not prime number");
	}else {
		System.out.println(num +"it is prime number");
	}
	
	
	
	
	
	
	
	
	
	}
}

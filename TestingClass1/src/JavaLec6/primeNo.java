package JavaLec6;

import java.util.Scanner;

public class primeNo {
	public static void main(String[] args) {
		Scanner obj = new  Scanner(System.in);
		System.out.println("enter number");
		int num= obj.nextInt();//7
		
		int f = 0;
	
		for(int j = 2;j<=num-1;j++)
		{
			if(num% j==0)//  7/2
			{
				f=f+1;
			}
		}
			if(f>0) {
				System.out.println("it is not prime number");
			}
			else {
				System.out.println("it is prime number");
			}

}
}

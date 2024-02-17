package JavaLec6;

import java.util.Scanner;

public class palandrome1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number");
		int no = obj.nextInt();
		int t1 = no;
		int sum = 0;
		int rem;
		while(t1>0)
		{
			rem =t1%10;
			sum =(sum*10)+rem;
			t1=t1/10;
		}
		if(sum==no)
		{
			System.out.println("it is pallandrome");
		}else {
			System.out.println("it is not pallandrome");
		}
	}

}

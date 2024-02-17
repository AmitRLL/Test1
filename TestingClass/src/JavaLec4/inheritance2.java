package JavaLec4;

import java.util.Scanner;

public class inheritance2 {
	
	//Hierarchical or hybrid
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the number which table you want");
		int i = obj.nextInt();
		
		
		for(int n=1;n<=10; n++)
		{
			System.out.println(n*i);
		}
		
		
		
		
	}

}

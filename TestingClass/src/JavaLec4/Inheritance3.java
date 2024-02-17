package JavaLec4;

import java.util.Scanner;

public class Inheritance3 {
	public void Demo(){
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter the amount");
		int amount = obj1.nextInt();
		if(amount%100==0) {
			System.out.println("enter the pin");
		}
		else {
			System.out.println("enter amount multiple of 100");
		}
		
		
	}
	public void main(String[] args) {
		Inheritance3 obj3 =new Inheritance3();
		obj3.Demo();
	}

}

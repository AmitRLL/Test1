package Javalec3;

public class constructor {
	constructor(){
		System.out.print("Name ");
		
	}
	constructor(String a){
		System.out.println("Age");
	}
	constructor(int c,int a,int b){
		int k = 12;
		int l = 34;
		int u = k+l;
		System.out.println(u);
		
		
		
	}
	public void ujj() {
		int b =25;
		
		System.out.println("Amit Lilhare");
		//System.out.print("         ");
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		constructor obj = new constructor();
		
		constructor obj1 = new constructor("name");//constructor string ke jagah name pass kro
		
		//obj.ujj();
		obj.ujj();
		obj1.ujj();
		constructor obj2 = new constructor(3,1,2);
		obj2.ujj();
		
		
	}

}

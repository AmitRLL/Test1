package JavaLec4;

public class inheritance1 extends inheritance  {
	//child
	int d = 40;
	String name1 = "katraj";
	
	public void demo() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		//inheritance obj = new inheritance();
		//obj.addition(12, 25);
		//by using this class name we call another class value
		//by using extends key word 
		inheritance1 obj = new inheritance1();
		obj.addition(45, 45);
		System.out.println(obj.a);
		System.out.println(obj.d);
		System.out.println(obj.name);
		System.out.println(obj.name1);
		obj.arl();
		obj.subtrac(45, 15);//protected 
		//obj.multi not showing because it is private 
	}

}

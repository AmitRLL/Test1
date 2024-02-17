package JavaLec5;

public class overiding2 extends overiding {
	
	public void cat1() {  //it is modified in this class 
	int a = 13;
	int b = 14;
		System.out.println(a+b);
	}
	public static void cat3() {
		String name = "i am tester";
		System.out.println(name);
	}
	public static void main(String[] args) {
		overiding2 obj1 = new overiding2();
		obj1.cat1();//it is modified value 
		obj1.cat2(42, 30);
		overiding.cat3();
	}

}

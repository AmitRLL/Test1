package JavaLec5;

public class Abst2 extends Abst1 {//this class is called concrete
	public void dog1() {
		System.out.println("Condition: ");
		System.out.println("if ans true than a is greater");
		}
	public void dog2() {
		System.out.println("if ans false than b is greater");
		
	}
	public static void main(String[] args) {
		Abst2 obj1 = new Abst2();
		obj1.dog();
		obj1.dog1();
		obj1.dog2();
	}

}

package JavaLec6;

public class demo {
	
	static int a = 34;//global static or non-static is call in any method whether it is static or non-static method 
	public void test1() {
		int b= 25;
	}
	
	 public void test() {
		System.out.println(a);
		//System.out.println(b); "b" is a local variable so it is not call in another method.
	}
	public static void main(String[] args) {
		demo obj = new demo();
		obj.test();
		
	}
	
	

}

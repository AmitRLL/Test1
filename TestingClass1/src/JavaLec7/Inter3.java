package JavaLec7;

public class Inter3 implements Inter2 {

	public void test1(int a,int b) {
		int add = a+b;
		System.out.println(add);
		
		}

	
	public void test3() {
		String nam = "testing";
		System.out.println(nam);
		
	}

	
	public void test4() {
		int f = 10;
		int g = 20;
		System.out.println(f+g);
		
	}
	public static void main(String[] args) {
		Inter3 obj = new Inter3();
		obj.test1(50, 60);
		obj.test3();
		obj.test4();
		Inter2.test2();
	}
	

}

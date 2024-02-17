package JavaLec7;

public interface Inter2 extends Inter1 {
	public void test1(int a,int b);
	public static void test2() {
		String name1 = "is a automation tester";
		System.out.println(name1);
		System.out.println(name);
		System.out.println(name1);
			
	}
	public void test3();
	public void test4();
	public static void main(String[] args) {
		Inter2.test2();
		Inter1.test2(); 
	}
	

}

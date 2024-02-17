package JavaLec7;

public interface Inter1 {
	int a = 12;
	int b = 20;
	int c = a + b ;
	String name = "Amit Lilhare";
	public void test1(int a,int b);//by default it is public,final and abstract.
	public static void test2() { //in interface we can right complete method in case of 'static'.
	int d = 30;
	String name1 = "Is software tester";
	System.out.println(name);
	System.out.println(c);
	System.out.println(name1);
	}
	void test3();
	void test4();
	public static void main(String[] args) {
		//Inter1 obj = new Inter1();//we cannot create object in interface because there no construction are present.
		Inter1.test2();
	}
	
}

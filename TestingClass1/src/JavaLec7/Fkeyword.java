package JavaLec7;

public class Fkeyword {
	final int a = 12;
	      int b = 24;
	public final void test() {
		int c = a+b;
		System.out.println(c);
	}
	public void test1() {
		int d = 60;
		int e = 50;
		int f = d-e;
		System.out.println(f);
	}
	public static void main(String[] args) {
		Fkeyword obj = new Fkeyword();
		System.out.println(obj.a);
		System.out.println(obj.b);
		//obj.a=15; it is not modified because it is final
		//System.out.println(obj.a);
		obj.b=45;
		System.out.println(obj.b);
		obj.test();
	}

}

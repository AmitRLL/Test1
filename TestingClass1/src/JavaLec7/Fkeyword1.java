package JavaLec7;

public final class Fkeyword1 extends Fkeyword {
	//public void test() {} it is not overriding because it is final
	public void test1() {
		int d = 70;
		int e = 35;
		int f = d+e;
		System.out.println(f);

		}
	public static void main(String[] args) {
		Fkeyword1 obj1 = new Fkeyword1();
		obj1.test1();
		
	}
		
	
	

}

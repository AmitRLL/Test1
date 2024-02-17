package JavaLec2;



public class AccessSpecifier {  //it is class
	
	//public
	//default
	//protected
	//private
	
	
	
	int a = 85;//Non-static
	static int b = 57;
	int f ;
	int g ;
	
	//default access specifier.
	void test() {
		String n = "amit";
		System.out.println(n);
	}
	
	//public access specifier.(why 9:00)
	public void test1() {
		int c = a+b;//we call static and non-static value in non-static.
		System.out.println(c);
	}
	public void test2(int a, int b) {
		int substract = a-b;
		System.out.println(substract);
	}
	public void test3(int f, int g) {
		int j = f+g;
		System.out.println(j);
		
	}
	
	//PUBLIC ACCESS SPECIFIER CALL FROM ANOTHER PROJECTvoid 
	public static void main(String[] args) {
		Method2 uday = new Method2();
		uday.addition();
		AccessSpecifier obj = new AccessSpecifier();
		System.out.println(obj.a);//int=a is non-static value so without object it is not call.
		System.out.println(b);//int 'b' is static value so it can call without object.
		uday.subtraction();
		obj.test3(45, 45);
		obj.test();
		obj.test();
		
		
	}
	
	

}

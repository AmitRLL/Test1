package JavaLec4;

public class inheritance {
	//parent class inheritance
	int a = 20;
	String name = "velocity";
	
	
	//default 
	void arl() {
		int f = 78;
		System.out.println(f);
		//String name2 = "amit";
		//System.out.println(name2);
	}
	
	//public access
	public void addition(int a,int b) {
		int c = a + b;
		System.out.println(c);
		
	}
	
	//protected access specifier
	protected void subtrac(int a, int f) {
		int g = a-f;
		System.out.println(g);
	}
	private void multi(int a,int f) {
	   int k = a*f;
	   System.out.println(k);
	}
	
	
	public static void main(String[] args) {
		inheritance obj1 = new inheritance();
		obj1.arl();
		obj1.subtrac(14, 25);
		obj1.multi(12, 2);
	}
	

}

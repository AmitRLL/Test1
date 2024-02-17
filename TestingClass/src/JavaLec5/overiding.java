package JavaLec5;

public class overiding {
	public void cat1() {
		int a = 24;
		int b = 12;
		System.out.println(a-b);
	}
	public void cat2(int c,int d) {
		System.out.println(c+d);
	}
	public static void cat3 () {
		int c = 50;
		String name = "testers";
		System.out.println(c);
		System.out.println(name);
				
		
	}
	public static void main(String[] args) {
		overiding obj = new overiding();
		obj.cat1();
		obj.cat2(45, 20);
	}



}

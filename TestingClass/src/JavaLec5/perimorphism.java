package JavaLec5;
//overloading
public class perimorphism {
	public void arl() {
		System.out.println("i am software tester");
	}
	public void arl(int a,int j) {
		System.out.println("i am software tester");
	}
	public void arl(int a) {
		int b = 12;
		int c = 12;
		int d = b+c;
		System.out.println(d);
	}
	
	public void arl(int s,int e,String k) {
		for(int h =5;h>=1;h--) {
			for(int g =5;g>=h;g--) {
				System.out.print(g);
			}
			System.out.println();
		}
		for(int u =1;u<=5; u++) {
			for(int l=5;l>=u;l--) {
				System.out.print(l);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		perimorphism obj = new perimorphism();
		obj.arl();
		obj.arl(1);
		obj.arl(2, 3, "hg");
	}

}

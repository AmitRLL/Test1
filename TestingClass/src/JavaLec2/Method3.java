package JavaLec2;

public class Method3 {
	static int a = 20;//static // class variables
	int b = 30;//non statics
	public void addition() {
		System.out.println(a);
	}
	public void subtraction() {
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		Method3 obj = new Method3();
		obj.addition();
		obj.subtraction();

	}

}

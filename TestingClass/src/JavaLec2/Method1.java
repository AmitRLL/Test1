package JavaLec2;

public class Method1 {
	// INSERT PARAMETER IN METHOD
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Method1 obj = new Method1();
		obj.addition(12, 12);
       obj.addition(120, 145);
	}
	

}

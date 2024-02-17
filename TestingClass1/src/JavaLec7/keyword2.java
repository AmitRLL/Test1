package JavaLec7;

public class keyword2 extends keyword1 {//child class
int a =100;
String name = "Amit lilhare";

public void test() {
	 int c = 55;
	String name1 = "class for keyword";
	System.out.println(c);
	System.out.println(name1);
}

public void addition(int a,int b) {
int c = a-b;
System.out.println(c);
super.addition(a, b);  //super keyword gives to call the property of super class.
}
public void test1() {
	System.out.println(super.a);// will call parent property
	System.out.println(super.name);//wil call parent property
	System.out.println(this.a);
	
}
public static void main(String[] args) {//note: cannot call super keyword directly in main method
	keyword2 obj = new keyword2();
	obj.addition(25, 12);
	System.out.println(obj.a);
	System.out.println(obj.name);
	obj.test1();
	
	
	
	}
}

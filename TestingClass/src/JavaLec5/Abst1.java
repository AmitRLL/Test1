package JavaLec5;

public abstract class Abst1 {//one method is complete and one or more method is incomplet is called abstractor
	
public void dog() {
	int a = 20;
	int b = 10;
	boolean c = true ;
	boolean d = false;
	if(a>b) {
		System.out.print("Answer: ");
	System.out.println(c);
	}else {
		System.out.println(d);
	}
}
	public abstract void dog1(); 
	
	public abstract void dog2();
 
public static void main(String[] args) {
	//Abst1 obj = new Abst1();
	//obj.dog();
}

}

package JavaLec2;

public class Method2 {
     int a = 20;// global variable which variable gives in class and they are non-static
     int b = 12;//non-static variable.
     
     public void addition() {
    	 System.out.println(a+b);
    	 
     }
     public void subtraction() {
    	 System.out.println(a-b);
     }
     public static void main(String[] args) {
    	 Method2 obj = new Method2();
    	 obj.addition();
    	 obj.subtraction();
     }
	

}

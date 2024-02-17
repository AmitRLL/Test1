package Javalec3;

public class stringLec{
	String s1 = "Hello";
	static String s5=" amit";
   static String s6=" lilhare";
    String s2 = new String("Hello Guys");
    String s3 = new String("Hello Guys");
    String s4 = new String("hello");
    public static void main(String[] args){
        stringLec obj = new stringLec();
        System.out.println(obj.s1);
        System.out.println(obj.s2);
        System.out.println(obj.s1.charAt(1));//index number will find out
        System.out.println(obj.s1.concat(" all"));//attach any name 
        System.out.println(obj.s1.length());//to find out length
        System.out.println(obj.s1.toLowerCase());//to write in smaller form
        System.out.println(obj.s1.toUpperCase());//to write in capital letter
        System.out.println(obj.s1.equals(obj.s2));//to check weather s1 is equal to s2 here it is false
        System.out.println(obj.s2.equals(obj.s3));//to check weather s2 is equal to s3 here it is true
        System.out.println(obj.s1.equalsIgnoreCase(obj.s4));
        System.out.println(obj.s1.concat(s5).concat(s6));
		
    }

}

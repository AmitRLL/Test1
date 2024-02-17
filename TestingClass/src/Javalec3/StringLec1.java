package Javalec3;

public class StringLec1 {
	public static void main(String[] args) {
	//Print the given string in reverse form
	String a = "MOM";
	int len = a.length();//save length in variable form
	String s1 = "";
	System.out.println(len);
	for(int d=len-1;d>=0;d--) {
		System.out.print(a.charAt(d));//is me charAt me (int ke sath index ginta hai)
		
		s1 = s1+(a.charAt(d));
	}
	
	System.out.println();
	
	
	if(a.equals(s1)) {
		
		System.out.println("it is pallendrom");
	}
	  else{
		  
		    System.out.println("it is not pallendrom");
	      }
	
	
	}	

}

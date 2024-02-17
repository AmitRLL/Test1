                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
package JavaLec;

public class Loops {
	public static void main(String[] args) {
		int a = 1;
		
		// write 1 to 10 we use while loop
		while(a<=10) {       
			System.out.print(a);
			a++;
			System.out.print(",");
		}
		
		
		System.out.println();
		
		
		//  print  2 tables
		int f = 1;
		while(f<=10) {
		System.out.print(f++*2);
		System.out.print(",");
		}
		
		
		System.out.println();
		
		
		 //(to print 0112233445566 than write this code)
		int b = 1;
		while(b<=20) { 
			System.out.println(b/2);
			b++;
	    }
		
		
		//to print odd numbers
		int e = 0;
		while(e<=10) {
			System.out.println((e*2)+1);
			e++;
		}
	}

}

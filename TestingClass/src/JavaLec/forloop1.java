package JavaLec;

public class forloop1 {
	public static void main(String[] args) {
	 for(int a=1;a<=5;a++){
         for(int b=1;b<=a;b++){
             System.out.print(b +"  ");//1,
         }
         System.out.println();
     }
	 for(int c=4;c>=1;c--){
         for(int d=1; d<=c;d++){
             System.out.print(d+"  ");
         }
         System.out.println();
     }
     for(int a=1;a<=5;a++){
         for(int b = 5;b>=a;b--){
             System.out.print( b+"   " );
         }
         System.out.println();
     }
     
     
     //number triangle
     for(int a=1;a<=5;a++) {
 		for(int b=1;b<=a;b++) {
 			System.out.print(b+" ");
 			
 		}
 		System.out.println();
 	}
 	for(int a=5;a>=1;a--) {
 		for(int b=1;b<=a;b++) {
 			System.out.print(b+" ");
 		}
 		System.out.println();
 	}
 	
 	
     // programm for prime number
    	    int num = 20;
    	    boolean flag = false;
    	    for (int i = 2; i <= num / 2; ++i) {
    	      // condition for nonprime number
    	      if (num % i == 0) {
    	        flag = true;
    	        break;
    	      }
    	    }

    	    if (!flag) {
    	      System.out.println(num + " is a prime number.");}
    	    else {
    	      System.out.println(num + " is not a prime number.");}
    	    
    	//////////////////////////////////////////    
    	    for(int e=1;e<=5;e++) {
    			for(int f=5;f>=e;f--) {
    				System.out.print(" ");
    			}
    			for(int g=1;g<=e;g++) {
    				System.out.print("*");
    			}
    			for(int h=2;h<=e;h++) {
    			System.out.print("*");
    			}
    			System.out.println();
    		}
    	    
    	
    //////////////////////////////////////////////////////
    	    int rows = 5, k = 0;

    	    for (int i = 1; i <= rows; i++, k = 0) 
    	    {
    	      for (int space = 1; space <= rows - i; space++)//1<4;
    	      {
    	        System.out.print("  ");
    	      }

    	      while (k != 2 * i - 1) {
    	        System.out.print("* ");
    	        k++;
    	      }

    	      System.out.println();
    	    }
    	    
    	  }

}

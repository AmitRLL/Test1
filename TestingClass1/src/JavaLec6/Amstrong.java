package JavaLec6;

public class Amstrong {//(1^3 + 5^3 + 3^3)
	public static void main(String[] args) {
	//find length
     int no = 153;
     int t1 = no;
     int leng = 0 ;
     
     while(t1 != 0) 
     {
    	 t1 = t1/10;
    	 leng = leng + 1;
    	 
      }
    // reverse a number 
     int t2 = no;
     int rem;
     int arms = 0;
     while(t2 != 0) {
    	 int mult =1;
    	 rem = t2%10;
    	 for(int i =1;i<=leng;i++) {
    		 mult = mult*rem;
    	 }
    	 arms = arms+mult;
    	 t2 = t2/10;
     }
     if(arms==no) {
    	 System.out.println("No. is Amstrong"+arms);
     }
     else
     {
    	 System.out.println("No. is not Amstrong");
     }
   }
}

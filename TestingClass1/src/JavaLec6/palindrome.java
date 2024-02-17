package JavaLec6;

public class palindrome {
	 public static void main(String args[]){ 
			 int n=454;//It is the number variable to be checked for palindrome
		     int rem;
		     int sum=0;
		     int t1;    
		     t1=n;
		     
		    while(n>0)
		    {    
		    rem=n%10;  //getting remainder  
		    sum=(sum*10)+rem;    
		    n=n/10;    
		    } 
		    
		  if(t1==sum)
		  {
		   System.out.println("palindrome number ");
		  }
		  else 
		  {
		   System.out.println("not palindrome");  
		  }
		}  
		 

}

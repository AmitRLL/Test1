 package JavaLec;

public class Forloop {
	public static void main(String[]  args) {
		// odd numbers
		for(int a=0;a<=5;a++) 
		 {
			System.out.print((a*2)+1);
			System.out.print(",");
			
		}
		System.out.println();
		
		//FIRST FOR LOOP for right angle triangle
		
		for(int a =1;a<=5;a++)
		{
			for(int c =1;c<=a;c++) 
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
		for(int m = 1;m<=5;m++)
		{
			for(int n =4;n>=m;n--) 
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	   //SECOND FOR LOOP for right angle triangle
		for(int d =4;d>=1;d--)
		{
			for(int e =1;e<=d;e++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//THIRED FOR LOOP equilateral triangle and making diamond
		for(int a=1;a<=6;a++) 
		{
			for(int b=6;b>=a;b--)
			{
				System.out.print(" ");
			}
			for(int d=1;d<=a;d++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int q=1;q<=6;q++) 
		{
			for(int r=6;r>=q;r--)
			{
				System.out.print(" ");
			}
			for(int s=1;s<=q;s++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int a=1;a<=6;a++)
		{
			for(int b=1;b<=a;b++) 
			{
				System.out.print(" ");
			}
			for(int d=6;d>=a;d--) 
			{
				System.out.print("*");
			}
		
			System.out.println();
		}
		
		
		//FORTH FOR LOOP tiangle
			
		for(int e=1;e<=6;e++) 
		{
			for(int b=6;b>=e;b--) 
			{
				System.out.print(" ");
			}
			for(int d=1;d<=e;d++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int f=1;f<=6;f++) 
		{
			for(int b=1;b<=f;b++)
			{
				System.out.print(" ");
			}
			for(int d=6;d>=f;d--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//fifth loop for trapazium
		for(int a=1;a<=6;a++) 
		{
			for(int b=1;b<=a;b++) 
			{
				System.out.print(" ");
			}
			for(int d=9;d>=a;d--)
			{           
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		// square
		for(int a=1;a<=5;a++) 
		{
			for(int b=5;b>=1;b--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		      for(int a=1;a<=5;a++)
		      {
		          for(int b = 5;b>=a;b--)
		          {
		              System.out.print( b );
		          }
		          System.out.println();
		      }
		      
		      System.out.println();
		      for(int r=0;r<=5;r++)
		      {
		    	  for(int h=0; h<=r;h++)
		    	  {
		    		  System.out.print(" ");
		    	  }
		    	  for(int t=9;t>=r;t--)
		    	  {
		    		  System.out.print("* ");
		    	  }
		    	  System.out.println();
		      }
		
			
		}
	}



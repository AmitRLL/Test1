package JavaLec;

public class Method
{
  public void triangle()
  {
	for(int a=0;a<=4;a++)
	 {
		for(int b=4;b>=a;b--) 
		   {
			System.out.print("*");
			}
		for(int c=2;c<=((a*2)+1);c++)
		{
			System.out.print(" ");
		
		}
		for(int d=4;d>=a;d--)
		{
			System.out.print("*");
		}
		System.out.println();
	 }
  }
  
  
  
	public static void reverstriangle() 
	{
	  for(int a=1;a<=5;a++)
	  {
		  for(int b=4;b>=a;b--)
		  {
			System.out.print("* ");
		  }
		System.out.println();
	 }
	
	}
	public static void main(String[] args) {
		Method.reverstriangle();    //THIS IS FOR STATIC VALUE
		Method result = new Method();  // THIS OBJECT CREATION FOR NON-STATIC VALUE
		result.triangle();
	
	}

}

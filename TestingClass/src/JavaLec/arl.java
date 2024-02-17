package JavaLec;

public class arl {
	
	public void test() 
	{
		System.out.println("class");
	}
	
	public int test1()
	{
         int b = 12;
	     int c = 14;
	     int d = b+c;
	     System.out.println(d);
	     return d = b-c;
	     
	
	}
	
	public static void main(String[] args)
	{
		arl obj = new arl();
		obj.test();
		System.out.println(obj.test1());
	}

}

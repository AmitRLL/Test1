package JavaLec;

public class Variable2 {
	public static void main(String[] args) {
		//System.out.println("hello worl");
		
		//Unary Oprators
		int a = +1;
		System.out.println(a);//1
		
		int b = -1;
		System.out.println(b);//-1
		
		//pre-increment
		System.out.println(++a);//2
		System.out.println(a);//2
		
		//post-increment
		System.out.println(a++);//2
		System.out.println(a);//3
		
		System.out.println(--a);//2
		System.out.println(a);//2
		
		System.out.println(a--);//2
		System.out.println(a);//1
		//Relational Oprators
		boolean c = a<1;
		System.out.println(c);//false
		boolean d = a>0;
		System.out.println(d);//true
		boolean e = a==5;
		System.out.println(e);//false
		 int f = 43;
		 int g = 45;
		 boolean h = f<g;
		 System.out.println(h);//true
		 //Logical Operator
		 boolean i = (f<g)&&(f==g);//AND logic(one of the logic is false then Ans is false)
		 System.out.println(i);//false
		 boolean j = (f<g)||(f==g);//OR logic(one of the logic is true then Ans is true)
		 System.out.println(j);//true
		 
		 
		
		
	}

}

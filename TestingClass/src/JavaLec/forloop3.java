package JavaLec;

public class forloop3 {

public static void main(String[] args) {
	for(int a=1;a<=5;a++) {
		for(int b=1;b<=a;b++) {
			System.out.print(b);
		}
		System.out.println();
	}
		
		System.out.println();
	for(int c=1;c<=5;c++) {
		for(int b=1;b<=c;b++) {
			System.out.print(c);
		}
		System.out.println();
	}
	System.out.println();
	for(int d=0;d<=4;d++) {
		for(int b=0;b<=d;b++) {
			System.out.print((d*2)+1);
		}
		System.out.println();
	}
	
	
	System.out.println();
	for(int e=0;e<=4;e++) {
		for(int f=5;f>=e;f--) {
			System.out.print(" ");
		}
		for(int b=1;b<=((e*2)+1);b++) {
			System.out.print("*");
		}
		System.out.println();
	}
	

	System.out.println();
	for(int e=0;e<=4;e++) {
		for(int f=4;f>=e;f--) {
			System.out.print("*");
		}
		for(int b=2;b<=((e*2)+1);b++) {
			System.out.print(" ");
		}
		for(int g=4;g>=e;g--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	int i=0,j=0,n=4,k=1;
    for(i=1; i<n+1; i++)
    {
        for(j=0; j<i; j++)
            System.out.print(" "+k++);
        System.out.println(" ");
    }
    
    
    
	
	
	
}
}

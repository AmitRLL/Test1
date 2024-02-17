package JavaLec6;

public class practice1 {
	public static void main(String[] args) {
		
	
	int no =153;
	int t1=no;
	int leng = 0; 
	
	while(t1 !=0)
	{
		t1=t1/10;
		leng = leng+1;
	}
	
	int t2=no;
	int rem;
	int arms=0;
	while(t2!=0) {
		int mult =1;
		rem =t2%10;
		for(int i=1;i<leng;i++) {
			mult=mult*rem;
		}
		arms=arms+mult;
		t2=t2/10;
	}
	if(arms==no) {
		System.out.println("no is amstrong");
	}else {
		System.out.println("no is not amstrong");
	}

}
}

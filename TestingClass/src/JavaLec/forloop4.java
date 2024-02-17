package JavaLec;

public class forloop4 {
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
			
		}
		
		System.out.println();
	    char al='A';
		for(int p=1;p<=5;p++)
		{
			//al='A';
			for(int m=1;m<=p;m++)
			{
				System.out.print(al);
				al++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		String a ="amit";
		char[] b= a.toCharArray();
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}
		
		System.out.println();
		
		String str = "w3schools";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		     break;
		    }
		   }
		  }
		  System.out.println();
		  
		  String strs = "GeeksForGeeks";
	        strs = strs.toLowerCase();
	        int count = 0;
	 
	        for (int i = 0; i < strs.length(); i++) {
	            // check if char[i] is vowel
	            if (strs.charAt(i) == 'a' || strs.charAt(i) == 'e'
	                || strs.charAt(i) == 'i'
	                || strs.charAt(i) == 'o'
	                || strs.charAt(i) == 'u') {
	                // count increments if there is vowel in
	                // char[i]
	                count++;
	            }
	        }
	 
	        // display total count of vowels in string
	        System.out.println(
	            "Total no of vowels in string are: " + count);
		
			
	}

}

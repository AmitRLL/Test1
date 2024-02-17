package JavaLec6;

import java.util.HashSet;
import java.util.Set;

public class duplicateArray {
	public static void main(String[] args) {
		//Brute force Method
		int []a= {3,5,4,3,2,2,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j])&&(i!=j))
				{
					System.out.println(a[j]+" ");
				}
			}
		}
		
		
		//Set Interface
		int []b = {3,5,4,3,2,1,3,2};
		Set<Integer> s = new HashSet<>();
		for(int no:b)
		{
			if(s.add(no) == false)
			{
				System.out.print(no+",");
			}
		}
		
		//HashTable
		
	}

}

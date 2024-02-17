package collectionsTest;

import java.util.Hashtable;
import java.util.Iterator;

public class Hashmaptest {
	public static void main(String[] args) {
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		//     (key,value)
		ht.put("first", 10);
		ht.put("third", 30);
		System.out.println(ht);//no order maintain
		System.out.println(ht.get("first"));
		
		
		 Hashtable<Integer,String> h=new Hashtable<Integer,String>();  
		  
		  h.put(0,"Amit");  
		  h.put(2,"Ravi");  
		  h.put(1,"Vijay");  
		  h.put(3,"Rahul");  
		  
		  for(int i=0;i<h.size();i++)
		  {  
		   System.out.println(h.get(i));  
		  }  
		
		
	}

}

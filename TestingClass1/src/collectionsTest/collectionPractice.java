package collectionsTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class collectionPractice {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Amit");
		al.add("Lilhare");
		al.add(28);
		System.out.println(al);
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		LinkedList ll=new LinkedList();
		ll.add("pawan");
		ll.add("Lilhare");
		ll.add(14);
		System.out.println(ll);
		
		//Set
		//HashSet
		HashSet hs =new HashSet();
		hs.add("Ujjawal");
		hs.add("Lilhare");
		hs.add(10);
		System.out.println(hs);
		//LinkeHashSet
		LinkedHashSet lhs =new LinkedHashSet();
		lhs.add("uday");
		lhs.add("Lilhare");
		lhs.add(10);
		System.out.println(lhs);
		
		//Hashmap
		HashMap hm =new HashMap();
		hm.put("Amit", 28);
		hm.put("Pawan", 15);
		hm.put("Ujjawal", 10);
		System.out.println(hm);
		System.out.println(hm.get("Amit"));
		//Hashtable
		Hashtable ht =new Hashtable();
		ht.put("Amit", 28);
		ht.put("Pawan", 15);
		ht.put("Ujjawal", 10);
		System.out.println(ht);
		
		
	}

}

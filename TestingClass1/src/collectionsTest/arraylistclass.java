package collectionsTest;

import java.util.ArrayList;
//collection is group of object. 
//example like: In a class There is collection of Student.
//              in Organization there is collection of employees.
// so collection is group of some thing.

public class arraylistclass {
	public static void main(String[] args) {
		//Delare ArraryList
		
		ArrayList al =new ArrayList();
		//List al = new ArrayList();
		//ArrayList<String> al=new ArrayList<String>();//it is Store homogeneous value;
		
		//ArrayList is a class which implement the list interface.
		//it maintain the insertion order.
		//it can allow the multiple null value.
		//it Store heterogeneous value.
		
		al.add(1);
		al.add(2);
		al.add("amit");
		al.add('a');
		al.add(12.12);
		al.add(0, 0);
		System.out.println(al);
		System.out.println(al.get(3));//fetch value from any index 
		System.out.println(al.size());
		System.out.println(al.contains("amit"));//it return boolean value.
		
		ArrayList list =new ArrayList();
		list.addAll(al);
		System.out.println(list);
		System.out.println(al.isEmpty());
		 
		
	}
	

}

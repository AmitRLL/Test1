package collectionsTest;

import java.util.LinkedList;

public class linkListTest {
	public static void main(String[] args) {
		
	LinkedList l = new LinkedList();//Heterogeneous
	LinkedList<Integer> li=new LinkedList<Integer>();//Homogeneous
	LinkedList<String> ls=new LinkedList<String>();//Homogeneous
	//LinkedList can be homogeneous and Heterogeneous.
	//linkedList is mainly use for insertion and deletion.
	//in LinkedList stored  into index and every index is divided into nodes
	//and nodes are divided into three parts.
	//liskedList maintain insertion order.
	//it allows duplicate value 
	//it allows Not null value.
	l.add("hii");
	l.add("amit");
	l.add(101);
	l.add(102);
	l.add(103);
	System.out.println(l);
	System.out.println(l.get(3));
	l.add(1, "Mr.");
	System.out.println(l);
	System.out.println(l.isEmpty());//false
	System.out.println(l.contains(103));
	
	}
}

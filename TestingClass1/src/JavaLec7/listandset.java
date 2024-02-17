package JavaLec7;

import java.util.ArrayList;

public class listandset {
	public static void main(String[] args) {
		
	
	ArrayList list = new ArrayList();
//	list.add(0, 2);
//	list.add(1, 3);
//	System.out.println(list);
//	list.add(1);
//	System.out.println(list);
	int i = 1;
	while(i<=100)
	{
		list.add(i);
		System.out.println(list);
		i++;
	}
	list.remove(49);
	System.out.println(list);
	}
}

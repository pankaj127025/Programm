package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
	public static void main(String[] args) {
		
	
	LinkedList<String> name=new LinkedList<String>();
	name.add("ankit");
	name.add("ankush");
	name.add("altaf");
	System.out.println(name);
	name.addFirst("rahul");
	System.out.println(name);
	name.addLast("ammer");
	System.out.println(name);
	name.add(3,"altaf");
	
	
	name.remove(); // remove from first position by default
	System.out.println(name);
  // to remove first -removefirst
	// to remove last -removelast
	
	
	
	for(String s:name)
	{
		System.out.println(s);
	}
	
	
	
	
	
	
	
	
	
	
}
}
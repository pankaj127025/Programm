package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reversearraylist {
	public static void main(String[] args) {
		
	List <String>mylist=new ArrayList<String>();
	//List<String> myList = new ArrayList<String>(); 
	mylist.add("AWS"); 
	mylist.add("Java"); 
	mylist.add("Python"); 
	mylist .add("Blockchain"); 
	System.out.println("Before Reversing"); 
	System.out.println(mylist); 
	Collections.reverse(mylist); 
	System.out.println("After Reversing"); 
	System.out.println(mylist); 
	} 
}



package collection;

import java.util.LinkedList;
import java.util.Stack;

public class Stackclass {
	
	public static void main(String[] args) {
		// use to do lifo operation last in first out
		// push to add
		//pop to remove [ dlt last in &  first out]
	
	Stack<String> name=new Stack<String>();
	name.push("ankit");
	name.push("ankush");
	name.push("altaf");
	System.out.println(name);
	
	
	
	
	//pop to remove [ dlt last in &  first out] [LIFO]
	name.pop();
	System.out.println(name);

}
}
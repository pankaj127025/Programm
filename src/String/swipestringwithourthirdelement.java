package String;

public class swipestringwithourthirdelement {
	public static void main(String[] args) {
		String a="hello"; String b="word";
		
		
		System.out.println("before swipping");
		System.out.println("value of a is  "+a);
		System.out.println("value of b is  "+b);
		
		System.out.println("after swpping");
		
		// aapend a and b
		a=a+b;
		
		// use substring method 
		
		
		// b become hello
		b=a.substring(0, a.length()-b.length());
		
		// for a
		a=a.substring(b.length());
		
		
		
		System.out.println("after swipping");
		System.out.println("value of a is  "+a);
		System.out.println("value of b is  "+b);
				
				
				
				
				
		
		
	}

}

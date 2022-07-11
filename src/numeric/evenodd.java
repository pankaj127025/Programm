package numeric;

import java.util.Scanner;

public class evenodd {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Type number to check its even or odd");
	int n=s.nextInt();
	
	for(int i=0;i<=n;i++)
		if(i%2==0)
			System.out.println(i+    "      number is even");
	else
		System.out.println(i    +"     number is odd");
	
	
	
	
	
	
	
}
}

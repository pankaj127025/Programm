package numeric;

import java.util.Scanner;

public class fibonacci {public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("type n1");
	int n1=s.nextInt();
	System.out.println("give the end limit");
	int v=s.nextInt();
	int n2=n1+1;
	for (int i=n1;i<=v;i++)
	{
		int n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		
				
	}
	
}

}

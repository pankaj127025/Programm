package numeric;

import java.util.Scanner;

public class aa {
	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("Print the number which you want to reverse ");
		int n=s.nextInt();
		int rem=0;
		int result=0; 
		while(n>0)
		{
			rem=n%10;
			result=result*10+rem;
			n=n/10;
		}
		System.out.println(result);
	}

}
